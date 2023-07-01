package Homeworks.Homework_02;

/**
 * Java: знакомство и как пользоваться базовым API (семинары).
 * Урок 2. Почему вы не можете не использовать API.
 * Формат сдачи: ссылка на подписанный git-проект.
 *
 * Задание:
 *
 * 1) Дана строка sql-запроса "select * from students where ".
 * - Сформируйте часть WHERE этого запроса, используя StringBuilder.
 * - Данные для фильтрации приведены ниже в виде строки.
 * - Параметры для фильтрации:
 * {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 * - Если значение null, то параметр не должен попадать в запрос.
 *
 * 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат
 * после каждой итерации запишите в лог-файл.
 *
 * 3) К калькулятору из предыдущего ДЗ добавить логирование.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.util.logging.*;
import java.util.Scanner;

public class Homework_02 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Homework2_1();

        // Homework2_2:

        System.out.println("Homework2_2:");
        Logger logger = Logger.getLogger(Homework_02.class.getName());
        FileHandler fh = new FileHandler("logHomework2_2.xml");
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
        System.out.printf("\n" + "\nОтсортированный массив:\n");
        for (int i = 0; i < newArr.length - 1; i++) {
            System.out.printf("%d, ", newArr[i]);
        }
        System.out.print(newArr[newArr.length - 1]);
        System.out.println("\n");

        // Homework2_3:

        Logger loggeR = Logger.getLogger(Homework_02.class.getName()); // getLogger - получить регистрато
        loggeR.setLevel(Level.INFO); // setLevel - установить уровень
        ConsoleHandler ch = new ConsoleHandler(); // ConsoleHandler - консольный обработчик
        loggeR.addHandler(ch);
        // SimpleFormatter sFormat = new SimpleFormatter(); // SimpleFormatter - простой
        // форматер
        XMLFormatter xmL = new XMLFormatter(); // либо так в xmL формате
        // ch.setFormatter(sFormat); // setFormatter - установить форматер
        ch.setFormatter(xmL); // либо так в xmL формате
        loggeR.log(Level.WARNING, "Тестовое логирование"); // Level.WARNING - уровень предупреждения
        loggeR.info("Тестовое логирование");

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
        // окончание Homework2_3 //
    }

    static void Homework2_1() {
        getSQLquery1();
    }

    static void getSQLquery1() {
        String sqlStr = "select * from students where ";
        // создаем и инициализируем карту
        Map<String, String> map = new HashMap<String, String>();
        // добавляем ключ / значение:
        map.put("name", "Ivanov");
        map.put("country", "Russia");
        map.put("city", "Moscow");
        map.put("age", null);
        // System.out.println(map.toString());
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) { // перебор коллекции элементов из Map.Entry
            if (entry.getKey() == null || entry.getValue() == null) {
                continue;
            }
            sb.append(entry.getKey())
                    .append(" = '")
                    .append(entry.getValue())
                    .append("' and ");
        }
        if (sb.charAt(sb.length() - 1) == ' ')
            ;
        { // если завершается не <'>, то удаляем 5 значений с конца <' end '>
            sb.delete(sb.length() - 5, sb.length()); //
        }

        System.out.println(
                "Homework2_1: \n1). Сформируйте часть WHERE этого запроса select * from students where, используя StringBuilder.\n"
                        + "Если значение null, то параметр не должен попадать в запрос.\n"
                        + "\nПараметры для фильтрации:\n"
                        + "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}\n");
        String result = sb.toString();
        result = sqlStr.concat(result);
        System.out.println("Сформирована часть WHERE, после фильтрации:");
        System.out.println(result);
        System.out.println();

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
