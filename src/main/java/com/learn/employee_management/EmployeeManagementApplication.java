package com.learn.employee_management;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title = "EmployeeManagement System",
				version = "1.0.0",
				description = "RestfulApi Project for learning.Does the basic Crud operations.",
				termsOfService = "Jahid Hasan",
				contact = @Contact(
						name = "Jahid Hasan",
						email="jahidhasansaif094@gmail.com"
				),
				license = @License(
						name="Licence",
						url="http://localhost:8080/swagger-ui/index.html"
				)

		)
)

@PropertySource("classpath:application.yml")
public class EmployeeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

}
