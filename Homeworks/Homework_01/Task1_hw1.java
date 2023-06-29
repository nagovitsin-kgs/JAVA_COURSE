package Homeworks.Homework_01;

import java.util.Scanner;

/**
 * Java: Знакомство и как пользоваться базовым API (семинары).
 * Урок 1. Знакомство с языком программирования Java.
 *
 * Task1:
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n):
 * - Сумма последовательных натуральных чисел от 1 до n можно вычислить по
 * формуле 1+2+3...+n=½n²-½n.
 *
 * Вычислить n! (произведение чисел от 1 до n):
 * - Факториал числа n — это произведение всех натуральных чисел от 1 до n
 * включительно.
 * - Факторизация — разложение функции на множители.
 * - Факториал имеет вид: n != 1 * 2 * 3 * 4 … * n.
 */

public class Task1_hw1 {
    public static void main(String[] args) {

        System.out.printf("Введите число: n = ");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();

        int sum = 0;
        int multi = 1;

        for (int i = 1; i <= n; i++) {
            sum += i;
            multi *= i;
        }
        System.out.printf("Сумма чисел от 1 до %d: %d%n", n, sum);
        System.out.printf("Произведение чисел от 1 до %d: %d%n", n, multi);
        // System.out.println(sum);
        // System.out.println(multi);
        number.close();
    }

}