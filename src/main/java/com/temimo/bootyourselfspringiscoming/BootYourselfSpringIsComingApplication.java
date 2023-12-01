package com.temimo.bootyourselfspringiscoming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootYourselfSpringIsComingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(BootYourselfSpringIsComingApplication.class, args);
		run.getBeanFactory();
	}

}
