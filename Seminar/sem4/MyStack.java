package Seminar.sem4;

public class MyStack {
    private int size;
    private int[] arr = new int[10];

    int size() {
        return size;
    }

    boolean empty() {
        return size == 0;
    }

    void push(int item) {
        if (size == arr.length) {
            int[] tempArr = new int[arr.length * 2];
            System.arraycopy(arr, 0, tempArr, 0, arr.length);
            arr = tempArr;
        }
        arr[size++] = item;
    }

    int peek() {
        return arr[size-1];
    }

    int pop() {
        return arr[--size];
    }
}
