package com.shoppingcart.shoppingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
//@EnableEurekaClient
//@EnableDiscoveryClient
//@RefreshScope
@EnableJpaRepositories( basePackages = {"com.salesmanager.core.business.repositories.shoppingcart"})
@ComponentScan(basePackages = {"com.salesmanager.core.model.shoppingcart"})
@EntityScan({"com.salesmanager.core.model.shoppingcart", 
			"com.salesmanager.core.model.merchant",
			"com.salesmanager.core.model.reference"})
//@ImportResource({"classpath*:shopizer-properties.xml"})
public class ShoppingcartServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingcartServiceApplication.class, args);
	}

	//com.salesmanager.core.business.services.shoppingcart",
	/*@Bean
	public ObjectMapper objectMapper() {

		ObjectMapper mapper = new ObjectMapper();

		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		return mapper;
	}*/

}

