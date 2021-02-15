package com.in28minutes.springboot.web.springbootfirstwebapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//just one instance of this service is created automatically and it is injected into controllers that define it
//as a member variable
@Service
public class CourseService {


    //interface for CRUD ops on database
    @Autowired
    private CourseRepository courseRepository;


    public List<Course> getAllCourses(String topicId){
        List<Course> courses= new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }

    public Optional<Course> getCourse(String id){

        return courseRepository.findById(id);
    }

    public void addCourse(Course course){
        courseRepository.save(course);
    }

    public void updateCourse(String id,Course course){
        //save will overwrite same pk instance
        courseRepository.save(course);
    }

    public void deleteCourse(String id){
        courseRepository.deleteById(id);
    }

}
