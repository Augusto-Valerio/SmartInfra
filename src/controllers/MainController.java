package controllers;

import models.dome.Dome;
import services.DomeService;

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
        }

    }
}
