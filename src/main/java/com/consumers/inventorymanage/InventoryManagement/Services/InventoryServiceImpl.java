package com.consumers.inventorymanage.InventoryManagement.Services;

import com.consumers.inventorymanage.InventoryManagement.Entity.Inventory;
import com.consumers.inventorymanage.InventoryManagement.Repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService{

    @Autowired
    InventoryRepository inventoryRepository;
    @Override
    public void saveItem(Inventory inventory) {
        inventoryRepository.save(inventory);
    }

    @Override
    public List<Inventory> getAllItems() {
        return inventoryRepository.findAll();
    }

    @Override
    public void deleteItem(String id) {
        inventoryRepository.deleteById(Long.parseLong(id));
    }
}
