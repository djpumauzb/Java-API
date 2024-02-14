package Seminar.sem6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества. 
2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества. 
3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  
Распечатайте содержимое данного множества.
 */
public class tsk0 {
    public static void main(String[] args) {
        task0();
    }

    static void task0 () {
        String[] strings = {"asdasdasdsa", "uyasgdHAasd", "adhjfbvah", "opghklgdf"};
        Set<String> set1 = new HashSet<>(Arrays.asList(strings)); //sortirofka har xil
        Set<String> set2 = new LinkedHashSet<>(Arrays.asList(strings)); // kak v orginal
        Set<String> set3 = new TreeSet<>(Arrays.asList(strings)); //sortirofka har xil by alphabet
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }
}
