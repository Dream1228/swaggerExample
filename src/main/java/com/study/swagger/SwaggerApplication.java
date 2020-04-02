package com.study.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author ：lixiang
 * @version ：v1.0
 * @program ：spring-swagger2
 * @date ：2020/4/2 16:21
 * @description ：
 */
@SpringBootApplication
@EnableSwagger2
public class SwaggerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SwaggerApplication.class, args);
    }
}
