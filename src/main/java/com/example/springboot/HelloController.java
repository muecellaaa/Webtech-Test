package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
	@Autowired
	private Environment env;

	@RequestMapping("/")
	public String index() {
		return env.getProperty("JDBC_DATABASE_URL");
	}

}
