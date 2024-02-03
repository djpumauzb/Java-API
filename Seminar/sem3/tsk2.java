package Seminar.sem3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/*
Заполнить список названиями планет Солнечной
системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его
повторений в списке.
Задание состоит из двух блоков

Задание №2.2 (если выполнено первое задание)
Пройти по списку из предыдущего задания и удалить
повторяющиеся элементы.
 */
public class tsk2 {
    public static void main(String[] args) {
        task2();
    }

    static void task2() {
        ArrayList list = new ArrayList<>();
        list.add("asdasd");
        list.add(123);
        list.add(12563);
        list.add("UYGUYBejaihgfi");
        list.add(123.045);
        Iterator iteratorList = list.iterator();
        while (iteratorList.hasNext()) {
            if (iteratorList.next() instanceof String) {
                iteratorList.remove();
            }
        }
        System.out.println(list);
    }
}
