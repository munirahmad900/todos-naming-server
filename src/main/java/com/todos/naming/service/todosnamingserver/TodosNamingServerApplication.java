package com.todos.naming.service.todosnamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TodosNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodosNamingServerApplication.class, args);
	}

}
