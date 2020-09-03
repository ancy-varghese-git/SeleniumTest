package com.ann.casestudyone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CasestudyoneApplication {
	private static final Logger log = LoggerFactory.getLogger(CasestudyoneApplication.class);

	public static void main(String[] args) {
		log.info("Main method has been invoked");
		SpringApplication.run(CasestudyoneApplication.class, args);
	}

}
