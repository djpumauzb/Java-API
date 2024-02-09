package Seminar.sem4;
/*
Реализовать стэк с помощью массива.
Нужно реализовать методы:
size(), empty(), push(), peek(), pop(). 
 */
public class tsk4 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        System.out.println(myStack.size());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        System.out.println(myStack.empty());
    }
}
