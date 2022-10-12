
package com.sh.springbootapi.repository;

import com.google.common.base.Preconditions;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.*;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;


import javax.sql.DataSource;
import java.util.HashMap;


/**
 * By default, the persistence-multiple-db.properties file is read for
 * non auto configuration in PersistenceProductConfiguration.
 * <p>
 * If we need to use persistence-multiple-db-boot.properties and auto configuration
 * then uncomment the below @Configuration class and comment out PersistenceProductConfiguration.
 */

@Configuration
@EnableJpaRepositories(basePackages = "com.sh.springbootapi.repository", entityManagerFactoryRef = "productEntityManager", transactionManagerRef = "productTransactionManager")
//@Profile("!tc")
public class PersistenceConfig {
    @Autowired
    private Environment env;

    public PersistenceConfig() {
        super();
    }

    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean productEntityManager() {
        final LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource());
        em.setPackagesToScan("com.sh.springbootapi.repository.entity");
        final HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        final HashMap<String, Object> properties = new HashMap<String, Object>();
//        properties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
//        properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
//        properties.put("spring.jpa.show-sql",env.getProperty("spring.enterprise-api.jpa.show-sql"));
//        properties.put("hibernate.jdbc.lob.non_contextual_creation", env.getProperty("spring.enterprise-api.jpa.properties.hibernate.jdbc.lob.non_contextual_creation"));
//        properties.put("hibernate.dialect", env.getProperty("spring.enterprise-api.jpa.properties.hibernate.dialect"));


        properties.put("hibernate.hbm2ddl.auto", env.getProperty("spring.enterprise-api.jpa.hibernate.ddl-auto"));
        properties.put("hibernate.dialect", env.getProperty("spring.enterprise-api.jpa.properties.hibernate.dialect"));
        properties.put("hibernate.current_session_context_class", env.getProperty("spring.enterprise-api.jpa.properties.hibernate.current_session_context_class"));
        properties.put("hibernate.jdbc.lob.non_contextual_creation", env.getProperty("spring.enterprise-api.jpa.properties.hibernate.jdbc.lob.non_contextual_creation"));
        properties.put("hibernate.show_sql", env.getProperty("spring.enterprise-api.jpa.show-sql"));
        properties.put("hibernate.format_sql", env.getProperty("spring.enterprise-api.jpa.properties.hibernate.format_sql"));

        em.setJpaPropertyMap(properties);
        return em;
    }

    @Bean
    @Primary
    @ConfigurationProperties(prefix="spring.enterprise-api.datasource")
    public DataSource dataSource() {
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(Preconditions.checkNotNull(env.getProperty("spring.enterprise-api.datasource.driverClassName")));
        dataSource.setUrl(Preconditions.checkNotNull(env.getProperty("spring.enterprise-api.datasource.jdbcUrl")));
        dataSource.setUsername(Preconditions.checkNotNull(env.getProperty("spring.enterprise-api.datasource.username")));
        dataSource.setPassword(Preconditions.checkNotNull(env.getProperty("spring.enterprise-api.datasource.password")));
        return DataSourceBuilder.create().build();
    }

    @Bean
    @Primary
    public PlatformTransactionManager productTransactionManager() {
        final JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(productEntityManager().getObject());
        return transactionManager;
    }

}

