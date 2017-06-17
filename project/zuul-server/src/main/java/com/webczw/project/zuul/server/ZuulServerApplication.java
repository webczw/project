package com.webczw.project.zuul.server;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.webczw.project.zuul.server.filter.AccessFilter;

@EnableZuulProxy
@SpringCloudApplication
public class ZuulServerApplication 
{
    public static void main( String[] args )
    {
    	new SpringApplicationBuilder(ZuulServerApplication.class).web(true).run(args);
    }
    
    @Bean
    public AccessFilter accessFilter(){
    	return new AccessFilter();
    }
}
