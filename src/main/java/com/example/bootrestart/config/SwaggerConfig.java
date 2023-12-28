package com.example.bootrestart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
* 配置restful
* */
@Configuration
@EnableSwagger2//启用swagger2功能  http://localhost:8080/swagger-ui.html
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.bootrestart.controller"))
                .paths(PathSelectors.any()).build();
    }


    /*
    * 此处用于api文档页面显示
    * */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("接口文档")//标题
                .description("接口文档")//描述
                .version("1.0.0")//版本
                .build();
    }
}
