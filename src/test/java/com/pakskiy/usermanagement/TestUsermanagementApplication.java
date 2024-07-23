package com.pakskiy.usermanagement;

import org.springframework.boot.SpringApplication;

public class TestUsermanagementApplication {

	public static void main(String[] args) {
		SpringApplication.from(UserManagementApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
