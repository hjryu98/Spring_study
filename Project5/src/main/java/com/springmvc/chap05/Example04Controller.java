package com.springmvc.chap05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class Example04Controller { //class hierarchy
	
	@GetMapping("/exam04")
	public void requestMethod() {
		System.out.println("@Controller 예제입니다.");
		System.out.println("웹 요청 URL은 /home/exam04입니다.");
	}
}
