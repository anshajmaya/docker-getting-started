package com.docker.plain.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	@GetMapping(path = "/checkDocker")
	public String checkDockerApp() {
		return "boot is running using docker !!!";
	}
	
}
