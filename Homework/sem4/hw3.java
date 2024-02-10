package Homework.sem4;

import java.util.ArrayDeque;
import java.util.Deque;

/*
В обычный калькулятор без логирования добавьте возможность
отменить последнюю операцию.

Отмена последней операции должна быть реализована следующим образом:
если передан оператор '<' калькулятор должен вывести результат 
предпоследней операции.


calculate('+', 3, 7)
calculate('+', 4, 7)
calculate('<', 0, 0)

// 10.0
// 11.0
// 10.0

calculate('*', 3, 2)
calculate('-', 7, 4)
calculate('<', 0, 0)

// 6.0
// 3.0
// 6.0
 */
public class hw3 {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
            c = 4;
            op2 = '+';
            d = 7;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
        double result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        double prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }

}

class Calculator {
    private static final Deque<Double> history = new ArrayDeque<>();

    public double calculate(char op, int a, int b) {
        double result = 0.0;
        if (op == '<') {
            if (!history.isEmpty()) { // Удаляем последний результат
                history.pop();
            }
            result = history.isEmpty() ? 0.0 : history.peek(); // Возвращаем новый последний результат
        } else {
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
                    if (b == 0) {
                        System.out.println("Cannot divide by zero.");
                        return 0.0;
                    } else {
                        result = a / (double) b;
                    }
                    break;
                default:
                    System.out.println("Unsupported operation: " + op);
                    return 0.0;
            }
            history.push(result); // Добавляем результат текущей операции в историю
        }
        return result;
    }
}