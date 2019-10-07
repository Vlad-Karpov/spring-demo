package com.example.spring.data.example.ds1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.persistenceunit.PersistenceUnitManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(entityManagerFactoryRef="entityManagerFactoryDs1", basePackages = { "com.example.spring.data.example.ds1.repository" })
@EnableTransactionManagement
public class Ds1Conf {

    @Bean(name = "entityManagerFactoryDs1")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryDs1(
            EntityManagerFactoryBuilder builder,
            PersistenceUnitManager thePersistenceUnitManager,
            @Qualifier("dataSourceHSQL") DataSource dataSource
    ) {
        return builder
                .dataSource(dataSource)
                .packages("com.example.spring.data.example.ds1.repository")
                .persistenceUnit("ds1HSQL")
                .build();
    }

    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager(@Qualifier("entityManagerFactoryDs1") EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(entityManagerFactory);
        return txManager;
    }

    @Bean
    public DataSource dataSourceHSQL() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        return builder
                .setType(EmbeddedDatabaseType.HSQL)
                .build();
    }

}
