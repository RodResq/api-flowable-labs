package br.com.home.api_flowable_labs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication(proxyBeanMethods = false)
@EnableCaching
public class ApiFlowableLabsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiFlowableLabsApplication.class, args);
	}

}
