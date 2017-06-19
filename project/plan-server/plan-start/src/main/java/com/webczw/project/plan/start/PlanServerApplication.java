package com.webczw.project.plan.start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Configuration
@MapperScan("com.webczw.project.plan.api.dao")
@EnableDiscoveryClient
@SpringBootApplication
@EnableAutoConfiguration
@EnableSwagger2
@ServletComponentScan
@ComponentScan(basePackages={"com.webczw.project.plan.**.impl","com.webczw.project.plan.start.**.controller","com.webczw.project.plan.**.filter","com.webczw.project.plan.**.servlet","com.webczw.project.plan.**.config"})
public class PlanServerApplication 
{
    public static void main( String[] args )
    {
    	new SpringApplicationBuilder(PlanServerApplication.class).web(true).run(args);
    }
    
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.webczw.project.plan.start.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Plan Server RESTful APIs")
                .description("计划服务API文档")
                .termsOfServiceUrl("http://www.webczw.com/")
                .contact(new Contact("webczw","http://www.webczw.com/","webczw@163.com"))
                .version("1.0")
                .build();
    }
    
}
