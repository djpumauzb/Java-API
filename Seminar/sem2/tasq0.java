package Seminar.sem2;

public class tasq0 {
    public static void main(String[] args) {
        task0(30, 'a', 'h');
    }
    static void task0(int n, char c1, char c2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n/2; i++) {
            stringBuilder.append(c1).append(c2);
        }
        System.out.println(stringBuilder);
    }
}
