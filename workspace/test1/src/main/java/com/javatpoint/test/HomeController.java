package com.javatpoint.test;  
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  

import com.javatpoint.dao.TopicService;
import com.javatpoint.dto.Topic;
@RestController  
public class HomeController {  
    @RequestMapping("/hello")  
    public String hello(){  
        return"Hello!";  
    }  
    
}  