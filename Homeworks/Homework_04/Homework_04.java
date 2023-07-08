package Homeworks.Homework_04;

import java.util.*;
// import java.util.LinkedList;
// import java.util.Arrays;
// import java.util.Scanner;

/**
 * Java: знакомство и как пользоваться базовым API (семинары)
 * Урок 4. Хранение и обработка данных ч1: приоритетные коллекции
 * 
 * Формат сдачи: ссылка на подписанный git-проект.
 * 
 * Задание
 * 
 * 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
 * вернет “перевернутый” список.
 * 
 * 2. Реализуйте очередь с помощью LinkedList со следующими методами:
 * 
 * enqueue() - помещает элемент в конец очереди,
 * // enqueue - поставить в очередь.
 * 
 * dequeue() - возвращает первый элемент из очереди и удаляет его,
 * // dequeue - исключать из очереди.
 * 
 * first() - возвращает первый элемент из очереди, не удаляя.
 * first - первый.
 * 
 * Это задание повышенной сложности, для решения задачи потребуется создать
 * класс-обертку над LinkedList, например:
 * 
 * class MyQueue {
 * private LinkedList elements = new LinkedList();
 * 
 * public MyQueue() { }
 * public MyQueue(LinkedList linkedList) {
 * this.elements = linkedList;
 * }
 * .........
 * }
 * 
 * 3. В калькулятор (урок 1 и 2) добавьте возможность отменить последнюю
 * операцию.
 */
public class Homework_04 {
    public static void main(String[] args) {
        Ex1();
        Ex2();
    }

    static void Ex1() {
        System.out.print("\n");
        System.out.println("Ex1 (перевернуть список): ");

        System.out.println(linkedListWithItemsEx1());
        System.out.println(reverseEx1(linkedListWithItemsEx1()));
    }

    static void Ex2() {
        // enqueueEx2:
        System.out.println();
        System.out.println("Ex2 (enqueueEx2): ");

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите элемент: ");
        int element = sc1.nextInt();

        System.out.println(linkedListWithItemsEx1());
        System.out.println(enqueueEx2(linkedListWithItemsEx1(), element));

        // dequeueEx2:
        System.out.println();
        System.out.println("Ex2 (dequeueEx2): ");

        System.out.println(linkedListWithItemsEx1());
        System.out.println(dequeueEx2(linkedListWithItemsEx1()));

        // firstEx2:
        System.out.println();
        System.out.println("Ex2 (firstEx2): ");

        System.out.println(linkedListWithItemsEx1());
        System.out.println(firstEx2(linkedListWithItemsEx1()));
        sc1.close();
        System.out.println();
    }

    // метод, пусть дан LinkedList с несколькими элементами:
    static LinkedList<Integer> linkedListWithItemsEx1() {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        return linkedList;
    }

    // метод, который вернет “перевернутый” список:
    static LinkedList<Integer> reverseEx1(LinkedList<Integer> linkedList) {
        LinkedList<Integer> reverseLinkedList = new LinkedList<>();
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            reverseLinkedList.add(linkedList.get(i));
        }
        return reverseLinkedList;
    }

    // метод, поставить в очередь, помещает элемент в конец очереди:
    static LinkedList<Integer> enqueueEx2(LinkedList<Integer> linkedList, int element) {
        LinkedList<Integer> enqueueLinkedList = new LinkedList<>();
        for (int i = 0; i < linkedList.size(); i++) {
            enqueueLinkedList.add(linkedList.get(i));
        }
        enqueueLinkedList.addLast(element);
        return enqueueLinkedList;
    }

    // метод, исключить из очереди, возвращает первый элемент из очереди не удаляя:
    static LinkedList<Integer> dequeueEx2(LinkedList<Integer> linkedList) {
        LinkedList<Integer> dequeueLinkedList = new LinkedList<>();
        for (int i = 0; i < linkedList.size(); i++) {
            dequeueLinkedList.add(linkedList.get(i));
        }
        System.out.println(dequeueLinkedList.getFirst());
        dequeueLinkedList.getFirst();
        // dequeueLinkedList.peekFirst();
        dequeueLinkedList.removeFirst();
        // dequeueLinkedList.pollFirst();
        return dequeueLinkedList;

    }

    // метод, возвращает первый элемент из очереди, не удаляя его:
    static LinkedList<Integer> firstEx2(LinkedList<Integer> linkedList) {
        LinkedList<Integer> firstLinkedList = new LinkedList<>();
        for (int i = 0; i < linkedList.size(); i++) {
            firstLinkedList.add(linkedList.get(i));
        }
        System.out.println(firstLinkedList.getFirst());

        firstLinkedList.getFirst();
        // firstLinkedList.peekFirst();
        return firstLinkedList;
    }

}