package com.microservice.inventoryservice.serivce;

public interface InventoryService {
    boolean isInStock(String skuCode);
}
