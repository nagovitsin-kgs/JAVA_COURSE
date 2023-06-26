
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
// Основы: типы данных:

class Lecture1 {
    public static void main(String[] args) {
        // 1. Основы: типы данных:
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
        // 2. Классы-обертки:
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
        // 3. Операции Java:
        // ● Присваивание: =
        // ● Арифметические: *, /, +, -, %, ++, --
        // ● Операции сравнения: <, >, ==, !=, >=, <=
        // ● Логические операции: ||, &&, ^, !
        // ● Побитовые операции <<, >>, &, |, ^
        //
        // 4. Массивы:
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
        // 5. Преобразования:
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
        // 6. Получение данных из терминала:
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

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt();
        System.out.println(flag);
        int s = iScanner.nextInt();
        System.out.println(s);
        iScanner.close();
        //
        // 7. Форматированный вывод:

    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}
