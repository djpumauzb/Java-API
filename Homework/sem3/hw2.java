package Homework.sem3;

import java.util.ArrayList;
import java.util.Arrays;

/*
Дан произвольный массив целых чисел. Создайте список ArrayList,
заполненный данными из этого массива. Необходимо удалить из списка
четные числа и вернуть результирующий.

Напишите свой код в методе removeEvenNumbers класса Answer. 
Метод removeEvenNumbers принимает на вход один параметр: Integer[] arr - список целых 
чисел, возвращает список ArrayList<Integer>

Примеры.
Исходный массив:
1, 2, 3, 4, 5, 6, 7, 8, 9

Результат:
[1, 3, 5, 7, 9]

Исходный массив:
2, 4, 6, 8

Результат:
[]
 */
public class hw2 {
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }
        // ArrayList<Integer> resultList = removeEvenNumbers(arr); // Получаем результат
        // System.out.println(resultList); // Выводим результат на экран
        removeEvenNumbers(arr);
    }

    // public static ArrayList<Integer> removeEvenNumbers(Integer[] arr) {
    public static void removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> resuList = new ArrayList<>();
        
        for (Integer i : arr) {
            if (i % 2 != 0) resuList.add(i);
        }
        System.out.println(resuList);
    }
}
