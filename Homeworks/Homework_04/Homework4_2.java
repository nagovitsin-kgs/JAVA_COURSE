package Homeworks.Homework_04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Homework4_2 {
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();
        boolean menu = true;
        while (menu) {
            Scanner sc = new Scanner(System.in);
            System.out.println(
                    "Введите '1' если хотите добавить элемент в очередь,\nВведите '2'" +
                            " если хотите вернуть первый элемент и удалить его,\nВведите '3'" +
                            " если хотите вернуть первый элемент, не удаляя его,\nДля выхода из меню нажмите '4': ");
            String operation = sc.nextLine();
            switch (operation) {
                case "1":
                    enqueue(list, sc);
                    break;
                case "2":
                    dequeue(list);
                    break;
                case "3":
                    first(list);
                    break;
                case "4":
                    menu = false;
                    break;
                default:
                    System.out.println("Что - то ввели неправильное. Попробуйте еще раз!)");
                    break;
            }
            // sc.close(); // Не работает с закрытым сканером
        }
    }

    public static void enqueue(Queue<Integer> lst, Scanner sc) {
        System.out.println("Введите любое число для добавления в конец очереди: ");
        int element = sc.nextInt();
        lst.add(element);
        System.out.println("Текущий список: " + lst);
        System.out.println();
        sc.nextLine();
    }

    public static void dequeue(Queue<Integer> lst) {
        if (lst.isEmpty()) {
            System.out.println("Список итак пуст");
            System.out.println();
        }

        else if (!lst.isEmpty()) {
            lst.poll();
            System.out.println("Первый элемент удален\nТекущий список :" + lst);
            System.out.println();
        }
    }

    public static void first(Queue<Integer> lst) {
        if (lst.isEmpty())
            System.out.println("В списке нет никаких элементов");
        else if (!lst.isEmpty())
            System.out.println("Первый элемент в списке: " + lst.element());
        System.out.println();
    }
}
