package es.ilm.pruebas.eureka.microservice.ilmspringbooteurekamicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class IlmSpringBootEurekaMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IlmSpringBootEurekaMicroserviceApplication.class, args);
	}

	@RequestMapping
	public String helloWorld() {
		return "Hello World - ilomas Eureka via Zuul";
	}

}
