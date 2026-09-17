package com.smarthr;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"repository"})
@EntityScan(basePackages = {"model"})
@ComponentScan(basePackages = {"com.smarthr","controller","model","repository","service"})
public class SmartHrEmployeeSystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(SmartHrEmployeeSystemApplication.class, args);
	}
}