package Seminar.sem2;

public class tsk0 {
    public static void main(String[] args) {
        //String str = "asd" + "qwerty";
        StringBuilder stringBuilder = new StringBuilder();
        long start = System.currentTimeMillis();
        // for (int i = 0; i < 100000; i++) {
        //     str += i;
        // }
        for (int index = 0; index < 100000; index++) {
            stringBuilder.append(index);
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish-start);
    }    
}