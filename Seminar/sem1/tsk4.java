package Seminar.sem1;

import java.util.Arrays;

/*
Задание №5 (доп)
Во фразе "Добро пожаловать на курс по Java" переставить слова
в обратном порядке.
 */
public class tsk4 {
    public static void main(String[] args) {
        System.out.println(task4("Welcome to the Java course"));
    }
    static String task4(String str) {
        String[] words = str.split(" "); // [Welcome, to, the, Java, course]
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length-1-i];
            words[words.length-1-i] = temp;
        }
        return Arrays.toString(words);
    }
}
