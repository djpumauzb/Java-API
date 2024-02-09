package Seminar.sem4;

import java.util.Scanner;
import java.util.Stack;

/*
1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди. 
 */
public class tsk3 {
    public static void main(String[] args) {
        
    }

    public static String task3_v1(String[] arr) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < stack.size(); i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < stack.size(); i++) {
            stack.pop();
            
        }
    }
}
