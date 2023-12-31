package Seminars.Seminar_02;

import java.io.*;

/**
 * Почему вы не можете не использовать API:
 * Полезные ссылки:
 *
 * - JsonFile: http://www.java2s.com/Code/Jar/j/Downloadjsonsimple111jar.htm -
 * скачать json-simple-1.1.1.jar
 *
 * JsonJava:
 * https://www.youtube.com/watch?v=g6vvEEm2hhs&ab_channel=SWIKbyMirTahaAli -
 * установка в VS Code
 */
class Ex_001 {
    public static void main(String[] args) {

        try (FileInputStream fin = new FileInputStream("note.txt");
                FileOutputStream fos = new FileOutputStream("notes_new.txt")) {
            byte[] buffer = new byte[256];
            fin.read(buffer);
            fos.write(buffer, 0, buffer.length);
            System.out.print((char) buffer[5]);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
// для Экселя
// https://tproger.ru/translations/how-to-read-write-excel-file-java-poi-example/

// public class Main
// {
// public static void HomeWork1(){
// System.out.println("Задание номер 1");
// }
// public static void HomeWork2(){
// System.out.println("Задание номер 2");
// }
// public static void HomeWork3(){
// System.out.println("Задание номер 3");
// }
// public static void main(String[] args) {
// HomeWork1();
// HomeWork2();
// HomeWork3();
// }
// }