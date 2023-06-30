package Seminars.Seminar_01;

import org.json.simple.JSONObject;
import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.lang3.builder.ToStringBuilder;
//import java.io.*;

/**
 * https://docs.oracle.com/javaee/7/api/javax/json/JsonObject.html - кументация,
 * методы...
 *
 * JSONObject — хранит неупорядоченные пары ТИПА КЛЮЧ — ЗНАЧЕНИЯ.
 *
 * Значение могут быть типа String, JSONArray, JSONObject, NULL, Boolean и
 * Number.
 *
 * Класс JSONObject также содержит конструкторы для конвертации Java-строки в
 * JSON и дальнейшего ее разбора в последовательность ключ-значений.
 *
 * Я так понял - это типо словаря, как в питоне.
 *
 * JSON — это аббревиатура от “JavaScript Object Notation” (Обозначение Объектов
 * JavaScript”.
 *
 * С помощью JSON можно отправлять данные с сервера на веб-страницу.
 * Из этого следует, что он используется в веб-разработке.
 *
 * V put(K k, V v) : помещает в коллекцию новый объект с ключом k и значением v.
 * Если в коллекции уже есть объект с подобным ключом, то он перезаписывается.
 * После добавления возвращает предыдущее значение для ключа k, если он уже был
 * в коллекции. Если же ключа еще не было в коллекции, то возвращается значение
 * null.
 */
public class Ex_001 {

    public static void main(String[] args) {
        JSONObject resultJson = new JSONObject();

        resultJson.put("name", "foo");
        resultJson.put("num", 100);
        resultJson.put("is_vip", true);
        resultJson.put("nickname", null);
        System.out.print(resultJson.toString());
        String name = (String) resultJson.get("name");
        System.out.print(name);

    }
}
// Вывод:
// {"is_vip":true,"num":100,"name":"foo","nickname":null}
// https://replit.com/java -
// https://code.google.com/archive/p/json-simple/

// import org.json.simple.JSONObject;
// class Ex_001 {
// public static void main(String[] args) {
// JSONObject resultJson = new JSONObject();

// resultJson.put("name", "foo");
// resultJson.put("num", 100);
// resultJson.put("is_vip", true);
// resultJson.put("nickname", null);
// String name = (String) resultJson.get("name");
// System.out.print(name);
// }
// }