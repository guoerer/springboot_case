package com.atguigu;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/*
@SpringBootConfiguration（springboot提供）:相当于@Configuration（spring提供）注解的作用，声明配置类（等价于xml配给文件）
@EnableAutoConfiguration 启动自动配置。框架提供了大量的配置类，配置类会根据依赖启动器进行条件注解判断，决定是否生效。
@ComponentScan 扫描包的配置。默认扫描主程序所在的包和子包
@ComponentScan（“com.atguigu.xxx”） 一般不推荐自己配置（约定》配置）
 */
@SpringBootApplication
@MapperScan(basePackages ="com.atguigu.dao" ) //mapper存放的位置
@EnableTransactionManagement //开启声明式事务
public class Application {
    public static void main(String[] args) {
        //启动服务器,启动springboot中内置的Tomcat服务器
        SpringApplication.run(Application.class,args);
    }
}

