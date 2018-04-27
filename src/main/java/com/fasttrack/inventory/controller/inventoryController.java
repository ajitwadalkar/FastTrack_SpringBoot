package com.fasttrack.inventory.controller;

import com.fasttrack.inventory.exception.ResourceNotFoundException;
import com.fasttrack.inventory.model.Inventory;
import com.fasttrack.inventory.repository.inventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class inventoryController {



    @Autowired
    inventoryRepo inventoryrepo;

//Fet all SKU
    @GetMapping("skus")
    public List<Inventory> getAllNotes() {
        return inventoryrepo.findAll();
    }

    // Check if SKU is present
    @GetMapping("sku/{id}")
    public Inventory getInvById(@PathVariable(value = "id") Long noteId) {
        return inventoryrepo.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));
    }
}
