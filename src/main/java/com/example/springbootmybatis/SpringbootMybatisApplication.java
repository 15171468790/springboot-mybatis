package com.example.springbootmybatis;

import com.example.springbootmybatis.wang.service.Test12;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 测试链接mysql数据库，使用XML版mybatis
 * 优点：面向sql，让代码与sql解耦，便于测试
 * 实用于比较复杂的业务，动态sql
 *
 *
 * 缺点：需要编写大量，对于不同的数据库可移植性差
 *
 * orm框架的优点：减少大量重复代码，简化了Java对象持久化到数据库的操作
 * 1.XML版  成功   注意：mapper配置文件如果不再resource目录下，则
 * 需要在pom中声明打包，不然XML文件不会打包到classpath路径下，默认只打包class文件
 * 2.注解版
 */
@SpringBootApplication
@MapperScan("com.example.springbootmybatis.wang.mapper")
public class SpringbootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication();
        ConfigurableApplicationContext configurableApplicationContext
                = springApplication.run(SpringbootMybatisApplication.class,args);
        Test12 test12 = configurableApplicationContext.getBean(Test12.class);
        test12.test1();
       // SpringApplication.run(SpringbootMybatisApplication.class, args);
    }

}
