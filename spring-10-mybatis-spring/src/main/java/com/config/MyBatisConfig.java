package com.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBatisConfig {
  /*  @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource());
        return factoryBean.getObject();
    }

    *//**
     * 创建数据源对象
     * @return
     *//*
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/mybatis?useUnicode=true;characterEncoding=UTF-8");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }
    @Bean
    public UserMapper userMapper() throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
        return sqlSessionTemplate.getMapper(UserMapper.class);
    }*/

}
