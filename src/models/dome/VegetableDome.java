package models.dome;

public class VegetableDome extends Dome {
    public VegetableDome(String name, int capacidade) {
        super(name, capacidade);
    }

    @Override
    public String getCultivo() {
        return "Vegetais";
    }
}
