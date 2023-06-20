package com.microservice.inventoryservice.repository;

import com.microservice.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface InventoryReposiory extends JpaRepository<Inventory,Long> {
    Optional<Inventory> findBySkuCode(String skuCode);
}
