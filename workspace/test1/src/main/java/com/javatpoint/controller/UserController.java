package com.javatpoint.controller;
  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RestController;  

import com.javatpoint.UserRecord;
import com.javatpoint.dao.UserService;

import java.util.List;  
import java.util.Optional;  
@RestController  
public class UserController {  
    @Autowired  
    private UserService userService;   
    @RequestMapping("/")  
    public List<UserRecord> getAllUser(){  
        return userService.getAllUsers();  
    }     
    @RequestMapping(value="/add-user", method=RequestMethod.POST)  
    public void addUser(@RequestBody UserRecord userRecord){  
    	UserRecord ur=new UserRecord();
    	ur.setId(1);
    	ur.setName("pratik");
    	ur.setEmail("pratik@gmail.com");
        userService.addUser(userRecord);  
    }  
   
    @RequestMapping("/test12")  
    public void addUser(){  
    	UserRecord ur=new UserRecord();
    	ur.setId(1);
    	ur.setName("pratik");
    	ur.setEmail("pratik@gmail.com");
        userService.addUser(ur);  
    }  
    @RequestMapping(value="/user/{id}", method=RequestMethod.GET)  
    public UserRecord getUser(@PathVariable String id){  
        return userService.getUser(id);  
    }  

}  