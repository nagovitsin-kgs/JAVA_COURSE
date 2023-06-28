package Lectures;

import java.io.File;
import java.io.*;
import java.util.logging.*;

// Java: знакомство и как пользоваться базовым API (лекции).
// Урок 2. Почему вы не можете не использовать API.
/**
 * Что такое API в широком смысле?
 *
 * API (Application programming interface) —
 * это контракт, который предоставляет программа.
 * «Ко мне можно обращаться так и так, я обязуюсь
 * делать то и это».
 * https://habr.com/ru/post/464261/ - всё про API.
 *
 * Что такое API для нас?
 *
 * Это возможности, который предоставляют разработчики языка для удобного
 * взаимодействия с его функционалом.
 *
 * Что такое API для нас на примерах?
 *
 * 1. Строки
 * 2. Работа с файловой системой
 * 3. Логирование
 * 4. Импорт
 * 5. Xml
 */
public class Lecture2 {
    public static void main(String[] args) {
        // 1. Строки: ///////////////////////////////////////

        // Что такое API для нас: строки

        // Простой пример:
        // Создать строку из 1 млн плюсиков. Как?

        // String str = "";
        // for (int i = 0; i < 1_000_000; i++) {
        // str += "+";
        // }
        // ≈41000 ms

        // StringBuilder - построитель строк.
        // Классы StringBuffer и StringBuilder в Java используются, когда возникает
        // необходимость сделать много изменений в строке символов.
        // В отличие от String , объекты типа StringBuffer и StringBuilder могут быть
        // изменены снова и снова.
        // В Java StringBuilder был введен начиная с Java 5.
        // Чтобы изменять строку без создания нового объекта, можно использовать класс
        // System.Text.StringBuilder.
        // Например, использование класса StringBuilder может повысить
        // производительность при соединении большого количества строк в цикле.

        // Что такое API для нас: строки

        // Простой пример
        // Создать строку из 1 млн плюсиков. Как?

        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < 1_000_000; i++) {
        // sb.append("+");
        // }
        // System.out.println(sb); // ≈9 ms

        // Весь код:
        var s = System.currentTimeMillis(); // currentTimeMillis - текущее время Миллис
        // String str = ""; // или
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            // str += "+"; // или
            sb.append("+");

        }
        System.out.println(System.currentTimeMillis() - s);
        // System.out.println(str);
        // System.out.println(sb);

        // Что такое API для нас: строки /////////

        // concat(): объединение строк
        // valueOf(): преобразует Object в строковое представление (завязан на
        // toString())
        // join(): объединяет набор строк в одну с учетом разделителя
        // charAt(): получение символа по индексу
        // indexOf(): первый индекс вхождения подстроки
        // lastIndexOf(): последний индекс вхождения подстроки
        // startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с
        // подстроки
        // replace(): замена одной подстроки на другую

        // trim(): удаляет начальные и конечные пробелы
        // substring(): возвращает подстроку, см.аргументы
        // toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем
        // регистре
        // сompareTo(): сравнивает две строки
        // equals(): сравнивает строки с учетом регистра
        // equalsIgnoreCase(): сравнивает строки без учета регистра
        // regionMatches(): сравнивает подстроки в строках

        // Что такое API для нас: строки

        String[] name = { "C", "е", "р", "г", "е", "й" };
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase()); // сергей ка.
        System.out.println(String.join("", name)); // Cергей
        System.out.println(String.join("", "C", "е", "р", "г", "е", "й")); // Cергей
        System.out.println(String.join(",", "C", "е", "р", "г", "е", "й")); // C,е,р,г,е,й

        // Что такое API для нас: строки

        // - String vs StringBuilder - Строка против построителя строк
        // - Много изменений – String
        // - Много преобразований – StringBuilder

        // 2. Работа с файловой системой: //////////////////////////////////////

        // Сколько разного в файловой системе?
        // - Каталоги
        // - Файлы

        // Для работы нужно:
        // File <имя> = new File(<полный путь к файлу>);

        // Что предпочтительнее?
        // File f1 = new File("file.txt");
        // File f2 = new File("/Users/sk/vscode/java_projects/file.txt");

        // import java.io.File;
        // String pathProject = System.getProperty("user.dir"); // getProperty -
        // получить свойство
        // String pathFile = pathProject.concat("/file.txt");
        // File f3 = new File(pathFile);
        // System.out.println(f3.getAbsolutePath()); // получить абсолюный путь
        // => /Users/sk/vscode/java_projects/file.txt
        // => C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt

        // Если ошибки, что делать, как быть???

        // Работа с файловой системой. Файлы. Ошибки ////////////

        try {
            // Код, в котором может появиться ошибка
        } catch (Exception e) {
            // Обработка, если ошибка случилась
        } finally {
            // Код, который выполнится в любом случае
        }

        // Работа с файловой системой. Файлы. Ошибки: ///////

        // import java.io.File;
        // try {
        // String pathProject = System.getProperty("user.dir");
        // String pathFile = pathProject.concat("/file.txt");
        // File f3 = new File(pathFile);
        // System.out.println("try");
        // // System.out.println(f3.getAbsolutePath()); // получить абсолюный путь
        // } catch (Exception e) {
        // System.out.println("catch");
        // } finally {
        // System.out.println("finally");
        // }
        // Всё ли ОК? улудшаем (проверяем есть ли файл?) ниже код:

        // Работа с файловой системой. Файлы. Ошибки: //////

        // import java.io.File;
        // try {
        // String pathProject = System.getProperty("user.dir");
        // String pathFile = pathProject.concat("/file.txt");
        // File file = new File(pathFile);
        // if (file.createNewFile()) {
        // System.out.println("file.created");
        // } else {
        // System.out.println("file.existed");
        // }
        // } catch (Exception e) {
        // System.out.println("catch");
        // } finally {
        // System.out.println("finally");
        // }

        // Работа с файловой системой. Файлы. Ошибки: ///////

        // import java.io.File;
        // import java.io.*;
        String line = "empty";
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File file = new File(pathFile);
            if (file.createNewFile()) {
                System.out.println("file.created");
            } else {
                BufferedReader bufReader = new BufferedReader(new FileReader(file));
                System.out.println("file.existed");
                line = bufReader.readLine();
                bufReader.close();
            }
        } catch (Exception e) {
            // e.printStackTrace();
        } finally {
            System.out.println(line);
        }

        // Работа с файловой системой: //////////

        // isHidden(): возвращает истину, если каталог или файл является скрытым
        // length(): возвращает размер файла в байтах
        // lastModified(): возвращает время последнего изменения файла или каталога
        // list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
        // listFiles(): возвращает массив файлов и подкаталогов, которые находятся
        // в определенном каталоге
        // mkdir(): создает новый каталог
        // renameTo(File dest): переименовывает файл или каталог

        // import java.io.File;
        String pathProject = System.getProperty("user.dir");
        String pathDir = pathProject.concat("/files");
        File dir = new File(pathDir);
        System.out.println(dir.getAbsolutePath());
        if (dir.mkdir()) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
        for (String fname : dir.list()) {
            System.out.println(fname);
        }

        // Работа с файловой системой

        // Бинарные файлы – что это? ///////////////
        // Для чего нужны бинарные файлы?

        // Что такое бинарный формат или файл Бинарный файл — это вид файлов, которые
        // хранятся внутри компьютера.
        // В таких файлах находится информация о часто используемых программах.
        // Таким образом удается быстрее запускать эти программы, потому что нет
        // необходимости полностью их преобразовывать.

        // В чем разница между текстовыми и бинарными файлами?

        // Двоичный файл отличается от текстового тем, что данные в нем представлены во
        // внутренней форме.
        // А поскольку при внутреннем представлении используется двоичная система
        // счисления, то «в честь ее» файлы и называются двоичными.
        // Короче надо изучать!)

        // 3. Логирование: /////////////////////////////////////////////////////////

        // Логи содержат системную информацию работы программного или аппаратного
        // комплекса.
        // В них записываются действия разного приоритета от пользователя, или
        // программного продукта.
        // Процесс ведения логов называют “логированием” (журналированием).

        // - Логирование. Использование: ///

        // Feb 14 1994 07:03:41 ntp: start NTP update
        // Feb 14 1994 10:14:02 syslog: wlceventd_proc_event(527): eth1: Auth
        // BC:DD:C2:88:E2:3F, status: Successful (0), rssi:0
        // Feb 14 1994 10:14:02 syslog: wlceventd_proc_event(556): eth1: Assoc
        // BC:DD:C2:88:E2:3F, status: Successful (0), rssi:0
        // Feb 14 1994 10:20:20 syslog: wlceventd_proc_event(527): eth1: Auth
        // D4:A6:51:07:54:BB, status: Successful (0), rssi:0

        // 3. Логирование. Использование. Основы: ///

        // - Использование:
        // Logger logger = Logger.getLogger();

        // - Уровни важности:
        // INFO, DEBUG, ERROR, WARNING и др.

        // - Вывод:
        // ConsoleHandler info = new ConsoleHandler(); // ConsoleHandler - консольный
        // обработчик
        // log.addHandler(info);

        // - Формат вывода: структурированный, абы как*
        // XMLFormatter, SimpleFormatter

        // Логирование. Использование. Основы:

        // import java.util.logging.*;
        Logger logger = Logger.getLogger(Lecture2.class.getName()); // getLogger - получить регистратор
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

        // Пример:
        // Написать программу для работы с бинарными файлами.
        // Предусмотреть логирование всех действий.
        // Надо изучать!

        // Итоги:
        // Здесь вам не тут!
    }

}
