package Seminar.sem2;
/*
Напишите метод, который принимает на вход строку (String) и
определяет является ли строка палиндромом (возвращает
boolean значение).
 */
public class tsk3 {
    public static void main(String[] args) {
        System.out.println(palindrom("KIYIK"));
    }
    static boolean palindrom(String str) {
        str = str.toLowerCase();
        str = str.trim();
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString().equals(str);
    }
}
