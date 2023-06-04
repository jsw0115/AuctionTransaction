package com.shopping.AuctionTransaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AuctionTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuctionTransactionApplication.class, args);
	}

	@GetMapping("/")
	public String HelloWorld() {
		return "Hello World";
	}
}
