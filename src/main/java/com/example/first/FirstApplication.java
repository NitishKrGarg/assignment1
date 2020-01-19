package com.example.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {

		SpringApplication.run(FirstApplication.class, args);


	}

	@RequestMapping("/hello")
	public String generate_result()
	{
		Match_Controller ob = new Match_Controller();

		String result = ob.start();
		return result;
	}


}
