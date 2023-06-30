package Lectures.Lecture_03;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

import java.util.*; // импорт всех коллекций

/**
 * Коллекции JAVA. Введение.
 *
 * У меня есть план:
 *
 * 1. Тип, который может быть чем угодно
 * 2. Обобщения
 * 3. Массивы и их проблемы
 * 4. Самая «простая» коллекция
 * 5. Функционал
 * 6. Куда двигаться дальше
 */

public class Lecture_003 {

    public static void main(String[] args) {
        // 1. Object:
        /**
         * Тип данных Object – «всему голова»
         * Упаковка – любой тип можно положить в переменную типа Object
         * Распаковка – преобразование Object-переменной в нужный тип
         * Иерархия типов – любой тип «ниже» Object’а
         * Животные - Млекопитающие - Приматы - Человек разумный
         */
        Object o = 1;
        GetType(o); // java.lang.Integer - джава язык целое число
        o = 1.2;
        GetType(o); // java.lang.Double

        System.out.println(Sum(1, 2)); // 3
        System.out.println(Sum(1.0, 2)); // 0
        System.out.println(Sum(1, 2.0)); // 0
        System.out.println(Sum(1.2, 2.1)); // 3.3
        System.out.println(Sum("каша", "маша")); // 0 // так в методе нужно прописать..

        // 2. Масивы:
        /**
         * arraycopy(источник, 2, назначения, 5, 7), вы скопируете семь элементов из
         * массива-источника в итоговый массив, начиная со второго индекса источника в
         * пятый индекс результирующего массива.
         * 
         * Масивы RAM (STACK - HEAP)
         */
        // Проблема. Как увеличить размер массива? Есть массив из 2 элементов:
        int[] a = new int[] { 1, 9 };
        int[] b = new int[3];
        // копируем 2 эл из a(с 0 инд) в b (с 0 инд):
        System.arraycopy(a, 0, b, 0, a.length); // 1 9 0

        for (int i : a) {
            System.out.printf("%d ", i); // 1 9
        }
        for (int j : b) {
            System.out.printf("%d ", j); // 1 9 0
        }
        // 1 9 1 9 0

        System.out.print("\n"); // с новой строки для сл.примера.

        // Дабавить элемент и увеличить размер масива:
        int[] c = new int[] { 0, 9 };
        for (int i : c) {
            System.out.printf("%d ", i); // 0 9
        }
        c = AddItem(c, 2);
        c = AddItem(c, 3);
        for (int j : c) {
            System.out.printf("%d ", j); // 0 9 0 9 2 3
        }
        System.out.print("\n"); // с новой строки для сл.примера.

        // 3. Коллекции:
        /**
         * - Иерархия коллекций (на схеме реализовывает и расширяет)
         *
         * - Иерархия коллекций. ArrayList:
         * «Удобный массив»
         * Разные способы создания:
         * ArrayList list = new ArrayList();
         * ArrayList<Integer> list1 = new ArrayList<Integer>();
         * ArrayList<Integer> list2 = new ArrayList<>();
         * ArrayList<Integer> list3 = new ArrayList<>(10);
         * ArrayList<Integer> list4 = new ArrayList<>(list3);
         * - Иерархия коллекций. List:
         * List – пронумерованный набор элементов.
         *
         * Документация (методы .....): !!!!!!!!!!!
         * https://docs.oracle.com/javase/8/docs/api/java/util/List.html
         *
         * Пользователь этого интерфейса имеет точный контроль над тем,
         * где в списке вставляется каждый элемент.
         * Пользователь может обращаться к элементам по их целочисленному
         * индексу (позиции в списке) и искать элементы в списке.
         * ArrayList, LinkedList (Vector, Stack – устаревшие)
         */

        // 3.1 Коллекции Row Type:
        // https://docs.oracle.com/javase/tutorial/java/generics/rawTypes.html

        // import java.util.ArrayList;
        // import java.util.List;
        List list = new ArrayList();
        list.add(2809);
        list.add(" string line");
        for (Object k : list) {
            System.out.print(k); // 2809 string line
            // Проблема извлечения данных
        }
        System.out.print("\n"); // с новой строки для сл.примера.

        // 3.2 Коллекции. Save Type (сохранить тип):

        // import java.util.ArrayList;
        // import java.util.List;
        List<Integer> lisT = new ArrayList<Integer>();
        lisT.add(1);
        lisT.add(123);
        // list.add("string line");
        for (Object h : lisT) {
            System.out.print(h); // 1123
            // Проблема извлечения данных
        }
        // Ошибки на этапе компиляции лучше ошибок времени выполнения.
        // Повторное использование кода.

        // - Иерархия коллекций. ArrayList:
        // «Удобный массив»
        // Разные способы создания
        // ArrayList<Integer> list_1 = new ArrayList<Integer>();
        // ArrayList<Integer> list_2 = new ArrayList<>();
        // ArrayList<Integer> list_3 = new ArrayList<>(10);
        // ArrayList<Integer> list_4 = new ArrayList<>(list3);

        // 3.3 Коллекции. Функционал:

        // add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
        // get(pos) – возвращает элемент из списка по указанной позиции
        // indexOf(item) – первое вхождение или -1
        // lastIndexOf(item) – последнее вхождение или -1
        // remove(pos) – удаление элемента на указанной позиции и его возвращение
        // set(int pos, T item) – gjvtoftn значение item элементу, который находится
        // на позиции pos
        // void sort(Comparator) – сортирует набор данных по правилу
        // subList(int start, int end) – получение набора данных от позиции start до end

        // Коллекции. Функционал:

        // clear() – очистка списка
        // toString() – «конвертация» списка в строку
        // Arrays.asList – преобразует массив в список
        // containsAll(col) – проверяет включение всех элементов из col
        // removeAll(col) – удаляет элементы, имеющиеся в col
        // retainAll(col) – оставляет элементы, имеющиеся в col
        // toArray() – конвертация списка в массив Object’ов
        // toArray(type array) – конвертация списка в массив type
        // List.copyOf(col) – возвращает копию списка на основе имеющегося
        // List.of(item1, item2,...) – возвращает неизменяемый список

        // Коллекции. Функционал:

        System.out.print("\n"); // с новой строки для сл.примера.

        // Метод Arrays.asList(), который является частью Java Collections Framework,
        // введенный в Java 1.2, упрощает создание списков. Он может принимать массив в
        // качестве входных данных и создавать фиксированный List объектов из
        // предоставленного массива:

        // import java.util.Arrays;
        // import java.util.List;
        int day = 29;
        int month = 9;
        int year = 1990;
        Integer[] date = { day, month, year };
        List<Integer> d = Arrays.asList(date); // Arrays.asList - массивы как(в) список
        System.out.println(d); // [29, 9, 1990]

        // 3.4 Коллекции. Функционал:

        // import java.util.Arrays;
        // import java.util.List;
        StringBuilder daY = new StringBuilder("28"); // StringBuilder - построитель строк
        StringBuilder montH = new StringBuilder("9");
        StringBuilder yeaR = new StringBuilder("1990");
        StringBuilder[] datE = { daY, montH, yeaR };
        List<StringBuilder> p = Arrays.asList(datE);
        System.out.println(p); // [28, 9, 1990]

        montH = new StringBuilder("09"); // не изменит с 9 на 09 - вывод [28, 9, 1990] - ошибки не будет

        // !надо вот так менять и заново на печать:
        datE[1] = new StringBuilder("09");
        System.out.println(p); // [28, 09, 1990]

        // Коллекции. Функционал:

        // import java.util.*;
        Character value = null;
        List<Character> list1 = new ArrayList<Character>();
        list1.add('S');
        list1.add('e');
        list1.add('r');
        list1.add('g');
        list1.add('e');
        list1.add('y');
        System.out.println(list1); // [S, e, r, g, e, y]
        list1.remove(1); // e -удалит
        System.out.println(list1); // [S, r, g, e, y]
        List<Character> list2 = List.copyOf(list1);
        System.out.println(list2); // [S, r, g, e, y]

        // Коллекции. Функционал:

        // import java.util.*;
        Character valuE = null;
        List<Character> list12 = List.of('S', 'e', 'r', 'g', 'e', 'y');
        System.out.println(list12);
        // list1.remove(1); // java.lang.UnsupportedOperationException
        List<Character> list22 = List.copyOf(list12);
        // not null, immutable // использовать выше вариант для remove....

        // 4. Итератор:

        // Получение итератора с целью более гибкой работы с данными URL:

        // 4.1 Документация:
        // https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

        // Интерфейс Iterator<E>.
        // Итератор коллекцией. Iterator занимает место Enumeration в Java Collections
        // Framework.
        // Итераторы отличаются от перечислений двумя способами:
        // Итераторы позволяют вызывающей стороне удалять элементы из базовой коллекции
        // во время итерации с четко определенной семантикой.

        // 4.2 Итератор. Функционал (читай документацию):
        /**
         * forEachRemaining(Consumer<? super E> action) - выполняет данное действие для
         * каждого оставшегося элемента, пока все элементы не будут обработаны или
         * действие не вызовет исключение. (Модификатор и тип default void)
         *
         * hasNext() - возвращает true, если итерация имеет больше элементов.
         * (Модификатор и тип boolean)
         *
         * next() - возвращает следующий элемент в итерации. (Модификатор и тип E, E -
         * тип элементов, возвращаемых этим итератором)
         *
         * remove() - удаляет из базовой коллекции последний элемент, возвращенный этим
         * итератором (дополнительная операция). (Модификатор и тип default void).
         */
        // 4.4 ListIterator<E>:

        // 4.4.1 Документация:
        // https://docs.oracle.com/javase/7/docs/api/java/util/ListIterator.html

        // 4.4.2 Функционал: методы.
        /**
         * Модификатор и тип // Метод и описание
         *
         * void // add(E e) - вставляет указанный элемент в список (дополнительная
         * операция).
         *
         * boolean // hasNext() - возвращает true, если этот итератор списка имеет
         * больше элементов при обходе списка в прямом направлении.
         *
         * boolean // hasPrevious() - возвращает true, если этот итератор списка имеет
         * больше элементов при обходе списка в обратном направлении.
         *
         * E // next() - возвращает следующий элемент в списке и продвигает позицию
         * курсора.
         *
         * int // nextIndex() - возвращает индекс элемента, который будет возвращен
         * последующим вызовом next().
         *
         * E // previous() - возвращает предыдущий элемент в списке и перемещает позицию
         * курсора назад.
         *
         * int // previousIndex() - возвращает индекс элемента, который будет возвращен
         * последующим вызовом previous().
         *
         * void remove() - удаляет из списка последний элемент, возвращенный оператором
         * next()или previous()(необязательная операция).
         *
         * void // set(E e) - заменяет последний элемент, возвращенный указанным
         * элементом next()или previous()указанным элементом (дополнительная операция).
         */
        // 4.5 Итератор:
        /**
         * Прежде чем вы сможете получить доступ к коллекции через итератор, вы должны
         * ее получить.
         * Каждый из классов коллекции предоставляет метод iterator (), который
         * возвращает итератор в начало коллекции.
         * Используя этот объект итератора, вы можете получить доступ к каждому элементу
         * в коллекции, по одному элементу за раз.
         * В общем случае, чтобы использовать итератор для циклического перемещения
         * содержимого коллекции, выполните следующие действия:
         *
         * - Получите итератор в начале коллекции, вызвав метод iterator() коллекции.
         * - Настройте цикл, который вызывает hasNext().
         * - Повторяйте цикл, пока hasNext() возвращает true.
         * - Внутри цикла получите каждый элемент, вызывая next().
         */

        // 4.5 Итератор:

        // import java.util.*;
        List<Integer> liSt = List.of(1, 12, 123, 1234, 12345); // колекция
        for (int item : liSt) {
            System.out.println(item);
        }
        Iterator<Integer> col = liSt.iterator();
        // iterator() - возвращает итератор в начало коллекции
        while (col.hasNext()) {
            // hasNext() - возвращает true, если итерация имеет больше элементов при обходе
            // списка в прямом направлении.
            System.out.println(col.next());
            // next() - возвращает следующий элемент в списке и продвигает позицию курсора.
        }

        // 4.6 Итератор:

        // import java.util.*;
        List<Integer> lIst = List.of(10, 129, 1234, 12347, 12345); // колекция
        for (int item : lIst) {
            System.out.println(item);
        }
        Iterator<Integer> cole = lIst.iterator();
        while (cole.hasNext()) {
            // System.out.println(cole.next());
            cole.next();
            cole.remove();
            // Exception in thread "main" java.lang.UnsupportedOperationException
        }

        // Итоги:
        // Отрицание, гнев, торг…

    }

    static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());

    }

    static Object Sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) { // instanceof - экземпляр
            return (Object) ((Double) a + (Double) b);
        } else if (a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer) a + (Integer) b);
        } else
            return 0;

        // static int Sum(int a, int b) { ... } - мы так делали, выше ч/з объект
        // static double Sum(double a, double b) { ... }
        // static String Sum(String a, String b) { ... }
    }

    static int[] AddItem(int[] array, int item) { // добавлять элемент
        int length = array.length;
        int[] temp = new int[length + 1]; // +1 - увеличение длины для добавления элемента
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }
}
