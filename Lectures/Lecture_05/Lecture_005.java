
// Java: знакомство и как пользоваться базовым API (лекции)
// Урок 5. Хранение и обработка данных ч2: множество коллекций Map
// Map – это множество коллекций, работающих с данными по принципу:
// <Ключ / Значение>.
/**
 * План лекции:
 * 1. Обзор функционала Map (Карта)
 * 2. Зачем нужен HashMap (Хэш-Карта)
 * 3. HashMap и работа с ним
 * 4. Обзор функционала TreeMap (Дерево-Карта)
 * 5. Обзор функционала LinkedHashMap (Связная Хэш-Карта)
 * 6. Примеры
 * 
 * Коллекции:
 * Иерархия коллекций ...
 * 
 * 1. Обзор функционала Map: ///////////////////
 * 
 * Иерархия коллекций:
 * 
 * Map => HashMap => LenkedHashMap
 * Map => HashTable
 * Map => SortedMap => NavigableMap => TreeMap
 * 
 * 2. и 3. HashMap: ////////////////////////////
 * 
 * Map – это множество коллекций, работающих с данными
 * по принципу <Ключ / Значение>.
 * 
 * Ключевые особенности:
 * ● допускаются только уникальные ключи, значения могут повторяться;
 * ● помните про null значения*;
 * ● ускоренная обработка данных;
 * ● порядок добавления не запоминается.
 * 
 * В HashMap элементы располагаются как угодно и могут
 * менять свое положение.
 * 
 */

import java.util.*;

public class Lecture_005 {
    public static void main(String[] args) {

        // Map: - HashMap: (<Ключ / Значение>): Как в Питоне словарь.

        Map<Integer, String> db = new HashMap<>();
        db.put(1, "один"); // put - помещать
        System.out.println(db); // {1=один}
        db.put(2, "два");
        System.out.println(db); // {1=один, 2=два}
        db.put(3, "три");
        System.out.println(db); // {1=один, 2=два, 3=три}
        db.put(31, "три один");
        System.out.println(db); // {1=один, 2=два, 3=три, 31=три один}
        db.put(13, "один три");
        System.out.println(db); // {1=один, 2=два, 3=три, 13=один три, 31=три один}
        db.put(null, "!null");
        System.out.println(db); // {null=!null, 1=один, 2=два, 3=три, 13=один три, 31=три один}
        db.put(null, null);
        System.out.println(db); // {null=null, 1=один, 2=два, 3=три, 13=один три, 31=три один}
        // заменит null
    }
}