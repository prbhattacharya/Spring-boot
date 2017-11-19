package com.javatpoint.repository;

import org.springframework.data.repository.CrudRepository;

import com.javatpoint.dto.Topic;

public interface TopicRepository extends CrudRepository<Topic,String> {

}
