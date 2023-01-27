package com.consumers.inventorymanage.InventoryManagement.Controller;

import com.consumers.inventorymanage.InventoryManagement.Entity.Inventory;
import com.consumers.inventorymanage.InventoryManagement.Repository.InventoryRepository;
import com.consumers.inventorymanage.InventoryManagement.Services.InventoryService;
import com.consumers.inventorymanage.InventoryManagement.Services.InventoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory/")
public class InventoryController {
    @Autowired
    public InventoryServiceImpl inventoryService;

    @PostMapping
    public void saveItem(@RequestBody Inventory inventory){
        inventoryService.saveItem(inventory);
    }

    @GetMapping
    public List<Inventory> getAllItems(){
        return inventoryService.getAllItems();
    }

    @DeleteMapping("{id}")
    public String deleteItem(@PathVariable String id){
        inventoryService.deleteItem(id);
        return "Item Deleted Successfully";
    }

}
