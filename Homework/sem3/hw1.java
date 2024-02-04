package Homework.sem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Внутри класса MergeSort напишите метод mergeSort,
который принимает массив целых чисел, реализует алгоритм
сортировки слиянием. Метод должен возвращать отсортированный массив.

a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]
 */
public class hw1 {
    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[] { 5, 1, 6, 2, 3, 4 };
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        String itresume_res = Arrays.toString(mergeSort(a));
        System.out.println(itresume_res);
    }

    public static int[] mergeSort(int[] a) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        Collections.sort(list);
        int[] result = list.stream().mapToInt(i -> i).toArray();
        return result;
    }
}
