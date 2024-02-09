package Seminar.sem4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/*
1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди. 
 */
public class tsk3 {
    public static void main(String[] args) {
        String[] arr = { "hello", "hi", "1234", "*%$#*&" };
        task3_v1(arr);
        task3_v2(arr);
    }

    static void task3_v1(String[] arr) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(stack.pop());
        }
    }

    static void task3_v2(String[] arr) {
        Queue<String> queue = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(queue.poll());
        }
    }
}
