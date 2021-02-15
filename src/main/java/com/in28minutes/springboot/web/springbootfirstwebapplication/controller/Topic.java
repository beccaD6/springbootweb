package com.in28minutes.springboot.web.springbootfirstwebapplication.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

//model uses @Entity annotation
//service which manipulates model uses @Service
//controller which dpeendency injects service for use
@Entity
public class Topic {

    @Id //means primary key
    private String id;
    private String name;
    private String description;
    public Topic(){

    }
    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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
