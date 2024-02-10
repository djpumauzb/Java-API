package Homework.sem4;
/*
В классе MyQueue реализуйте очередь для типа данных Integer с 
помощью LinkedList со следующими методами:

enqueue() - помещает элемент в конец очереди
dequeue() - возвращает первый элемент из очереди и удаляет его
first() - возвращает первый элемент из очереди, не удаляя
getElements() - возвращает все элементы в очереди

Пример:
queue.enqueue(1);
queue.enqueue(10);
queue.enqueue(15);
queue.enqueue(5);
System.out.println(queue.getElements()); 

Результат:
[1, 10, 15, 5]
queue.dequeue();
queue.dequeue();
System.out.println(queue.getElements());

Результат:
[15, 5]
System.out.println(queue.first());

Результат:
15
 */
import java.util.LinkedList;

public class hw2 {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }

    static class MyQueue<T> {
        // Напишите свое решение ниже
        private LinkedList<T> list = new LinkedList<>();
        public void enqueue(T element) {
            // Напишите свое решение ниже
            list.addLast(element);
        }

        public T dequeue() {
            // Напишите свое решение ниже
            return list.pollFirst();
        }

        public T first() {
            // Напишите свое решение ниже
            return list.peekFirst();
        }

        public LinkedList<T> getElements() {
            // Напишите свое решение ниже
            return new LinkedList<>(list);
        }
    }
}
