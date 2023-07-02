// Задание:
// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Homework_03 {
    public static void main(String[] args) throws Exception {

        // Пусть дан произвольный список целых чисел:

        System.out.print("Введите длину списка n: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            int n = iScanner.nextInt();
            ArrayList<Integer> ar = new ArrayList<Integer>();
            Random ran = new Random();
            for (int i = 0; i < n; i++) {
                int x = ran.nextInt(n);
                ar.add(x);
            }
            System.out.println("Произвольный список целых чисел: \n" + ar);

            // 2) Найти минимальное значение:
            // 3) Найти максимальное значение:

            int min = ar.get(0);
            int max = ar.get(0);
            float sum = 0;
            for (int i = 0; i < ar.size(); i++) {
                int num = ar.get(i);
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
                sum += num;
            }
            // 4) Найти среднее значение:

            float average = sum / ar.size();

            System.out.println("Минимальное значение: " + min);
            System.out.println("Максимальное значение: " + max);
            System.out.println("Среднее арифметическое значение: " + average);

            // 1) Нужно удалить из него чётные числа:

            for (int i = ar.size() - 1; i >= 0; i--) {
                int even = ar.get(i) % 2;
                if (even == 0) {
                    System.out.println("Четное число:" + ar.get(i));
                    ar.remove(i); // удаление чётных чисел
                }
            }
            System.out.println("Неотсортированный список с удалёнными чётными числами: \n " + ar);
            Collections.sort(ar); // сортировка
            System.out.println("Отсортированный список, в котором удадены четные числа: \n " + ar);

            iScanner.close();
        }
    }

}
