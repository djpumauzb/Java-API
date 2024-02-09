package Seminar.sem4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class tsk0 {
    public static void main(String[] args) {
        task0();
    }

    static void task0() {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list1.add(0,i);
        }
        long middle = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list2.add(0,i);
        }
        long finish = System.currentTimeMillis();
        System.out.println(middle-start);
        System.out.println(finish-middle);
    }
    
}