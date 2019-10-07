package com.example.spring.data.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.persistenceunit.DefaultPersistenceUnitManager;
import org.springframework.orm.jpa.persistenceunit.PersistenceUnitManager;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean(name = "dataSources")
    public Map<String, DataSource> dataSources(DataSource dataSourceHSQL, DataSource dataSourceDERBY) {
        Map<String, DataSource> dataSources = new HashMap<>();
        dataSources.put("dataSourceHSQL", dataSourceHSQL);
        dataSources.put("dataSourceDERBY", dataSourceDERBY);
        return dataSources;
    }

    @Bean
    public CommandLineRunner demo(DemoService service) {
        return args -> {
            System.out.println("Hello World!!");
            service.service1();
        };
    }

    @Bean(name = "jpaProperties")
    public Map<String, ?> jpaProperties() {
        Map<String, ?> jpaProperties = new HashMap<>();
        return jpaProperties;
    }

    @Bean
    public PersistenceUnitManager persistenceUnitManager(Map<String, DataSource> theDataSources) {
        DefaultPersistenceUnitManager result = new DefaultPersistenceUnitManager();
        result.setDataSources(theDataSources);
        return result;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        return new HibernateJpaVendorAdapter();
    }

    @Bean
    public EntityManagerFactoryBuilder entityManagerFactoryBuilder(JpaVendorAdapter theJpaVendorAdapter, @Qualifier("jpaProperties") Map<String, ?> theJpaProperties, PersistenceUnitManager thePersistenceUnitManager) {
        return new EntityManagerFactoryBuilder(theJpaVendorAdapter, theJpaProperties, thePersistenceUnitManager);
    }

}
