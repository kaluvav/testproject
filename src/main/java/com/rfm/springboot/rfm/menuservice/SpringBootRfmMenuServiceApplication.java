package com.rfm.springboot.rfm.menuservice;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringBootRfmMenuServiceApplication {

	@RequestMapping("/")
	public String controllerTest() {
		try {
			return "Spring boot controller callled "
					+ " | Host Name: "+ InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			e.printStackTrace();
			return "Error while executing controller "+e.getMessage();
		}
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRfmMenuServiceApplication.class, args);
	}
	
	

}
