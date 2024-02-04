package Homework.sem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Реализуйте метод, который принимает на вход целочисленный массив arr:
- Создаёт список ArrayList, заполненный числами из исходого массива arr.
- Сортирует список по возрастанию и выводит на экран.
- Находит минимальное значение в списке и выводит на экран - Minimum is {число} - Находит максимальное значение в списке и выводит на экран - Maximum is {число}
- Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:

Integer[] arr - массив целых чисел.

Пример.
Исходный массив:
4, 2, 7, 5, 1, 3, 8, 6, 9

Результаты:

[1, 2, 3, 4, 5, 6, 7, 8, 9]
Minimum is 1
Maximum is 9
 */
public class hw3 {
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[] { 4, 2, 7, 5, 1, 3, 8, 6, 9 };
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        analyzeNumbers(arr);
    }

    public static void analyzeNumbers(Integer[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (Integer i : arr) {
            list.add(i);
        }

        int sum = 0;
        for (Integer j : list) {
            sum += j;
        }
        double Average = (double) sum / list.size();

        Collections.sort(list);
        int Minimum = Collections.min(list);
        int Maximum = Collections.max(list);

        System.out.println(list);
        System.out.println("Minimum is " + Minimum);
        System.out.println("Maximum is " + Maximum);
        System.out.println("Average is = " + Average);
    }
}
