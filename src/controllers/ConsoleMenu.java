package controllers;

import models.dome.Dome;
import services.DomeService;
import utilities.Menu;
import utilities.UserInput;

import java.util.ArrayList;
import java.util.List;

public class ConsoleMenu {
    public static int menuStart() {
        List<String> options = new ArrayList<>();

        options.add("0 - Encerrar sistema");
        options.add("1 - Cadastrar cúpula agricola");
        options.add("2 - Listar cúpulas cadastradas");
        options.add("3 - Gerar dados randomizados");
        options.add("4 - Exibir relatório ambiental");
        options.add("5 - Verificar Alertas");

        return Menu.create(options);
    }

    public static int menuDomeType() {
        List<String> options = new ArrayList<>();

        options.add("1 - Cúpula de árvores");
        options.add("2 - Cúpula de vegetais");

        return Menu.createFromOne(options);
    }

    public static Dome registerDome() {
        System.out.println();
        System.out.println("Cadastro de cúpula agrícula");

        String name = UserInput.text("Nome da cupula: ");
        int capacity = UserInput.number("Capacidade de plantas: ");

        int domeType = menuDomeType();

        return DomeService.createDome(name, capacity, domeType);
    }

    public static void showRegisteredDome(Dome dome) {
        System.out.println();
        System.out.println("Cúpula cadastrada com sucesso!");
        System.out.println("Nome: " + dome.getName());
        System.out.println("Cultivo: " + dome.getCultivo());
        System.out.println("Capacidade: " + dome.getCapacidade() + " plantas");
    }

    public static void listDomes(List<Dome> domes) {
        System.out.println();
        System.out.println("Cúpulas cadastradas:");

        if (domes.isEmpty()) {
            System.out.println("Nenhuma cúpula cadastrada.");
            return;
        }

        for (int i = 0; i < domes.size(); i++) {
            Dome dome = domes.get(i);

            System.out.println();
            System.out.println("ID: " + i);
            System.out.println("Nome: " + dome.getName());
            System.out.println("cultivo: " + dome.getCultivo());
            System.out.println("Capacidade: " + dome.getCapacidade() + " plantas");

        }
    }

    public static int askRandomDataAmount() {
        System.out.println();
        System.out.println("Gerar dados randomizados");

        return UserInput.number("Quantos registros de sensores deseja gerar para cada cúpula? ");
    }

    public static void showGenerateSensorData(int amount) {
        System.out.println();
        System.out.println(amount + " registro(s) de sensores gerado(s) com sucesso para cada cúpula.");
    }

    public static void showEnvironmentalReport(List<String> report) {
        System.out.println();
        System.out.println("Relatório ambiental");

        for (String line : report) {
            System.out.println(line);
        }
    }

    public static void showAlerts(List<String> alerts) {
        System.out.println();
        System.out.println("Verificação de alertas");

        for (String alert : alerts) {
            System.out.println(alert);
        }
    }

    public static void finishSystem() {
        System.out.println();
        System.out.println("Sistema encerrado. Até logo!");
    }
}
