package Homework.sem1;

/*
Реализуйте простой калькулятор

В методе calculate класса Calculator реализовать калькулятор, который будет выполнять математические операции (+, -, *, /) над двумя целыми числами и возвращать результат вещественного типа.

В классе Printer необходимо реализовать проверку переданного оператора, при некорректном операторе программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".

Аргументы, передаваемые в метод/функцию:

'3'
'+'
'7'

На выходе:
10.0

 */
public class hw3 {
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        double result = hw3.calculate(op, a, b);
        System.out.println(result);
    }

    public static double calculate(char op, int a, int b) {
        double result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if ( b!= 0 || a != 0) result = a / b;
                else result = -1;
                break;
            default:
                System.out.println("Некорректный оператор: '" + op + "'");
                result = -1;
                break;
        }
        return result;
    }
}
