package com.haige.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @className: com.haige.config-> SwaggerConfig
 * @description:
 * @author: cqh
 * @createDate: 2021-06-15 20:43
 * @version: 1.0
 * @todo:
 */

@Configuration
public class SwaggerConfig {

    // 配置Swagger的Docket的Bean实例
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // RequestHandlerSelectors 配置要扫描的方式 basePackage 指定要扫描的包
                .apis(RequestHandlerSelectors.basePackage("com.haige.controller"))
                // 过滤haige下的路径
                //  .paths(PathSelectors.ant("/haige/**"))
                .build();
    }

    // 配置Swagger信息 apiInfo
    private ApiInfo apiInfo(){

        // 作者信息
        Contact contact = new Contact("海鸽", "", "");

        return new ApiInfo("海鸽的SwaggerAPI文档",
                "打工人",
                "1.0",
                "urn:tos",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());

    }
}
