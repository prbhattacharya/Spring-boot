package com.javatpoint.dao;


import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatpoint.dto.Topic;
import com.javatpoint.repository.TopicRepository;

@Service 
public class TopicService {


    private static Logger logger = Logger.getLogger(TopicService.class);
	
    @Autowired  
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics(){
		List<Topic> topics=new ArrayList<>();
		try{
		
		topicRepository.findAll().forEach(topics::add);
		}
		catch(Exception e){
			logger.error(e);
		}
		return topics;
	}
	
	public void addTopic(Topic topic){
		
		topicRepository.save(topic);
	}
	
}
