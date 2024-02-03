package Seminar.sem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Leksiya.less1.lib;

/*
Каталог товаров книжного магазина сохранен в виде двумерного
списка List<ArrayList<String>> так, что на 0й позиции каждого
внутреннего списка содержится название жанра, а на остальных
позициях - названия книг. Напишите метод для заполнения данной
структуры.
 */
public class tsk4 {
    public static void main(String[] args) {
        List<ArrayList<String>> list = new ArrayList<>();
        list_list(list);
        list_list(list);
        list_list(list);
        list_list(list);
        System.out.println(list);
    }

    static void list_list(List<ArrayList<String>> myList) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Vvedite janr: ");
        String ganre = iScanner.nextLine();
        System.out.println("Vvedite nazvanie knigi: ");
        String name = iScanner.nextLine();

        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).get(0).equals(ganre)) {
                myList.get(i).add(name);
                return;
            }
        }
        ArrayList<String> list2 = new ArrayList<>();
        list2.add(ganre);
        list2.add(name);
        myList.add(list2);
    }
}
