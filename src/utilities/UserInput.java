package utilities;

import java.util.Scanner;

public class UserInput {

    private static final Scanner scanner = new Scanner(System.in);

    public static String text(String input) {
        System.out.print(input);
        return scanner.nextLine();
    }

    public static int number(String input) {
        System.out.print(input);

        while (!scanner.hasNextInt()) {
            System.out.println("Digite um número válido.");
            scanner.next();
            System.out.print(input);
        }

        int number = scanner.nextInt();
        scanner.nextLine();

        return number;
    }
}