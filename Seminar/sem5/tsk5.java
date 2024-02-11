package Seminar.sem5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
Взять набор строк, например,
Мороз и солнце день чудесный Еще ты дремлешь друг
прелестный Пора красавица проснись.

Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с
одинаковой длиной не должны “потеряться”.
 */
public class tsk5 {
    public static void main(String[] args) {
        task5("Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись");
    }

    static void task5(String string) {
        Map<Integer, List<String>> map = new TreeMap<>();
        String[] arr = string.split(" ");
        for (int i = 0; i < arr.length; i++) {
            int len = arr[i].length();
            if (map.containsKey(len)) {
                List<String> list = map.get(len);
                list.add(arr[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(arr[i]);
                map.put(len, list);
            }
        }
        System.out.println(map);
    }
}
