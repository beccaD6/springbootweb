package com.in28minutes.springboot.web.springbootfirstwebapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootFirstWebApplication {

	public static void main(String[] args) {

		//each class has annotation saying its purpose e.g. controller,service
		//run() sets up default config, app context, identify classes and types/purpose, start tomcat web server
		SpringApplication.run(SpringBootFirstWebApplication.class, args);
	}

}
