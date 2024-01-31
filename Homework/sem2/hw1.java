package Homework.sem2;
/*
Сформируйте SQL-запрос
Дана строка sql-запроса: select * from students where "
Сформируйте часть WHERE этого запроса, используя StringBuilder. 
Данные (параметры) для фильтрации приведены в виде json-строки в примере ниже. 
Если значение null, то параметр не должен попадать в запрос.

Напишите свой код в методе answer класса Answer. 
Метод answer принимает на вход два параметра:

String QUERY - начало SQL-запроса String PARAMS - JSON с параметрами

Пример: Строка sql-запроса:
    select * from students where
Параметры для фильтрации:
    {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Результат:
    select * from students where name='Ivanov' and country='Russia' and city='Moscow'
 */
public class hw1 {
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";
        
        if (args.length == 0) {
          // При отправке кода на Выполнение, вы можете варьировать эти параметры
          QUERY = "select * from students where ";
          PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        }
        else{
          QUERY = args[0];
          PARAMS = args[1];
        }        
        System.out.println(answer(QUERY, PARAMS));
    }

    
    static StringBuilder answer(String QUERY, String PARAMS){
        // Clear data
        PARAMS = PARAMS.trim().replaceAll("[{}\"]", "");
        StringBuilder stringBuilder = new StringBuilder(QUERY);

        // Split by ','
        String[] splittedStrings = PARAMS.split(",");
        // Iteration and add WHERE
        for (String string : splittedStrings) {
            String[] entry = string.split(":");
            String keyString = entry[0].trim();
            String valueString = entry[1].trim();

            if (!valueString.equalsIgnoreCase("null")) {
                if (stringBuilder.toString().contains("=")) {
                    stringBuilder.append(" and ");
                }
                stringBuilder.append(keyString).append("='").append(valueString).append("'");
            }
        }
        return stringBuilder;
    }
}

// GPT :(