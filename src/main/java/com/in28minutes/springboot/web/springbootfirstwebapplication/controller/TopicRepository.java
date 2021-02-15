package com.in28minutes.springboot.web.springbootfirstwebapplication.controller;

import org.springframework.data.repository.CrudRepository;

//data service for topic entity
//crud repo has CRUD methods already implemented
//just need to give the object type and id type.
public interface TopicRepository extends CrudRepository<Topic,String> {


}



