package Seminar.sem1;

import java.util.Arrays;

/*
Задание №3
Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести
эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива
должны быть отличны от заданного, а остальные - равны ему.
 */
public class tsk3 {
    public static void main(String[] args) {
        task3();
    }
    static void task3() {
        int[] nums = {3,2,2,3};
        int val = 3;
        int current = 0;
        int[] tempArr = new int[nums.length];
        Arrays.fill(tempArr, val);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                tempArr[current++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(tempArr)); // o'zini print qsa bo'midi cignaskiy id@1231 bervoradi
    }
}
