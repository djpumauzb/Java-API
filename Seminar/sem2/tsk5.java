package Seminar.sem2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*
Напишите метод, который вернет содержимое текущей папки в виде
массива строк.
Напишите метод, который запишет массив, возвращенный предыдущим
методом в файл.
Обработайте ошибки с помощью try-catch конструкции. В случае
возникновения исключения, оно должно записаться в лог-файл.
 */
public class tsk5 {
    public static void main(String[] args) {
        task5(repeatStr(5, "TEST"));
    }

    static void task5(String str) {
        Logger logger = Logger.getAnonymousLogger();
        try {
        FileHandler fileHandler = new FileHandler("log.txt");
        logger.addHandler(fileHandler);
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        fileHandler.setFormatter(simpleFormatter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
        try (FileWriter fileWriter = new FileWriter("/sad/3e/text.txt", true)) { // true bo'lsa ustidan qo'shib yozadi.
            fileWriter.write(str);
            fileWriter.flush();
        } catch (IOException error) {
            error.printStackTrace();
            logger.log(Level.INFO, error.getMessage());
        }
        finally {}
    }

    static String repeatStr (int n, String str) {
        return str.repeat(n);
    }
}
