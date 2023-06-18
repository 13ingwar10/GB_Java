package org.example.GB_Java;

import java.util.Scanner;

/** 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
 * Данные для фильтрации приведены ниже в виде json-строки.
 Если значение null, то параметр не должен попадать в запрос.
 Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */

public class FirstTask {
        static String makeWhere() {

            String request = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
            String where = "";

            StringBuilder sb = new StringBuilder();

            request = request.replaceAll("[^a-zA-Z]+", " ");        //удаление лишних символов из исходной строки

            String[] requestArray = request.split(" ");                         //преобразование строки в массив

            for (int i = 1; i < requestArray.length; i = i+2) {                     //т.к. параметр и значение чередуются, i+2

                if (!requestArray[i+1].equals("null")) {

                    if (i == 1) {
                        sb.append(requestArray[i] + " = " + "'"+ requestArray[i+1]+ "'");
                    } else {
                        sb.append(" AND " + requestArray[i] + " = " + "'"+ requestArray[i+1]+ "'");
                    }
                }
            }
            where = "WHERE " + sb.toString();
            return where;
        }
}
