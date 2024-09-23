package com.saas.SAAS_APP_BACKEND.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "com.saas.SAAS_APP_BACKEND.repository.GYM", // Repositorios de la base de datos GYM
        entityManagerFactoryRef = "gymEntityManagerFactory",
        transactionManagerRef = "gymTransactionManager"
)
public class GymDataSourceConfig {
    @Primary
    @Bean(name = "gymDataSource")
    @ConfigurationProperties("spring.datasource.gym")
    public DataSource gymDataSource() {
        return gymDataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean(name = "gymEntityManagerFactory")
    @Primary
    public LocalContainerEntityManagerFactoryBean gymEntityManagerFactory(
            EntityManagerFactoryBuilder builder, @Qualifier("gymDataSource") DataSource gymDataSource) {
        return builder
                .dataSource(gymDataSource)
                .packages("com.saas.SAAS_APP_BACKEND.entity.GYM") // Entidades para la base de datos GYM
                .persistenceUnit("gym")
                .build();
    }

    @Primary
    @Bean(name = "gymTransactionManager")
    public PlatformTransactionManager gymTransactionManager(
            @Qualifier("gymEntityManagerFactory") EntityManagerFactory gymEntityManagerFactory) {
        return new JpaTransactionManager(gymEntityManagerFactory);
    }

    @Bean
    @ConfigurationProperties("spring.datasource.gym")
    public DataSourceProperties gymDataSourceProperties() {
        return new DataSourceProperties();
    }
}