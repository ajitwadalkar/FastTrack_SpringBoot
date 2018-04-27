package com.fasttrack.inventory.repository;

import com.fasttrack.inventory.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface inventoryRepo extends JpaRepository<Inventory, Long> {

}
