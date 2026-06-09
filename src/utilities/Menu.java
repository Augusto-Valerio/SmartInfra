package utilities;

import java.util.List;

public class Menu {
    public static int create(List<String> options) {
        System.out.println();
        System.out.println("Escolha uma opção");

        while (true) {
            for (String option : options) {
                System.out.println(option);
            }
            int chose = UserInput.number("Digite aqui: ");

            if (chose < 0 || chose >= options.size()) {
                System.out.println("Digite uma opção válida!");
            } else {
                return chose;
            }
        }
    }

    public static int createFromOne(List<String> options) {
        System.out.println();
        System.out.println("Escolha uma opção");

        while (true) {
            for (String option : options) {
                System.out.println(option);
            }

            int chose = UserInput.number("Digite aqui: ");

            if (chose < 1 || chose > options.size()) {
                System.out.println("Digite uma opção válida!");
            } else {
                return chose;
            }
        }
    }

}
