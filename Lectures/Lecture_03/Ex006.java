package Lectures.Lecture_03;

import java.util.*; // импорт всех коллекций

public class Ex006 {
    public static void main(String[] args) {
        Character value = null;
        List<Character> list1 = new ArrayList<Character>();
        list1.add('S');
        list1.add('e');
        list1.add('r');
        list1.add('g');
        list1.add('e');
        list1.add('y');
        System.out.println(list1);
        list1.remove(1); // java.lang.UnsupportedOperationException
        System.out.println(list1);
        List<Character> list2 = List.copyOf(list1);
        System.out.println(list2);

    }
}
