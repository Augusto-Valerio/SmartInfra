package services;

import models.dome.Dome;
import models.dome.TreeDome;
import models.dome.VegetableDome;
import repositories.DomeRepository;


import java.util.List;

// Cria modelo + regra de negócio + passa para o repositories
public class DomeService {
    public static Dome createDome(String name, int capacity) {
        return new VegetableDome(name, capacity);
    }

    public static Dome createDome(String name, int capacity, int domeType) {
        if (domeType == 1) {
            return new TreeDome(name, capacity);
        }

        if (domeType == 2) {
            return new VegetableDome(name, capacity);
        }

        return createDome(name, capacity);
    }

    public static void saveDomes(List<Dome> domes) {
        DomeRepository.saveAll(domes);
        System.out.println("Cúpulas salvas com sucesso!");
    }
}
