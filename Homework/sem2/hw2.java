package Homework.sem2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
/*
Реализуйте алгоритм сортировки пузырьком числового массива, 
результат после каждой итерации запишите в лог-файл.

Напишите свой код в методе sort класса BubbleSort. 
Метод sort принимает на вход один параметр:

int[] arr - числовой массив

После каждого прохода по массиву ваш код должен делать запись в лог-файл 'log.txt' в формате год-месяц-день час:минуты {массив на данной итерации}. 
Для логирования использовать логгер logger класса BubbleSort.

Пример
arr = new int[]{9, 4, 8, 3, 1};
sort(arr)

// При чтении лог-файла получим:
2023-05-19 07:53 [4, 8, 3, 1, 9]
2023-05-19 07:53 [4, 3, 1, 8, 9]
2023-05-19 07:53 [3, 1, 4, 8, 9]
2023-05-19 07:53 [1, 3, 4, 8, 9]
2023-05-19 07:53 [1, 3, 4, 8, 9]
 */
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

public class hw2 {
  public static void main(String[] args) throws IOException {
    int[] arr = {};

    if (args.length == 0) {
      // При отправке кода на Выполнение, вы можете варьировать эти параметры
      arr = new int[] { 9, 4, 8, 3, 1 };
    } else {
      arr = Arrays.stream(args[0].split(", "))
          .mapToInt(Integer::parseInt)
          .toArray();
    }

    BubbleSort.sort(arr);

    try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

class BubbleSort {
  private static File log = new File("log.txt");
  private static FileWriter fileWriter;

  static {
    try {
      if (!log.exists()) {
        log.createNewFile();
      }
      fileWriter = new FileWriter(log, false); // Открываем файл на запись с очисткой содержимого
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void logArray(int[] arr) throws IOException {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    Date date = new Date();
    fileWriter.write(formatter.format(date) + " " + Arrays.toString(arr) + "\n");
    fileWriter.flush();
  }

  public static void sort(int[] arr) throws IOException {
    boolean swapped = false;
    for (int i = 0; i < arr.length - 1; i++) {
      swapped = false;
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swapped = true;
        }
      }
      logArray(arr); // Логирование после каждого внутреннего прохода
      if (!swapped) {
        break; // Массив отсортирован, дальнейший проход не нужен
      }
    }
    if (swapped) {
      logArray(arr); // Дополнительное логирование для последнего состояния массива, если были обмены
    }
  }
}






// GPT 4 :(((((((((  aj muchalsya 1.5 hours ept. 