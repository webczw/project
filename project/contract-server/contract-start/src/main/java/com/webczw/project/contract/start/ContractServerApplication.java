package com.webczw.project.contract.start;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ContractServerApplication 
{
    public static void main( String[] args )
    {
    	new SpringApplicationBuilder(ContractServerApplication.class).web(true).run(args);
    }
}
