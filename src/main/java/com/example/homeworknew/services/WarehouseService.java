package com.example.homeworknew.services;

import com.example.homeworknew.models.Socks;
import com.example.homeworknew.models.Warehouse;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
@Data
@NoArgsConstructor

public class WarehouseService {
    public static int idGenerator = 0;
    public int id = idGenerator++;
    Map<Integer, Warehouse> warehouseMaps = new HashMap<>();

    public int addSocks(Warehouse warehouse) {
        int id = idGenerator++;
        warehouseMaps.put(id, warehouse);
        return id;
    }
    public Warehouse editWarehouse(Integer id, Warehouse warehouse){
        if (warehouseMaps.containsKey(id)){
            warehouseMaps.put(id,warehouse);
        }
        return null;
    }
    public Warehouse deleteWarehouse(Integer id){
       return warehouseMaps.remove(id);
    }
    public Warehouse getWarehouse(Integer id) {
        return warehouseMaps.get(id);
    }
}
