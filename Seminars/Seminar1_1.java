package Seminars;

import org.json.simple.JSONObject;

public class Seminar1_1 {

    public static void main(String[] args) {
        JSONObject resultJson = new JSONObject();

        resultJson.put("name", "foo");
        resultJson.put("num", 100);
        resultJson.put("is_vip", true);
        resultJson.put("nickname", null);
        System.out.print(resultJson.toString());
    }
}
// Вывод:
// {"is_vip":true,"num":100,"name":"foo","nickname":null}
// https://replit.com/java -
// https://code.google.com/archive/p/json-simple/

// import org.json.simple.JSONObject;
// class Main {
// public static void main(String[] args) {
// JSONObject resultJson = new JSONObject();

// resultJson.put("name","foo");
// resultJson.put("num",100);
// resultJson.put("is_vip",true);
// resultJson.put("nickname",null);
// String name = (String) resultJson.get("name");
// System.out.print(name);
// }
// }