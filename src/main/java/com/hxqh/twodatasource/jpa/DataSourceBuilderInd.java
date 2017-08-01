package com.hxqh.twodatasource.jpa;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.bind.RelaxedDataBinder;
import org.springframework.boot.jdbc.DatabaseDriver;
import org.springframework.util.ClassUtils;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ocean lin on 2017/7/31.
 */
public class DataSourceBuilderInd {

    private static final String[] DATA_SOURCE_TYPE_NAMES = new String[]{"org.apache.commons.dbcp2.BasicDataSource"};

    private Class<? extends DataSource> type;

    private ClassLoader classLoader;

    private Map<String, String> properties = new HashMap<>();


    public static DataSourceBuilderInd create() {
        return new DataSourceBuilderInd(null);
    }

    public static DataSourceBuilderInd create(ClassLoader classLoader) {
        return new DataSourceBuilderInd(classLoader);
    }

    public DataSourceBuilderInd(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    public DataSource build() {
        Class<? extends DataSource> type = getType();
        DataSource result = BeanUtils.instantiate(type);
        maybeGetDriverClassName();
        bind(result);
        return result;
    }

    private void maybeGetDriverClassName() {
        if (!this.properties.containsKey("driverClassName")
                && this.properties.containsKey("url")) {
            String url = this.properties.get("url");
            String driverClass = DatabaseDriver.fromJdbcUrl(url).getDriverClassName();
            this.properties.put("driverClassName", driverClass);
        }
    }

    private void bind(DataSource result) {

        properties.put("initialSize","10");
        properties.put("maxIdle","10");
        properties.put("minIdle","5");
        properties.put("maxActive","15");
        properties.put("removeAbandoned","true");
        properties.put("removeAbandonedTimeout","180");
        properties.put("maxWait","3000");
        properties.put("removeAbandonedOnBorrow","true");

        MutablePropertyValues properties = new MutablePropertyValues(this.properties);
        new RelaxedDataBinder(result).withAlias("url", "jdbcUrl")
                .withAlias("username", "user").bind(properties);
    }

    public DataSourceBuilderInd type(Class<? extends DataSource> type) {
        this.type = type;
        return this;
    }

    public DataSourceBuilderInd url(String url) {
        this.properties.put("url", url);
        return this;
    }

    public DataSourceBuilderInd driverClassName(String driverClassName) {
        this.properties.put("driverClassName", driverClassName);
        return this;
    }

    public DataSourceBuilderInd username(String username) {
        this.properties.put("username", username);
        return this;
    }

    public DataSourceBuilderInd password(String password) {
        this.properties.put("password", password);
        return this;
    }

    @SuppressWarnings("unchecked")
    public Class<? extends DataSource> findType() {
        if (this.type != null) {
            return this.type;
        }
        for (String name : DATA_SOURCE_TYPE_NAMES) {
            try {
                return (Class<? extends DataSource>) ClassUtils.forName(name,
                        this.classLoader);
            } catch (Exception ex) {
                // Swallow and continue
            }
        }
        return null;
    }

    private Class<? extends DataSource> getType() {
        Class<? extends DataSource> type = findType();
        if (type != null) {
            return type;
        }
        throw new IllegalStateException("No supported DataSource type found");
    }
}
