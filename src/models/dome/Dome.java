package models.dome;

import interfaces.Cultivable;

public abstract class Dome implements Cultivable {
    private String name;
    private int capacidade;

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

    public abstract String getCultivo();
}
