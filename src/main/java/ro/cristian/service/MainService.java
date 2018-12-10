/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.cristian.service;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.cristian.dao.ChartValuesDao;

/**
 *
 * @author cnastase
 */
@Service
public class MainService {

    @Autowired
    private ChartValuesDao dao;

    public Map<String, Integer> values() {
        return dao.getValues();
    }

}
