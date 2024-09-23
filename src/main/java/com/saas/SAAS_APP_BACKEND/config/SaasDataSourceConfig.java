package com.saas.SAAS_APP_BACKEND.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableJpaRepositories(
        basePackages = "com.saas.SAAS_APP_BACKEND.repository.SAAS_APP", 
        entityManagerFactoryRef = "saasEntityManagerFactory",
        transactionManagerRef = "saasTransactionManager"
)
public class SaasDataSourceConfig {

    @Bean(name = "saasDataSource")
    @ConfigurationProperties("spring.datasource.saas")
    public DataSource saasDataSource() {
        return saasDataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean(name = "saasEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean saasEntityManagerFactory(
            EntityManagerFactoryBuilder builder, @Qualifier("saasDataSource") DataSource saasDataSource) {
        return builder
                .dataSource(saasDataSource)
                .packages("com.saas.SAAS_APP_BACKEND.entity.SAAS_APP") 
                .persistenceUnit("saas")
                .build();
    }

    @Bean(name = "saasTransactionManager")
    public PlatformTransactionManager saasTransactionManager(
            @Qualifier("saasEntityManagerFactory") EntityManagerFactory saasEntityManagerFactory) {
        return new JpaTransactionManager(saasEntityManagerFactory);
    }

    @Bean
    @ConfigurationProperties("spring.datasource.saas")
    public DataSourceProperties saasDataSourceProperties() {
        return new DataSourceProperties();
    }
}