package com.ws.msbank;


import com.ws.msbank.web.AccountRestJaxRS;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    //@Bean
    public ResourceConfig resourceConfig(){
        ResourceConfig jerseyServlet=new ResourceConfig();
        jerseyServlet.register(AccountRestJaxRS.class);
        return jerseyServlet;
    }
}
