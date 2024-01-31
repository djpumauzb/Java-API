package Seminar.sem2;

import java.io.FileWriter;
import java.io.IOException;

/*
Напишите метод, который составит строку, состоящую из 100
повторений слова TEST и метод, который запишет эту строку в
простой текстовый файл, обработайте исключения.
 */
public class tsk4 {
    public static void main(String[] args) {
        task4(repeatStr(100, "TEST"));
    }

    static String repeatStr (int n, String str) {
        return str.repeat(n);
    }

    static void task4(String str) {
        try {
            FileWriter fileWriter = new FileWriter("text.txt", true); // true bo'lsa ustidan qo'shib yozadi.
            fileWriter.write(str);
            fileWriter.flush();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
