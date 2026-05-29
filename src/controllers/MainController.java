package controllers;

import models.dome.Dome;
import services.DomeService;
import services.ReportService;
import services.SensorService;

import java.util.ArrayList;
import java.util.List;


public class MainController {
    private static final List<Dome> domes = new ArrayList<>();

    public static void startMenu() {
        System.out.println("Bem vindo ao SmartInfra!");

        boolean running = true;
        while (running) {
            int chose = MainMenu.menuStart();

            if (chose == 0) {
                running = false;
                MainMenu.finishSystem();
            }
            if (chose == 1) {
                Dome dome = MainMenu.registerDome();

                domes.add(dome);

                DomeService.createDome(domes);

                MainMenu.showRegisteredDome(dome);
            }
            if (chose == 2) {
                MainMenu.listDomes(domes);
            }
            if (chose == 3) {
                if (domes.isEmpty()) {
                    System.out.println("Cadastre uma cúpula antes de gerar os dados randomizados.");
                } else {
                    int amount = MainMenu.askRandomDataAmount();

                    SensorService.generateRandomSensorData(domes, amount);

                    MainMenu.showGenerateSensorData(amount);
                }
            }
            if (chose == 4) {
                if (domes.isEmpty()) {
                    System.out.println("Cadastre uma cúpula antes de exibir o relatório ambiental.");
                } else {
                    MainMenu.showEnvironmentalReport(ReportService.generateEnvironmentalReport(domes));
                }
            }

        }

    }
}
