package Homeworks.Homework_01;

import java.util.Scanner;

/**
 * Java: Знакомство и как пользоваться базовым API (семинары).
 * Урок 1. Знакомство с языком программирования Java.
 *
 * Задание:
 *
 * Реализовать простой калькулятор.
 */
public class Task3_hw1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

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
            default:
                System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.println("Результат операции: " + result);
        n1.close();
        n2.close();
    }
}
