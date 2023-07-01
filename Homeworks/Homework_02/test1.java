package Homeworks.Homework_02;
// Работает

// 2). Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.logging.*;

public class test1 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(test1.class.getName());
        FileHandler fh = new FileHandler("logTask2.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Sort Array");
        int[] array = { 2, 5, 1, -7, 3, 64, 0 };
        for (int i = 0; i < array.length - 1; i++) {
            System.out.printf("%d, ", array[i]);
        }
        System.out.print(array[array.length - 1]);

        int[] newArr = listSort(array);
        System.out.printf("\n Отсортированный массив: \n");
        for (int i = 0; i < newArr.length - 1; i++) {
            System.out.printf("%d, ", newArr[i]);
        }
        System.out.print(newArr[newArr.length - 1]);
    }

    static int[] listSort(int[] arr) {
        for (int k = 0; k < arr.length - 1; k++) {

            for (int i = 0; i < arr.length - k - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }

}