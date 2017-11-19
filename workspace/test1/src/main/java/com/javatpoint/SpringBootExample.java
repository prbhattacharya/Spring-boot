package com.javatpoint;  
  
import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;  
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
  
@SpringBootApplication  
public class SpringBootExample {  
    public static void main(String[] args) {  
      
        SpringApplication.run(SpringBootExample.class, args);  
    } 
    
}  