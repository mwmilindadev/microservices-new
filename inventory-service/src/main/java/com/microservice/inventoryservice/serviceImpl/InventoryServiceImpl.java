package com.microservice.inventoryservice.serviceImpl;

import com.microservice.inventoryservice.repository.InventoryReposiory;
import com.microservice.inventoryservice.serivce.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryReposiory inventory;

    @Transactional(readOnly = true)
    @Override
    public boolean isInStock(String skuCode) {

        return inventory.findBySkuCode(skuCode).isPresent();

    }
}
