package com.jia.company.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@MapperScan("com.jia.company.mapper")
public class MybatisPlusConfig {

//    分页插件
    @Bean   // 使用@Bean 注解表明myBean需要交给Spring进行管理  // 未指定bean 的名称，默认采用的是 "方法名" + "首字母小写"的配置方式
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }
}
