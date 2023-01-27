package com.consumers.inventorymanage.InventoryManagement.Services;

import com.consumers.inventorymanage.InventoryManagement.Entity.Inventory;

import java.util.List;

public interface InventoryService {
    public void saveItem(Inventory inventory);

    public List<Inventory> getAllItems();

    public void deleteItem(String id);
}
