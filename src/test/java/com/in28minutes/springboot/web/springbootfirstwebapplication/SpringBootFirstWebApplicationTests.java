package com.in28minutes.springboot.web.springbootfirstwebapplication;

import com.in28minutes.springboot.web.springbootfirstwebapplication.controller.Topic;
import com.in28minutes.springboot.web.springbootfirstwebapplication.controller.TopicController;
import com.in28minutes.springboot.web.springbootfirstwebapplication.controller.TopicService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
class SpringBootFirstWebApplicationTests {
	@Mock
	TopicService topicServiceMock;
	//same as DataService mock =mock(DataService.class); in each test

	@InjectMocks
	TopicController topicController;

	@Test
	void test1() {
		List<Topic> data = Arrays.asList(new Topic("py","python"," a desc"));
		when(topicServiceMock.getAllTopics()).thenReturn(data);
		assertEquals(data, topicController.getAllTopics());
	}
	@Test
	void test2() {
	}


}
