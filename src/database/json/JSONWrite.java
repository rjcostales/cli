package database.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JSONWrite {

    public static void main(String[] args) {

        JSONObject obj = new JSONObject();
        obj.put("age", new Integer(100));
        obj.put("name", "mkyong.com");

        JSONArray list = new JSONArray();
        list.add("msg 1");
        list.add("msg 2");
        list.add("msg 3");

        obj.put("messages", list);

        try {

            FileWriter file = new FileWriter("data/test.json");
            file.write(obj.toJSONString());
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print(obj.toJSONString());
    }
}