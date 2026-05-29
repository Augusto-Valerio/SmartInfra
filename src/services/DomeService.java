package services;

import models.dome.Dome;
import models.dome.TreeDome;
import models.dome.VegetableDome;
import repositories.DomeRepository;


import java.util.List;

// Cria modelo + regra de negócio + passa para o repositories
public class DomeService {
    public static Dome createDome(String name, int capacity, int domeType) {
        if (domeType == 1) {
            TreeDome dome = new TreeDome(name, capacity);
            return dome;
        }

        if (domeType == 2) {
            VegetableDome dome = new VegetableDome(name, capacity);
            return dome;
        }

        return null;
    }

    public static void createDome(List<Dome> domes) {
        DomeRepository.saveAll(domes);
        System.out.println("Cúpulas salvas com sucesso!");
    }
}
