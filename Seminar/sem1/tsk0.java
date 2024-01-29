package Seminar.sem1;

import java.time.LocalTime;
import java.util.Scanner;

public class tsk0 {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name);
            LocalTime localTime = LocalTime.now();
            int hour = localTime.getHour();
            if (hour >= 5 && hour < 12) System.out.println("Good morning " + name);
            else if (hour < 18) System.out.println("Good afternoon " + name);
            else if (hour < 22) System.out.println("Good evening " + name);
            else System.out.println("Good night " + name);
    }
}