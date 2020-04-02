package com.study.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author ：lixiang
 * @version ：v1.0
 * @program ：spring-swagger2
 * @date ：2020/4/2 16:29
 * @description ：
 */
@Configuration
//@EnableSwagger2
public class SwaggerConfig {
    /**
     * 创建一个Docket对象
     * 调用select()方法，
     * 生成ApiSelectorBuilder对象实例，该对象负责定义外漏的API入口
     * 通过使用RequestHandlerSelectors和PathSelectors来提供Predicate，在此我们使用any()方法，将所有API都通过Swagger进行文档管理
     * 如果不想将所有的接口都通过swagger管理的话，可以将RequestHandlerSelectors.any()修改为RequestHandlerSelectors.basePackage()
     * <p>
     * 访问地址：http://ip:port/doc.html#/home
     *
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.study.swagger.controller"))
//                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //标题
                .title("Project Title")
                //简介
                .description("description")
                //服务条款
                .termsOfServiceUrl("www.baidu.com")
                //作者个人信息
                .contact(new Contact("小小程序员", "http://www.baidu.com", "691262730@qq.com"))
                //版本
                .version("version")
                .build();
    }
}
