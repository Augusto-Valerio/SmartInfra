package models.dome;

import interfaces.Cultivable;
import models.sensor.SensorData;

import java.util.ArrayList;
import java.util.List;

public abstract class Dome implements Cultivable {
    private String name;
    private int capacidade;
    private List<SensorData> sensorDataList = new ArrayList<>();

    public Dome(String name, int capacidade) {
        this.name = name;
        this.capacidade = capacidade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public List<SensorData> getSensorDataList() {
        return sensorDataList;
    }

    public void addSensorData(SensorData sensorData) {
        sensorDataList.add(sensorData);
    }

    public abstract String getCultivo();
}
