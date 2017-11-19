package com.javatpoint.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.dao.TopicService;
import com.javatpoint.dto.Topic;
@RestController 
public class TopicController {

	@Autowired  
    private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		Topic topic=new Topic();
		topic.setName("hello");
		topic.setName("test");
		//new TopicService().addTopic(topic);
		
		return topicService.getAllTopics();
		
	}
	@RequestMapping("/add")
	public void add(){
		System.out.println("add rows");
		Topic topic1=new Topic();
		topic1.setId(22L);
		topic1.setName("ok");
		topic1.setDescription("hello");
		topicService.addTopic(topic1);
		
	}
	 @RequestMapping("/hello1")  
	    public String hello(){  
	        return"Hello!1";  
	    }  
}
