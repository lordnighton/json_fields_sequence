package com.lord.nighton.accountbalances;

import com.lord.nighton.accountbalances.controller.GreetingController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan(basePackageClasses = com.lord.nighton.accountbalances.controller.GreetingController.class)
public class AccountBalancesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountBalancesApplication.class, args);
	}

}
