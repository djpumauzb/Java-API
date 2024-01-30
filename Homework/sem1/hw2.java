package Homework.sem1;

/*
 Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.
Напишите свой код в методе printPrimeNums класса Answer.
2
3
5
7
11
...
 */
public class hw2 {
    public static void main(String[] args) {
        printPrimeNums();
    }

    static void printPrimeNums() {
        for (int i = 2; i <= 1000; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    continue;
                }
            }
            if (flag) System.out.println(i);
        }
    }
}
