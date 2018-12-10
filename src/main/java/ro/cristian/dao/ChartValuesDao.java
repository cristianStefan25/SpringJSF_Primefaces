/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.cristian.dao;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cnastase
 */
@Repository
public class ChartValuesDao {
    
    public Map<String, Integer> getValues() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ciocolata", 100);
        map.put("Bere", 150);
        map.put("Cola", 120);
        map.put("Seminte", 45);
        
        
        return map;
    }
    
}
