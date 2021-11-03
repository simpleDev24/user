package com.simpledev.user.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simpledev.user.service.AnswerApi;
import com.simpledev.user.service.AnswerService;
import com.simpledev.user.service.QuestionService;

@RestController
public class UserApi {
	
	@Autowired
	QuestionService questionService;
	
	@Autowired
	AnswerService answerService;
	
	@GetMapping("/test")
	public String test() {
		return questionService.getQuestion() + " -- "+ answerService.getAnswer();
	}

}
