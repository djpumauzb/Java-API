package Seminar.sem1;

/*
Задание №2
Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
максимальное количество подряд идущих 1.
 */
public class tsk1 {
    public static void main(String[] args) {
        task0();
    }

    static void task0(){
        int[] arr = {1,1,0,1,1,1};
        int count = 0;
        int max1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) count++;
            else {
                if (max1 < count) max1 = count;
                count = 0;
            }
        }
        if (max1 < count) max1 = count; // obnovlaem uslovie tak tak java govno xz) nado tak. Ato poslednix ne schitaet.
        System.out.println(max1);
    }
}
