package Leksiya.less6;

import java.util.Arrays;
import java.util.HashSet;

public class exp001 {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.firstName = "Name_1";
        w1.lastName = "Surname_1";
        w1.id = 100;
        w1.salary = 1000;

        Worker w4 = new Worker();
        w4.firstName = "Name_1";
        w4.lastName = "Surname_1";
        w4.id = 100;
        w4.salary = 1000;

        Worker w2 = new Worker();
        w2.firstName = "Name_2";
        w2.lastName = "Surname_2";
        w2.id = 200;
        w2.salary = 2000;

        Worker w3 = new Worker();
        w3.firstName = "Name_3";
        w3.lastName = "Surname_3";
        w3.id = 300;
        w3.salary = 3000;


        System.out.println(w1.toString()); // hash 4dan farq qlad
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4); // hash 1 dan farq qlad

        System.out.println(w1 == w4);
        System.out.println(w1.equals(w4));
        var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3));
        System.out.println(workers.contains(w4));

    }
}
