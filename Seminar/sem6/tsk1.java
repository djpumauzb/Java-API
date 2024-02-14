package Seminar.sem6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите 
процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой. 
Для вычисления процента используйте формулу: процент уникальных чисел = количество 
уникальных чисел * 100 / общее количество чисел в массиве.
 */
public class tsk1 {
    public static void main(String[] args) {
        System.out.println(unicPercent(createArr(100, 0, 24)));
    }

    static Integer[] createArr(int n, int min, int max) {
        Integer[] array = new Integer[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(min, max+1);
        }
        return array;
    }

    static double unicPercent(Integer[] array) {
        Set<Integer> set = new HashSet<>(Arrays.asList(array));
        System.out.println(set.size() * 100 / array.length + "%");
        return (double) (set.size()*100) / array.length;
    }
}
