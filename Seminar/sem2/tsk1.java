package Seminar.sem2;
/*
Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd.
 */
import java.util.Arrays;

public class tsk1 {
    public static void main(String[] args) {
        System.out.println(task1("asbdbjnadajndjhasnbjdhsabdajshbdjahjflkrgjmtlekgmnklj"));
        System.out.println(task1("aaaaaabbbbbbccccssss"));
    }
    static String task1(String str) {  //aaabbbcccsssqqqwww...
        char[] c = str.toCharArray();
        Arrays.sort(c);
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < c.length; i++) {
            if (c[i] == c[i-1]) count++;
            else {
                stringBuilder.append(c[i-1]).append(count+1);
                count = 0;
            }
        }
        stringBuilder.append(c.length-1).append(count+1);
        return stringBuilder.toString();
    }
}
