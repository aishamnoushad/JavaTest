package com.aisha.javaTestBackend;

import org.springframework.boot.SpringApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin("http://localhost:4200")
public class JavaTestBackendApplication {
	 private static final Logger logger = LoggerFactory.getLogger(JavaTestBackendApplication.class);
	public static void main(String[] args) {
		logger.info("this is a info message");
	      logger.warn("this is a warn message");
	      logger.error("this is a error message");
		SpringApplication.run(JavaTestBackendApplication.class, args);
	}

}
