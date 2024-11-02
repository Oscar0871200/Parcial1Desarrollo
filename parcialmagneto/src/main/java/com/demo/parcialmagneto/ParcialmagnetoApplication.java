package com.demo.parcialmagneto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.demo.parcialmagneto.entities")
public class ParcialmagnetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParcialmagnetoApplication.class, args);
		System.out.println("Funcionando");
	}

}
