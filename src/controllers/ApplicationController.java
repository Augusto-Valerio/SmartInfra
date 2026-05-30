package controllers;

import models.dome.Dome;
import services.alerts.AlertService;
import services.DomeService;
import services.ReportService;
import services.SensorService;

import java.util.ArrayList;
import java.util.List;


public class ApplicationController {
    private static final List<Dome> domes = new ArrayList<>();

    public static void startMenu() {
        System.out.println("Bem vindo ao SmartInfra!");

        boolean running = true;
        while (running) {
            int chose = ConsoleMenu.menuStart();

            if (chose == 0) {
                running = false;
                ConsoleMenu.finishSystem();
            }
            if (chose == 1) {
                Dome dome = ConsoleMenu.registerDome();

                domes.add(dome);

                DomeService.createDome(domes);

                ConsoleMenu.showRegisteredDome(dome);
            }
            if (chose == 2) {
                ConsoleMenu.listDomes(domes);
            }
            if (chose == 3) {
                if (domes.isEmpty()) {
                    System.out.println("Cadastre uma cúpula antes de gerar os dados randomizados.");
                } else {
                    int amount = ConsoleMenu.askRandomDataAmount();

                    SensorService.generateRandomSensorData(domes, amount);

                    ConsoleMenu.showGenerateSensorData(amount);
                }
            }
            if (chose == 4) {
                if (domes.isEmpty()) {
                    System.out.println("Cadastre uma cúpula antes de exibir o relatório ambiental.");
                } else {
                    ConsoleMenu.showEnvironmentalReport(ReportService.generateEnvironmentalReport(domes));
                }
            }
            if (chose == 5) {
                if (domes.isEmpty()) {
                    System.out.println("Cadastre uma cúpula antes de verificar alertas.");
                } else {
                    ConsoleMenu.showAlerts(AlertService.verifyAlerts(domes));
                }
            }

        }

    }
}
