package com.in28minutes.springboot.web.springbootfirstwebapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    //autowire marks for dependency injection
    @Autowired
    //THIS SERVICE gives us the list of courses in our db currently
    private CourseService courseService;


    //get all courses for a topic
    @GetMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id){
        return courseService.getAllCourses(id);

    }

    //get specific course
    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable("id") String id){
        return courseService.getCourse(id).get();
    }

    //post
    @RequestMapping(value="/topics/{topicId}/courses", method=RequestMethod.POST)
    //get request payload and convert from json to Course object
    public void addCourse(@RequestBody Course course, @PathVariable String topicId){
        course.setTopic(new Topic(topicId,"",""));
        courseService.addCourse(course);
    }

    //put
    @RequestMapping(value="/topics/{topicId}/courses/{id}", method=RequestMethod.PUT)
    //get request payload and convert from json to Course object
    public void updateCourse(@RequestBody Course course, @PathVariable String topicId,@PathVariable String id){
        course.setTopic(new Topic(topicId,"",""));
        courseService.updateCourse(id,course);
    }

    //delete
    @RequestMapping(value="/topics/{topicId}/courses/{id}", method=RequestMethod.DELETE)
    //get request payload and convert from json to Course object
    public void deleteCourse(@PathVariable String id){
        courseService.deleteCourse(id);
    }
}
