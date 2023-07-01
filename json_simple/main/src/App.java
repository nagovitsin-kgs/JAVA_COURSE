package json_simple.main.src;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("kkk");
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
