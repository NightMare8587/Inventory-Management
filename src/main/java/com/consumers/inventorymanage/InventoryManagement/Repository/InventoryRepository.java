package com.consumers.inventorymanage.InventoryManagement.Repository;

import com.consumers.inventorymanage.InventoryManagement.Entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory,Long> {
}
