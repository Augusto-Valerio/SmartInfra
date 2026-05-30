package services;

import models.dome.Dome;
import repositories.DomeRepository;
import utilities.SensorDataGenerator;

import java.util.List;

public class SensorService {
    public static void generateRandomSensorData(List<Dome> domes, int amount) {
        for (Dome dome : domes) {
            for (int i = 0; i < amount; i++) {
                dome.addSensorData(SensorDataGenerator.generate());
            }
        }

        DomeRepository.saveAll(domes);
    }
}
