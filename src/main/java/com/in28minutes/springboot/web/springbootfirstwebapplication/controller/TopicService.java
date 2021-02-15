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
public class TopicService {


    //interface for CRUD ops on database
    @Autowired
    private TopicRepository topicRepository;

    //not Arrays.asList creates an IMMUTABLE list, to make it editable we need to make a new array list
    //        private List<Topic> topics =  new ArrayList<Topic>(Arrays.asList(
    //                new Topic("spring", "spring framework","desc"),
    //                new Topic("java", "java framework","desc"),
    //                new Topic("js", "js framework","desc")
    //        ));

    public List<Topic> getAllTopics(){
        //we don't have to amnually connect to db! spring does it for us
         List<Topic> topics= new ArrayList<>();
         topicRepository.findAll().forEach(topics::add);
         return topics;
    }

    public Optional<Topic> getTopic(String id){
       return topicRepository.findById(id);
    }

    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void updateTopic(String id,Topic topic){
        //save will overwrite same pk instance
       topicRepository.save(topic);
    }

    public void deleteTopic(String id){
       topicRepository.deleteById(id);
    }

}
