/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.cristian.model;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.PieChartModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ro.cristian.service.MainService;

/**
 *
 * @author cnastase
 */
@ManagedBean
@Component
@RequestScoped
public class ChartBean implements Serializable {

    private PieChartModel model;

    @Autowired
    private MainService service;

    @PostConstruct
    public void init() {
        model = new PieChartModel();
        model.setTitle("Simple Pie");
        model.setLegendPosition("w");

        Map<String, Integer> map = service.values();
        Set<String> keys = map.keySet();

        for (String x : keys) {
            model.set(x, map.get(x));
        }
    }

    public PieChartModel getModel() {
        return model;
    }

    public void setModel(PieChartModel model) {
        this.model = model;
    }

}
