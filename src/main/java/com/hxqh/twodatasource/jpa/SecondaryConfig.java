package com.hxqh.twodatasource.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ocean lin on 2017/7/7.
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef="entityManagerFactorySecondary",
        transactionManagerRef="transactionManagerSecondary",
        basePackages= { "com.hxqh.twodatasource.repository.second" }) //设置Repository所在位置
public class SecondaryConfig {

    @Autowired
    @Qualifier("secondaryDataSource")
    private DataSource secondaryDataSource;

    @Autowired
    private JpaProperties jpaProperties;

    @Bean(name = "entityManagerSecondary")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactorySecondary(builder).getObject().createEntityManager();
    }


    @Bean(name = "entityManagerFactorySecondary")
    public LocalContainerEntityManagerFactoryBean entityManagerFactorySecondary (EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(secondaryDataSource)
                .properties(getVendorProperties(secondaryDataSource))
                .packages("com.hxqh.twodatasource.repository.second") //设置实体类所在位置
                .persistenceUnit("mysqlPU")
                .build();
    }


    private Map<String, String> getVendorProperties(DataSource dataSource) {
        Map<String, String> properties = new HashMap<>();
//        properties.put("hibernate.hbm2ddl.auto","update");
        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
        properties.put("hibernate.show_sql", "fasle");
        properties.put("hibernate.temp.use_jdbc_metadata_defaults", "false");

        properties.put("hibernate.temp.use_jdbc_metadata_defaults", "false");




//        properties.put("validationInterval","30000");
//        properties.put("timeBetweenEvictionRunsMillis ","30000");
//        properties.put("maxActive","200");
//        properties.put("minIdle","10");
//        properties.put("maxWait","30000");
//        properties.put("initialSize","200");
//        properties.put("removeAbandonedTimeout","120");
//        properties.put("removeAbandoned","true");
//        properties.put("logAbandoned","false");
//        properties.put("minEvictableIdleTimeMillis","30000");

        jpaProperties.setProperties(properties);
        return jpaProperties.getHibernateProperties(dataSource);
    }

    @Bean(name = "transactionManagerSecondary")
    PlatformTransactionManager transactionManagerSecondary(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactorySecondary(builder).getObject());
    }

}
