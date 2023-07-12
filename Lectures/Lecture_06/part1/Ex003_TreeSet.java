package Lesson_06.part1;

import java.util.*;

public class Ex003_TreeSet {
    public static void main(String[] args) {
        var a = new TreeSet<>(Arrays.asList(1, 7, 2, 3, 6, 4, 5));
        var b = new TreeSet<>(Arrays.asList(13, 3, 17, 7, 2, 11, 5));

        System.out.println(a); // [1, 2, 3, 4, 5, 6, 7] Ещё и сортирует от меньшего к большему)
        System.out.println(b); // [2, 3, 5, 7, 11, 13, 17]
        System.out.println(a.headSet(4)); // [1, 2, 3] // отсортирует и вернёт знач с головы до 4, не вкл 4.
        System.out.println(a.tailSet(4)); // [4, 5, 6, 7] // осорт и вернёт знач с хвоста с 4 знач до конца.
        System.out.println(a.subSet(3, 5)); // [3, 4] // осорт и вернёт на срезе от 3 знач до 5 знач не вкл.
    }
}