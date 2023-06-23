package com.springmvc.chap05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/exam02")
public class Example02Controller { //class hierarchy
	
	@RequestMapping
	public void requestMethod() {
		System.out.println("@Controller 예제입니다.");
		System.out.println("웹 요청 URL은 /exam02입니다.");
	}
}
