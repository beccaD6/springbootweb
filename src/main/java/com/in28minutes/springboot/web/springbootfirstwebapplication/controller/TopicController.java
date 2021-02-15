package com.in28minutes.springboot.web.springbootfirstwebapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    //autowire marks for dependency injection
    @Autowired
    //THIS SERVICE gives us the list of topics in our db currently
    private TopicService topicService;


    @GetMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();

    }

    //get specific topic
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable("id") String id){
        return topicService.getTopic(id).get();
    }

    //post
    @RequestMapping(value="/topics", method=RequestMethod.POST)
    //get request payload and convert from json to Topic object
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    //put
    @RequestMapping(value="/topics/{id}", method=RequestMethod.PUT)
    //get request payload and convert from json to Topic object
    public void addTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(id,topic);
    }

    //delete
    @RequestMapping(value="/topics/{id}", method=RequestMethod.DELETE)
    //get request payload and convert from json to Topic object
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
