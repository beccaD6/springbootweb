package com.in28minutes.springboot.web.springbootfirstwebapplication.controller;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

//data service for topic entity
//crud repo has CRUD methods already implemented
//just need to give the object type and id type.
public interface CourseRepository extends CrudRepository<Course,String> {

    //auto generates filter by Topic field of a Course and then id field of that Topic
    public List<Course> findByTopicId(String id);


}



