package Seminar.sem1;

/*
Задание №6 (доп)
Реализовать функцию возведения числа а в степень b. a, b из Z.
Сводя количество выполняемых действий к минимуму.
Пример 1: а = 3, b = 2, ответ: 9
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1
 */
public class tsk5 {
    public static void main(String[] args) {
        System.out.println(num(3, 3));
    }

    static double num(int a, int b) {
        double result = 1;
        if (b == 0) {
            return 1;
        }
        else {
            for (int i = 0; i < Math.abs(b); i++) {
                result = result * a;
            }
            if(b > 0) return result;
            else return 1/result;
        }
    }
}
