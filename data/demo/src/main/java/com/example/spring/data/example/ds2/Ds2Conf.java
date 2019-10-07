package com.example.spring.data.example.ds2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactoryDs2", basePackages = {"com.example.spring.data.example.ds2.repository"})
@EnableTransactionManagement
public class Ds2Conf {

    @Bean(name = "entityManagerFactoryDs2")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryDs2(
            EntityManagerFactoryBuilder builder,
            @Qualifier("dataSourceDERBY") DataSource dataSource
    ) {
        return builder
                .dataSource(dataSource)
                .packages("com.example.spring.data.example.ds2.repository")
                .persistenceUnit("ds2DERBY")
                .build();
    }

    @Bean(name = "transactionManagerDs2")
    public PlatformTransactionManager transactionManager(@Qualifier("entityManagerFactoryDs2") EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(entityManagerFactory);
        return txManager;
    }

    @Bean
    public DataSource dataSourceDERBY() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        return builder.setType(EmbeddedDatabaseType.DERBY).build();
    }

}
