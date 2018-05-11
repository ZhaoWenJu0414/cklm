package com.cklm;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class DruidConfiguration {
        @Bean
        public ServletRegistrationBean statViewServlet(){
            //创建Servlet注册实体
            ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
            //设置IP白名单
            servletRegistrationBean.addInitParameter("allow","");
            //设置IP黑名单
            servletRegistrationBean.addInitParameter("deny","");
            servletRegistrationBean.addInitParameter("loginUsername","druid");
            servletRegistrationBean.addInitParameter("loginPassword","123456");
            servletRegistrationBean.addInitParameter("resetEnable","false");
            return servletRegistrationBean;
        }

        @Bean
        public FilterRegistrationBean statFilter(){
            FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
            //设置过滤器路径
            filterRegistrationBean.addUrlPatterns("/*");
            filterRegistrationBean.addInitParameter("exclusions",".js,.gif,.jpg,/druid/*");
            return filterRegistrationBean;
        }

    @Value("${spring.datasource.url}")
    private String dbUrl;
    @Value("${spring.datasource.data-username}")
    private String username;
    @Value("${spring.datasource.data-password}")
    private String password;
    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;
    @Value("${spring.datasource.tomcat.initial-size}")
    private int initialSize;
    @Value("${spring.datasource.tomcat.minldle}")
    private int minIdle;
    @Value("${spring.datasource.tomcat.max-active}")
    private int maxActive;
    @Value("${spring.datasource.tomcat.max-wait}")
    private int maxWait;
    @Value("${spring.datasource.tomcat.timeBetweenEvictionRunsMillis}")
    private int timeBetweenEvictionRunsMillis;
    @Value("${spring.datasource.tomcat.minEvictableIdleTimeMillis}")
    private int minEvictableIdleTimeMillis;
    @Value("${spring.datasource.tomcat.validationQuery}")
    private String validationQuery;
    @Value("${spring.datasource.tomcat.test-while-idle}")
    private boolean testWhileIdle;
    @Value("${spring.datasource.tomcat.test-on-borrow}")
    private boolean testOnBorrow;
    @Value("${spring.datasource.tomcat.test-on-return}")
    private boolean testOnReturn;
    @Value("${spring.datasource.tomcat.poolPreparedStatements}")
    private boolean poolPreparedStatements;
    @Value("${spring.datasource.tomcat.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;
    @Value("${spring.datasource.filters}")
    private String filters;
    @Value("${spring.datasource.tomcat.connection-properties}")
    private String connectionProperties;


    @Bean     //声明其为Bean实例
    @Primary  //在同样的DataSource中，首先使用被标注的DataSource
    public DataSource dataSource(){
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(this.dbUrl);
        datasource.setUsername(username);
        datasource.setPassword(password);
        datasource.setDriverClassName(driverClassName);

        //configuration
        datasource.setInitialSize(initialSize);
        datasource.setMinIdle(minIdle);
        datasource.setMaxActive(maxActive);
        datasource.setMaxWait(maxWait);
        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        datasource.setValidationQuery(validationQuery);
        datasource.setTestWhileIdle(testWhileIdle);
        datasource.setTestOnBorrow(testOnBorrow);
        datasource.setTestOnReturn(testOnReturn);
        datasource.setPoolPreparedStatements(poolPreparedStatements);
        datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);

        try {
            datasource.setFilters(filters);
        } catch (SQLException e) {
            System.err.println("druid configuration initialization filter: "+ e);
        }
        datasource.setConnectionProperties(connectionProperties);
        return datasource;
    }





}
