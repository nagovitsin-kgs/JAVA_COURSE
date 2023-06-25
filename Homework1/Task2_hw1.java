package Homework1;

import java.util.Scanner;

/**
 * Java: Знакомство и как пользоваться базовым API (семинары).
 * Урок 1. Знакомство с языком программирования Java.
 *
 * Задание:
 *
 * Вывести все простые числа от 1 до 1000:
 * - Простые числа– это такие числа, которые делятся на себя и на единицу
 * (например: 2, 3, 5, 7 и т. д.). Те числа, которые делятся не только на себя и
 * на единицу, имеют больше двух делителей, называются составными. Есть
 * интересное число, которое делится только на себя (имеет один делитель). Это
 * единица, она не является ни простым, ни составным.
 */
public class Task2_hw1 {
    public static void main(String[] args) {

        System.out.print("Введите число: n = ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();

        for (int i = 2; i <= n; i++) {
            // поставили флаг:
            boolean primeNamber = true;
            for (int j = 2; j <= Math.floor(Math.sqrt(i)); j++) {
                // Если j - делитель, флаг = false:
                if ((i % j) == 0) {
                    primeNamber = false;
                    break;
                }
            }
            if (primeNamber) {
                // если делителей нет, флаг остался True, простое число выводим на печать:
                System.out.print(i + " ");
            }
        }
    }
}