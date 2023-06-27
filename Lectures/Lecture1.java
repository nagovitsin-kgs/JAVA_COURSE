
// Знакомство с языком программирования Java:
/**
 * Почему JAVA:
 * 
 * 1. Топ 3 ЯП в мире 2. Библиотеки 3. Кроссплатформенность 4. Тысячи вакансий
 * разных направлений 5. Начало Android’а 6. Безопасность 7. ООП 8.
 * Многопоточность,как она есть
 * 
 * О чём курс:
 * 
 * 1. Основы основ-Типы,базовые конструкции 2. Детальный разбор некоторых
 * API-Файлы и работа с потоками ввода\вывода 3. Погружение в Java Collection
 * API-List’ы и не только
 * 
 * Настройка рабочего места:
 * 
 * Шаг 1:-Java JDK https://www.oracle.com/java/technologies/downloads/
 * Шаг 2:-Extension Pack VS Code
 * https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-javapack
 * При желаниии:-https://www.jetbrains.com/ru-ru/idea/
 * println(“Hello world”);
 * 
 * Структура простой программы:
 * 
 * public class Program {
 * public static void main(String[] args) {
 * System.out.println("Goodbye world");
 * }
 * }
 * 
 * Основы:
 * 
 * Типы данных
 * и переменные:
 * 
 * Типы данных:
 * 
 * ссылочные:
 * 
 * примитивные:
 * 
 * - boolean
 * - int, short, long и т.д.
 * - float, double
 * - Char
 * 
 * Создание переменной:
 * 
 * <тип> <идентификатор>;
 * <идентификатор> = <значение>;
 */
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
// Основы: типы данных:

class Lecture1 {
    public static void main(String[] args) {
        // 1. Основы: типы данных: ////////////////
        short age = 10;
        int salary = 123456;
        System.out.println(age); // 10
        System.out.println(salary); // 123456
        //
        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(e); // 2.7
        System.out.println(pi); // 3.1415
        //
        char ch = '1';
        System.out.println(Character.isDigit(ch)); // true
        // Метод Character.isDigit() – определяет, является ли указанное значение типа
        // char цифрой.
        ch = 'a';
        System.out.println(Character.isDigit(ch)); // false
        //
        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); // true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); // false
        //
        // Строки не так просты:
        String msg = "Hello world";
        System.out.println(msg); // Hello world
        //
        // Неявная типизация:
        // Язык с явной типизацией предполагает, что программист должен указывать типы
        // всех переменных и функций, которые объявляет. Английский термин для этого —
        // explicit typing.
        // Язык с неявной типизацией, напротив, предлагает Вам забыть
        // о типах и переложить задачу вывода типов на компилятор или интерпретатор.
        var a = 123;
        System.out.println(a); // 123
        var d = 123.456;
        System.out.println(d); // 123.456
        //
        // Неявная типизация:
        var c = 123;
        System.out.println(c); // 123
        var t = 123.456;
        System.out.println(t); // 123.456
        System.out.println(getType(c)); // Integer
        System.out.println(getType(t)); // Double
        t = 1022;
        System.out.println(t); // 1022
        // t = "mistake";
        // error: incompatible types:
        // String cannot be converted to double
        //
        // Неявная типизация:
        System.out.println(getType("fff")); // вызов метода static String getType(Object o) // String
        //
        // 2. Классы-обертки: //////////////////////
        // Примитив / Обертка
        // int / Integer
        // short / Short
        // long / Long
        // byte / Byte
        // float / Float
        // double / Double
        // char / Character
        // boolean / Boolean
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648
        //
        // 3. Операции Java: //////////////////////////
        // ● Присваивание: =
        // ● Арифметические: *, /, +, -, %, ++, --
        // ● Операции сравнения: <, >, ==, !=, >=, <=
        // ● Логические операции: ||, &&, ^, !
        // ● Побитовые операции <<, >>, &, |, ^
        //
        // 4. Массивы: /////////////////////
        // Одномерные
        int[] arr = new int[10];
        System.out.println(arr.length); // 10
        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length); // 5
        // Многомерные
        int[] ar[] = new int[3][5];
        for (int[] line : ar) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
        // Многомерные
        System.out.print("\n");
        int[][] array = new int[3][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }
        //
        // 5. Преобразования: //////////////////
        // Можно
        int i = 123;
        double k = i;
        System.out.println(i); // 123
        System.out.println(k); // 123.0
        k = 3.1415;
        i = (int) k;
        System.out.println(k); // 3.1415
        System.out.println(i); // 3
        k = 3.9415;
        i = (int) k;
        System.out.println(k); // 3.9415
        System.out.println(i); // 3
        byte b = Byte.parseByte("123");
        System.out.println(b); // 123
        // b = Byte.parseByte("1234");
        // System.out.println(b); // NumberFormatException: Value out of range
        // НО (нельзя так делать):
        int[] g = new int[10];
        // double[] p = g; // ИЗУЧАЕМ ковариантность и контравариантность
        // Ковариантность: позволяет использовать более конкретный тип, чем заданный
        // изначально
        // Контравариантность: позволяет использовать более универсальный тип, чем
        // заданный изначально
        // Инвариантность: позволяет использовать только заданный тип
        //
        // 6. Получение данных из терминала: ///////////////////////
        // - Строки

        // import java.util.Scanner; (до класса)

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %s!", name);
        // iScanner.close();

        // - Некоторые примитивы

        // import java.util.Scanner;

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // int x = iScanner.nextInt();
        // System.out.printf("double a: ");
        // double y = iScanner.nextDouble();
        // System.out.printf("%d + %f = %f", x, y, x + y);
        // iScanner.close();

        // - Проверка на соответствие получаемого типа

        // import java.util.Scanner;

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // boolean flag = iScanner.hasNextInt();
        // System.out.println(flag);
        // int s = iScanner.nextInt();
        // System.out.println(s);
        // iScanner.close();
        //
        // 7. Форматированный вывод: //////////////////////// !!!!!!!
        int q = 1, w = 2;
        int r = q + w;
        String res = q + " + " + w + " = " + r;
        System.out.println(res);
        // Форматированный вывод:
        int u = 1, o = 2;
        int p = u + o;
        String reS = String.format("%d + %d = %d \n", u, o, p); // 1-вариант как можно
        System.out.printf("%d + %d = %d \n", u, o, p); // 2-вариант как можно
        System.out.println(reS);
        //
        // 8. Виды спецификаторов: /////////////////////
        // %d: целочисленных значений
        // %x: для вывода шестнадцатеричных чисел
        // %f: для вывода чисел с плавающей точкой
        // %.2f для вывода чисел с плавающей точкой (2 цифры после ,)
        // %.3f для вывода чисел с плавающей точкой (3 цифры после ,)
        // %e: для вывода чисел в экспоненциальной форме, например, 3.1415e+01
        // %c: для вывода одиночного символа
        // %s: для вывода строковых значений
        // Виды спецификаторов:
        float pI = 3.1415f;
        System.out.printf("%f\n", pI); // 3,141500
        System.out.printf("%.2f\n", pI); // 3,14
        System.out.printf("%.3f\n", pI); // 3,141
        System.out.printf("%e\n", pI); // 3,141500e+00
        System.out.printf("%.2e\n", pI); // 3,14e+00
        System.out.printf("%.3e\n", pI); // 3,141e+00
        //
        // 9. Область видимости переменных: //////////////
        // У переменных существует понятие «область видимости».
        // Если переменную объявили внутри некоторого блока фигурных скобок { },
        // то снаружи этого блока переменная будет недоступна.
        int m = 123;
        System.out.println(m); // за } System.out.println(m); // error: cannot find symbol
        //
        // 10. Функции и методы: ////////////////
        // Функции и методы — это технически одно и то же.
        // Функции могут не принадлежать классам, а методы принадлежат.
        // В java все функции являются методами:
        // - Описание
        // - Вызов
        // - Возвращаемое значение
        // - Рекурсия
        // Ниже в классе будут прописаны методы:
        // static void sayHi() {
        // System.out.println("hi!");
        // }
        // static int sum(int a, int b) {
        // return a+b;
        // }
        // static double factor(int n) {
        // if(n==1)return 1;
        // return n * factor(n-1);
        // }
        // a вызывать будем здесь в main:
        sayHi(); // hi!
        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); // 120.0
        //
        // 11. Управляющие конструкции: //////////////////
        // - условный оператор:
        int aq = 1;
        int bw = 2;
        int cr;
        if (aq > bw) { // усл
            cr = aq;
        } else {
            cr = bw;
        }
        System.out.println(cr);
        // - условный оператор:
        int az = 1;
        int bx = 2;
        int cv = 0;
        if (az > bx) // усл
            cv = az;
        if (bx > az)
            cv = bx;
        System.out.println(cv);
        // - тернарный оператор:
        int ad = 1;
        int bh = 2;
        int min = ad < bh ? ad : bh; // тер
        System.out.println(min);
        //
        // 12. Оператор выбора: ///////////////////
        // import java.util.Scanner;
        int mounth = 1;// int mounth = value; // mounth - месяц
        String text = "";
        switch (mounth) { // switch - выключатель
            case 1: // case - случай, дело
                text = "Autumn"; // Autumn - Осень
                break; // break - разрыв, перерыв
            // ...
            default: // default - по умолчанию
                text = "mistake"; // mistake - Ошибка
                break;
        }
        // Scanner iScanner = new Scanner(System.in);
        System.out.println(text); // Autumn (если int mounth = 2, то mistake)
        // iScanner.close(); // close - закрывать
        //
        // 13. Циклы: ////////////////////
        // Цикл — это многократное выполнение одинаковой последовательности действий.
        // В java доступны следующие циклы:
        // ● цикл while;
        // ● цикл do while;
        // ● цикл for; и его модификация for in
        //
        // - Цикл while:
        int value = 321;
        int count = 0;
        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count); // 3
        //
        // - Цикл do while:
        int valuE = 321;
        int counT = 0;
        do {
            valuE /= 10;
            counT++;
        } while (valuE != 0); // do - делай это {...}, while - (пока условие)
        System.out.println(counT); // 3
        //
        // - Операторы для управления циклами - continue (продолжать), break (разрыв):
        // Выполнение следующей итерации цикла — continue.
        // Прерывание текущей итерации цикла — break.
        // * ближайшего к оператору
        //
        // - Оператор цикла for:
        int z = 0;
        for (int h = 1; h <= 10; h++) {
            z += h;
        }
        System.out.println(z); // 55
        //
        // - Вложенные циклы:
        for (int l = 0; l < 5; l++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                // * * * * *
                // * * * * *
                // * * * * *
                // * * * * *
                // * * * * *
            }
            System.out.println();
        }
        // - for : !!!
        // Работает только для коллекций:
        int arra[] = new int[10];
        for (int item : arra) { // item - элемент
            System.out.printf("%d ", item); // 0 0 0 0 0 0 0 0 0 0 - 10 элементов
        }
        System.out.println();
        //
        // 14. Работа с файлами: ////////////////////////

        // IO (Input & Output) API — это Java API, которое облегчает разработчикам
        // работу с потоками.
        // Скажем, мы получили какие-то данные (например, фамилия, имя и отчество)
        // и нам нужно записать их в файл — в этот момент
        // и приходит время использовать java.io.
        // FileWriter (писатель файлов)
        // IOException (исключение ввода-вывода)
        // try (попытка, испытание) – определяет блок кода, в котором может произойти
        // исключение;
        // catch (поймать, ловить) – определяет блок кода, в котором происходит
        // обработка исключения;
        // finally (окончательно, в конечном счёте) – определяет блок кода, который
        // является необязательным, но при его наличии выполняется в любом случае
        // независимо от результатов выполнения блока try.
        // flush(); session. flush(); Он транслирует изменения отслеживаемых сущностей в
        // базу данных, то есть выполняет накопившиеся SQL-команды.

        // - Создание и запись\ дозапись:

        // import java.io.FileWriter;
        // import java.io.IOException;

        try (FileWriter fw = new FileWriter("file.txt", false)) { // создание файла
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush(); // выполняет накопившиеся SQL-команды
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // - Чтение, Вариант посимвольно: (смотри в Lecture1.1.java)

        // import java.io.FileWriter;
        // import java.io.IOException;
        // import java.io.*;

        // public class Program {
        // public static void main(String[] args) throws Exception {
        // FileReader fr = new FileReader("file.txt");
        // int c;
        // while ((c = fr.read()) != -1) {
        // char ch = (char) c;
        // if (ch == '\n') {
        // System.out.print(ch);
        // } else {
        // System.out.print(ch);
        // }
        // }
        // } }
        // смотри в Lecture1.1.java
    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }

    static void sayHi() { // метод sayHi - скажи привет
        System.out.println("hi!");
    }

    static int sum(int a, int b) { // метод сумма
        return a + b;
    }

    static double factor(int n) { // метод факториал
        if (n == 1)
            return 1;
        return n * factor(n - 1);
    }

}
