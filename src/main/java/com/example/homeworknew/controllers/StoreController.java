package com.example.homeworknew.controllers;

import com.example.homeworknew.models.Warehouse;
import com.example.homeworknew.services.WarehouseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/socks")
public class StoreController {
    private WarehouseService warehouseService;

    public StoreController(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    @PostMapping
    public ResponseEntity<Integer> addWarehouse(@RequestBody Warehouse warehouse) {
        int id = warehouseService.addSocks(warehouse);
        return  ResponseEntity.ok(id);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Warehouse> getWarehouse(@PathVariable Integer id){
        Warehouse warehouse = warehouseService.getWarehouse(id);
        return ResponseEntity.ok(warehouse);
    }
    @PutMapping("/{id}")
    public  ResponseEntity<Warehouse> editWarehouse(@PathVariable int id,@RequestBody Warehouse warehouse){
        Warehouse etidWarehouse = warehouseService.editWarehouse(id,warehouse);
        return ResponseEntity.ok(etidWarehouse);
    }
    @DeleteMapping("/{id}")
    public  ResponseEntity<Warehouse> deletetWarehouse(@PathVariable int id){
        Warehouse warehouse = warehouseService.deleteWarehouse(id);
        return ResponseEntity.ok(warehouse);
    }

}
