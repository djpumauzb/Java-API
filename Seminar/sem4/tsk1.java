package Seminar.sem4;

import java.util.LinkedList;
import java.util.Scanner;

/*
Реализовать консольное приложение, которое:
1. Принимает от пользователя строку вида text~num
2. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */
public class tsk1 {
    public static void main(String[] args) {
        task1();
    }
    static void task1() {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        boolean work = true;
        while (work) {
            System.out.println("Please, type(text~num)");
            String line = scanner.nextLine();
            String[] arr = line.split("~");
            String text = arr[0];
            int num = Integer.parseInt(arr[1]);
            switch (text) {
                case "print":
                    System.out.println(list.remove(num));
                    break;
                case "exit":
                    work = false;
                    break;
                default:
                    list.add(num, text);
            }
        }
    }
}
