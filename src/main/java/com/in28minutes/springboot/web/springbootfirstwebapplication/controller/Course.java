package com.in28minutes.springboot.web.springbootfirstwebapplication.controller;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//model uses @Entity annotation
//service which manipulates model uses @Service
//controller which dpeendency injects service for use
@Entity
public class Course {

    @Id //means primary key
    private String id;
    private String name;
    private String description;

    //fk to a pk for a topic in topic table
    //many courses - one topic
    @ManyToOne
    private Topic topic;



    public Course(){

    }
    public Course(String id, String name, String description, String topicId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic= new Topic(topicId,"","");
    }
    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
