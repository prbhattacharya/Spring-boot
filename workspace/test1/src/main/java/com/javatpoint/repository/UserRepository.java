package com.javatpoint.repository;

import org.springframework.data.repository.CrudRepository;  

import com.javatpoint.UserRecord;
public interface UserRepository extends CrudRepository<UserRecord, String> {  
}  