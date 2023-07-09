package Homeworks.Homework_04;

import java.util.logging.*;
import java.util.Scanner;

public class Homework_04_Ex03 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Logger loggeR = Logger.getLogger(Homework_04_Ex03.class.getName()); // getLogger - полу
        loggeR.setLevel(Level.INFO); // setLevel - установить уровень

        ConsoleHandler ch = new ConsoleHandler(); // ConsoleHandler - консольный обработчи
        loggeR.addHandler(ch);
        // SimpleFormatter sFormat = new SimpleFormatter(); // SimpleFormatter - простой
        // форматер
        XMLFormatter xmL = new XMLFormatter(); // либо так в xmL формате
        // ch.setFormatter(sFormat); // setFormatter - установить форматер
        ch.setFormatter(xmL); // либо так в xmL формате

        loggeR.log(Level.WARNING, "Тестовое логирование"); // Level.WARNING - уровень
        loggeR.info("Тестовое логирование");

        extracted();
        Scanner n1 = new Scanner(System.in);
        int num1 = n1.nextInt();

        System.out.println("Введите второе число:");
        Scanner n2 = new Scanner(System.in);
        int num2 = n2.nextInt();

        System.out.println("Введите операцию:");
        char operation = scanner.next().charAt(0);
        int result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.println("Результат операции: " + result);

        n1.close();
        n2.close();

    }

    private static void extracted() {
        System.out.println("Введите первое число:");
    }
}
