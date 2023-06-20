package com.microservice.inventoryservice;

import com.microservice.inventoryservice.model.Inventory;
import com.microservice.inventoryservice.repository.InventoryReposiory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);




	}

	@Bean
	public CommandLineRunner loadData(InventoryReposiory inventoryReposiory) {

		return args -> {
			Inventory inv= new Inventory();
			inv.setSkuCode("iphone");
			inv.setQuantity(100);

			Inventory inv1= new Inventory();
			inv1.setSkuCode("iphone-red");
			inv1.setQuantity(0);

			inventoryReposiory.save(inv);
			inventoryReposiory.save(inv1);
		};
	}


}


