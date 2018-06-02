package com.neu.api;

import com.neu.api.config.SwaggerConfig;
import com.neu.api.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ WebConfig.class, SwaggerConfig.class })
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);               //Entry of Spring boot application
    }
}
