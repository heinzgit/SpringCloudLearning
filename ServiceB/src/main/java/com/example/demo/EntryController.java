package com.example.demo;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
public class EntryController {
	
	@RequestMapping(method = RequestMethod.GET, path = "/helloB")
	public String hello() {
		return "Service B";
	}

}
