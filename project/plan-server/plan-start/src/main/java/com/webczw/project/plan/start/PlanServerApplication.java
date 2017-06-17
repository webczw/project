package com.webczw.project.plan.start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@MapperScan("com.webczw.project.plan.api.dao")
@EnableDiscoveryClient
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.webczw.project.plan.**.impl","package com.webczw.project.plan.start.**.controller"})
public class PlanServerApplication 
{
    public static void main( String[] args )
    {
    	new SpringApplicationBuilder(PlanServerApplication.class).web(true).run(args);
    }
}
