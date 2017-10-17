package com.coding.dayapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableAutoConfiguration
@Component("com.coding.dayapi")
public class DayapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DayapiApplication.class, args);
	}
}
