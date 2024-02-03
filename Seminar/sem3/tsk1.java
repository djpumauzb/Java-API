package Seminar.sem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на
экран.
 */
public class tsk1 {
    public static void main(String[] args) {
        task1();
    }
    static void task1() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(100)); // 0-100 random integer element
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
