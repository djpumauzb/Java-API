package Homework.sem1;
/*
Вычислить n-ое треугольного число(сумма чисел от 1 до n).

Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.
Если число n < 1 (ненатуральное) метод должен вернуть -1.
 */
public class hw1 {
    public static void main(String[] args) {
        System.out.println(countNTriangle(4));
    }
    static int countNTriangle(int n) {
        // Введите свое решение ниже
        int count = 0;
        for (int i = 0; i <= n; i++) {
            count = count + i;
        }
        return count;
      }
}
