package Homeworks.Homework_02;

import java.util.Scanner;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.*;

/**
 * Java: Знакомство и как пользоваться базовым API (семинары).
 * Урок 1. Знакомство с языком программирования Java.
 *
 * Задание:
 *
 * Реализовать простой калькулятор.
 */
public class test4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(test4.class.getName()); // getLogger - получить регистрато
        logger.setLevel(Level.INFO); // setLevel - установить уровень
        ConsoleHandler ch = new ConsoleHandler(); // ConsoleHandler - консольный обработчик
        logger.addHandler(ch);
        // SimpleFormatter sFormat = new SimpleFormatter(); // SimpleFormatter - простой
        // форматер
        XMLFormatter xml = new XMLFormatter(); // либо так в xml формате
        // ch.setFormatter(sFormat); // setFormatter - установить форматер
        ch.setFormatter(xml); // либо так в xml формате
        logger.log(Level.WARNING, "Тестовое логирование"); // Level.WARNING - уровень предупреждения
        logger.info("Тестовое логирование");

        System.out.println("Введите первое число:");
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
        }
        System.out.println("Результат операции: " + result);
        n1.close();
        n2.close();
    }
}
