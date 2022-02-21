package com.smartcntmgr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.smartcntmgr.*")
public class SmartContactManagerApplication{  

	public static void main(String[] args) {
		SpringApplication.run(SmartContactManagerApplication.class, args);
	}

}
