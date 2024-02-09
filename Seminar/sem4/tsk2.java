package Seminar.sem4;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/*
Реализовать консольное приложение, которое:
1. Принимает от пользователя и “запоминает” строки. 
2. Если введено print, выводит строки так, чтобы последняя 
введенная была первой в списке, а первая - последней. 
3. Если введено revert, удаляет предыдущую введенную строку из памяти.
 */
public class tsk2 {
    public static void main(String[] args) {
        task2();
    }

    static void task2() {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        boolean work = true;
        while (work) {
            System.out.println("Please, type(text~num)");
            String line = scanner.nextLine();
            switch (line) {
                case "print":
                    ListIterator listIterator = list.listIterator(list.size());
                    while (listIterator.hasPrevious()) {
                        System.out.println(listIterator.previous());
                    }
                    break;
                case "exit":
                    work = false;
                    break;
                case "revert":
                    list.removeLast();
                    break;
                default:
                    list.add(line);
            }
        }
    }
}
