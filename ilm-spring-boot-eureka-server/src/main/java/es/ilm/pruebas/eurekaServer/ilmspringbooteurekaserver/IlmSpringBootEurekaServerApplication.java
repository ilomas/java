package es.ilm.pruebas.eurekaServer.ilmspringbooteurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class IlmSpringBootEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IlmSpringBootEurekaServerApplication.class, args);
	}

}
