package com.fasttrack.inventory.controller;

import com.fasttrack.inventory.exception.ResourceNotFoundException;
import com.fasttrack.inventory.model.Inventory;
import com.fasttrack.inventory.repository.inventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/")
public class inventoryController {

    @Autowired
    inventoryRepo inventoryrepo;

    @GetMapping("getcount")
    public long findCount(){
        return inventoryrepo.findAll().size();
    }

    @GetMapping("findbyupa/{upa}")
    public String getByUpa(@PathVariable(value = "upa") String upa) {
        return inventoryrepo.searchByUpa(upa);
    }

    @GetMapping("getlastmodifieddate")
    public String getLastUpdateDate()
    {
        return inventoryrepo.getLastDate();
    }

    @GetMapping("uploadcsv")
    public void uploadCSVData()
    {
        inventoryrepo.uploadData();
    }
}
