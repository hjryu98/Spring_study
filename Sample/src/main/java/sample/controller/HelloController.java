package sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //annotation
public class HelloController {
	@RequestMapping("/") //annotation
	public String hello() {
		return "SpringBoot Hello World!";
	}
}
