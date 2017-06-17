package com.webczw.project.plan.start;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PlanServerApplication 
{
    public static void main( String[] args )
    {
    	new SpringApplicationBuilder(PlanServerApplication.class).web(true).run(args);
    }
}
