
// Приоритетные коллекции. PriorityQueue. LinkedList. Stack. Deque ...
// Хранение и обработка данных, чаcть I
/**
 * Java collections framework (JCF) — это набор связанных классов и интерфейсов,
 * реализующих широко используемые структуры данных — коллекции.
 * 
 * Класс LinkedList — еще одна реализация интерфейса List . Представляет из себя
 * двусвязный список, где каждый элемент структуры содержит ссылки на предыдущий
 * и следующий элементы. По этим ссылкам можно переходить от одного элемента к
 * другому.
 * Чем отличается LinkedList и list?
 * Эта структура состоит из набора узлов, каждый из которых содержит ссылку на
 * следующий и следующий узел в списке, и может содержать значение. Основное
 * преимущество LinkedList заключается в том, что вставка или удаление элемента
 * в середине списка выполняется быстрее, чем в массиве.
 * 
 * Queue (перевод очередь)- коллекция, предназначенная для хранения элементов в
 * порядке, нужном для их обработки. В дополнение к базовым операциям интерфейса
 * Collection, очередь предоставляет дополнительные операции вставки, получения
 * и контроля.
 * 
 * Deque — это интерфейс, который добавили в 6 версии Java. Он включает в себя
 * ряд полезных для очередей методов и дает возможность очереди функционировать
 * как двунаправленная очередь. То есть работать по принципу FIFO или LIFO.
 * Одним из двух наследников Deque является ArrayDeque.
 * 
 * Stack — это линейная структура данных, которая следует принципу LIFO
 * (последний пришел, первый ушел). Это означает, что объекты могут быть
 * вставлены или удалены только с одного конца, также называемого вершиной.
 * 
 * У меня есть план:
 * 1. Разобраться, зачем нужно столько коллекций и JCF
 * 2. LinkedList и особенности работы с ним
 * 3. Узнать о списках, как об абстрактной структуре
 * 4. Проблемы работы со списками и массивами
 * 5. Построение разных Queue и как в этом помогает JCF
 * 6. Deque и логика использования этой коллекции
 * 7. То, что мертво, умереть не может – Stack в контексте JCF
 * 8. PriorityQueue
 * 
 * 1. Зачем разные коллекции? ///
 * 
 * а). Способ обработки данных
 * б). Решаемые задачи
 * 
 * 2. LinkedList: (п. 3 и 4)
 * 
 * Представляет собой двусвязный список.
 * Список – гибкая структура данных, позволяющая легко менять свой
 * размер. Элементы доступны для вставки или удаления в любой позиции.
 * [] => [] => [] => [] =>
 * 
 * В массиве. Чем такой способ организации лучше? Или хуже?
 * - Добавление в конец списка.
 * 
 * В LinkedList. Чем такой способ организации лучше? Или хуже?
 * - Добавление в середину списка.
 * - Удаление из списка списка.
 * - Односвязный список.
 * - Двусвязный список.
 * Что нам с этого?
 * Количество операций меньше => скорость доступа к данным выше.
 * 
 * Мотивация:
 * LinkedList нужен для небольшого количества элементов, в которых операции
 * добавления\удаления встречаются чаще операций чтения.
 * 
 * Потренируйтесь с операциями добавления\удаление
 * в двусвязном и циклическом списках.
 * 
 * 5. Queue (очередь) колекция: ///////////////////////////
 * 
 * Очередь в магазине.
 * Методы интерфейса Queue:
 * Е element() - возвращает элемент из головы очереди. Элемент не удаляется.
 * Если очередь пуста, инициируется исключение NoSuchElementException. Е
 * remove() - удаляет элемент из головы очереди, возвращая его.
 * 
 * // import java.util.*;
 * // public class Ex002_Queue {
 * // public static void main(String[] args) {
 * // Queue<Integer> queue = new LinkedList<Integer>();
 * // queue.add(1);
 * // queue.add(2);
 * // queue.add(3);
 * // queue.add(4);
 * // System.out.println(queue); // [1, 2, 3, 4]
 * // int item = queue.remove(); // удалит эл сначала
 * // System.out.println(queue); // [2, 3, 4]
 * // queue.offer(2809); // добавить в конец
 * // item = queue.remove();
 * // System.out.println(queue); // [3, 4, 2809]
 * // item = queue.remove();
 * // System.out.println(queue); // [4, 2809]
 * // item = queue.poll(); // item = queue.remove(); - удалять сначала
 * // System.out.println(queue); // [2809]
 * // System.out.println(queue.peek()); // 2809
 * // // peek() - убирает скобки у последней операции System.out.println(queue);
 * // }
 * // }
 * 
 * // import java.util.*;
 * // public class Ex002_Queue {
 * // public static void main(String[] args) {
 * // Queue<Integer> queue = new LinkedList<Integer>();
 * // queue.add(1);
 * // int item = queue.remove();
 * // queue.offer(2809);
 * // item = queue.poll();
 * // System.out.println(queue);
 * 
 * // }
 * // }
 * 
 * // import java.util.*;
 * // public class Ex002_Queue {
 * // public static void main(String[] args) {
 * // Queue<Integer> queue = new LinkedList<Integer>();
 * // queue.add(1);
 * // int item = queue.remove();
 * // queue.offer(2809);
 * // item = queue.poll();
 * // System.out.println(queue);
 * // queue.element();
 * // queue.peek();
 * // }
 * // }
 * 
 * // import java.util.*;
 * // public class Ex002_Queue {
 * // public static void main(String[] args) {
 * // Queue<Integer> queue = new LinkedList<Integer>();
 * // queue.add(1);
 * // int item = queue.remove();
 * // queue.offer(2809);
 * // item = queue.poll();
 * // System.out.println(queue);
 * // queue.remove(2809); // зачем очередь??
 * // queue.element();
 * // queue.peek();
 * // }
 * // }
 * 
 * // Иерархия коллекций
 * 
 * 8. PriorityQueue: ////////////////////////////
 * 
 * priority queue) — это абстрактная структура данных наподобие стека или
 * очереди, где у каждого элемента есть приоритет. Элемент с более высоким
 * приоритетом находится перед элементом с более низким приоритетом. Если у
 * элементов одинаковые приоритеты, они располагаются в зависимости от своей
 * позиции в очереди.
 * 
 * Как работает PriorityQueue?
 * 
 * Обычная очередь извлекает элементы в порядке их добавления — first in first
 * out. Очередь с приоритетами извлекает элементы в порядке приоритета от
 * меньшего к большему. При этом PriorityQueue не гарантирует сохранение порядка
 * извлечения для элементов с одинаковым приоритетом.
 * Наивысший приоритет имеет «наименьший» элемент.
 * 
 * 9. Deque – double ended queue: ////////////////////////////////
 * Что такое Dequeue чем отличается от Queue? 
 * 
 * Deque – это сокращение от «double ended queue» (двусторонняя очередь).
 * Технически Deque является расширением интерфейса очереди Queue. Интерфейс
 * Deque реализуют всё тот же LinkedList, а также ArrayDeque.
 * Deque - Линейная коллекция, которая поддерживает вставку и удаление
элементов на обоих концах. | url: - документация и методы ... :
https://docs.oracle.com/javase/7/docs/api/java/util/Deque.html

Модификатор и тип / Метод и описание

boolean	/ add(E e) -
Вставляет указанный элемент в очередь, представленную этой двухсторонней очередью (другими словами, в конец этой двухсторонней очереди), если это возможно сделать немедленно, не нарушая ограничений емкости, возвращая значение true в случае успеха и вызывая исключение IllegalStateException , если в настоящее время нет свободного места. .

void /	addFirst(E e) -
Вставляет указанный элемент в начало этой двухсторонней очереди, если это возможно сделать немедленно, не нарушая ограничения емкости.

void /	addLast(E e) -
Вставляет указанный элемент в конец этой двухсторонней очереди, если это возможно сделать немедленно, не нарушая ограничений емкости.

boolean /  contains(Object o) -
Возвращает true , если эта двухсторонняя очередь содержит указанный элемент.

Iterator<E> /	descendingIterator() -
Возвращает итератор по элементам в этой двухсторонней очереди в обратном порядке.

E /	element() -
Извлекает, но не удаляет голову очереди, представленной этой двухсторонней очередью (другими словами, первый элемент этой двухсторонней очереди).

E / get(i) - 
Извлекает, но не удаляет все элементы этой двухсторонней очереди в правильной последовательности.

E /	getFirst() -
Извлекает, но не удаляет первый элемент этой двухсторонней очереди.

E /	getLast() -
Извлекает, но не удаляет последний элемент этой двухсторонней очереди.

Iterator<E> /	iterator() -
Возвращает итератор по элементам в этой двухсторонней очереди в правильной последовательности.

boolean	/ offer(E e) -
Вставляет указанный элемент в очередь, представленную этой двухсторонней очередью (другими словами, в конец этой двухсторонней очереди), если это возможно сделать немедленно, не нарушая ограничения емкости, возвращая true в случае успеха и false, если в настоящее время нет свободного места.

boolean /	offerFirst(E e) -
Вставляет указанный элемент в начало этой двухсторонней очереди, если это не нарушает ограничения емкости.

boolean	/ offerLast(E e) -
Вставляет указанный элемент в конец этой двухсторонней очереди, если только это не нарушает ограничения емкости.

E /	peek() -
Извлекает, но не удаляет заголовок очереди, представленной этой двухсторонней очередью (другими словами, первый элемент этой двухсторонней очереди), или возвращает значение null , если эта двухсторонняя очередь пуста.

E /	peekFirst() -
Извлекает, но не удаляет первый элемент этой двухсторонней очереди или возвращает значение null , если эта двухсторонняя очередь пуста.

E / peekLast() -
Извлекает, но не удаляет, последний элемент этой двухсторонней очереди или возвращает значение null , если эта двухсторонняя очередь пуста.

E /	poll() -
Извлекает и удаляет голову очереди, представленной этой двухсторонней очередью (другими словами, первый элемент этой двухсторонней очереди), или возвращает значение null , если эта двухсторонняя очередь пуста.

E /	pollFirst() -
Извлекает и удаляет первый элемент этой двухсторонней очереди или возвращает значение null , если эта двухсторонняя очередь пуста.

E /	pollLast() -
Извлекает и удаляет последний элемент этой двухсторонней очереди или возвращает значение null , если эта двухсторонняя очередь пуста.

E /	pop() -
Извлекает элемент из стека, представленного этой двухсторонней очередью.

void /	push(E e) -
Помещает элемент в стек, представленный этой двухсторонней очередью (другими словами, в начало этой двухсторонней очереди), если это возможно сделать немедленно, не нарушая ограничений емкости, возвращая значение true в случае успеха и вызывая исключение IllegalStateException , если в настоящее время нет свободного места.

E /	remove() -
Извлекает и удаляет голову очереди, представленной этой двухсторонней очередью (другими словами, первый элемент этой двухсторонней очереди).

boolean /	remove(Object o) -
Удаляет первое вхождение указанного элемента из этой двухсторонней очереди.

E /	removeFirst() -
Извлекает и удаляет первый элемент этой двухсторонней очереди.

boolean /	removeFirstOccurrence(Object o) -
Удаляет первое вхождение указанного элемента из этой двухсторонней очереди.

E /	removeLast() -
Извлекает и удаляет последний элемент этой двухсторонней очереди.

boolean /	removeLastOccurrence(Object o) -
Удаляет последнее вхождение указанного элемента из этой двухсторонней очереди.

int	/ size() -
Возвращает количество элементов в этой двухсторонней очереди.

10. Stack: //////////////

Иерархия коллекций:
ArrayList  <=  List  =>  LinkedList
List =>  Vector  =>  Stack

Stack представляет собой обработку данных по принципу LIFO.
Расширяет Vector пятью операциями, которые позволяют рассматривать
вектор как стек.
push(E item) - толкает эл в список
pop() - удаляет и возвращает посл эл в списке

Stack и Vector не рекомендованы к использованию

11. Демка ///////

Stack:
Вычислить значение выражения в постфиксной форме записи:
1 + 2 * 3          (1 + 2) * 3
1 2 3 * +           1 2 + 3 *

1 2 3 * +            СТЕК
                      1

3 * +                СТЕК
                      2
                      1

* +                  СТЕК
                      3
                      2
                      1

+                    СТЕК
                      6
                      1

                     СТЕК
                      7

Итоги:
Долго, много и не все нужно.
*/

import java.util.*;

public class Lecture_004 {
    public static void main(String[] args) {

        // Queue:

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue); // [1, 2, 3, 4]
        int item = queue.remove(); // удалит эл сначала
        System.out.println(queue); // [2, 3, 4]
        queue.offer(2809); // добавить в конец
        item = queue.remove();
        System.out.println(queue); // [3, 4, 2809]
        item = queue.remove();
        System.out.println(queue); // [4, 2809]
        item = queue.poll(); // item = queue.remove(); - удалять сначала
        System.out.println(queue); // [2809]
        System.out.println(queue.peek()); // 2809
        // peek() - убирает скобки у последней операции System.out.println(queue);

        System.out.println();

        // Deque:

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.removeLast();
        deque.removeLast();
        deque.offerFirst(1);
        deque.offerLast(2);
        deque.pollFirst();
        deque.pollLast();
        deque.addFirst(55);
        deque.addLast(88);
        deque.getFirst(); // извлекает 1 эл, если нет - ошибка
        deque.getLast(); // извлекает последний эл
        deque.peekFirst(); // извлекает 1 эл, если пусто, то null
        deque.peekLast(); // извлекает посл эл, если пусто, то null
        System.out.println(deque); // [55, 88]

        System.out.println();

        // Stack:

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(12);
        stack.push(123);
        System.out.println(stack); // [1, 12, 123]
        System.out.println(stack.pop()); // 123 - удаляет и возвращает посл эл
        System.out.println(stack.pop()); // 12
        System.out.println(stack.pop()); // 1
        System.out.println(stack); // []

    }
}