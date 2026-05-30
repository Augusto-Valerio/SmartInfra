package models.dome;

public class TreeDome extends Dome{
    public TreeDome(String name, int capacidade) {
        super(name, capacidade);
    }

    @Override
    public String getCultivo() {
        return "Árvores";
    }
}
