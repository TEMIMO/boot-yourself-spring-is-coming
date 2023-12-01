package com.temimo.bootyourselfspringiscoming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootYourselfSpringIsComingApplication {

//  Так лучше не делать, ибо бин создается с именем метода, и можем перезатереть то что приходит из стартера,
//  либо могут поменять название бина, и будет уже 2 бина, а мы расчитывали на один, нужно использовать Primary и т.д.
//	@Bean
//	public MyRavenListener ravenListener() {
//		return new MyRavenListener();
//	}

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(BootYourselfSpringIsComingApplication.class, args);
		run.getBeanFactory();
	}

}
