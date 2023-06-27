package Lectures;

// import java.util.Scanner;
// import java.io.FileWriter;
// import java.io.IOException;
import java.io.*;
// продолжение лекции 1 из файла Lecture1

// - Чтение, Вариант посимвольно: !!! (по индексу и выводим символ)

// import java.io.*;

public class Lecture1_2 {

    public static void main(String[] args) throws Exception { // throws - бросает, Exception - исключение
        // FileReader - читатель файлов

        // FileReader fr = new
        // FileReader("C:\\Users\\nagovitsin\\Desktop\\JAVA_COURSE\\Lectures\\file.txt");
        // int c;
        // while ((c = fr.read()) != -1) {
        // char ch = (char) c;
        // if (ch == '\n') {
        // System.out.print(ch);
        // } else {
        // System.out.print(ch);
        // }

        // - Чтение, Вариант построчно: !!! (пока есть строки, выводим)

        // BufferedReader - буферизованный считыватель

        BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\nagovitsin\\Desktop\\JAVA_COURSE\\Lectures\\file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
}

// Задачи для демонстрации:

// Задачи для самоконтроля:

// 1.Задана натуральная степень k.
// Сформировать случайным образом список коэффициентов (значения от 0 до 100)
// многочлена многочлен степени k.
// *Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0

// 2. Даны два файла, в каждом из которых находится запись многочлена.
// Сформировать файл содержащий сумму многочленов.

// Итоги:

// База еще одного языка!