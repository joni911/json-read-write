/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package download;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
 
public class WriteJsonSimpleDemo {
    public static void main(String[] args) {
 
    JSONObject obj = new JSONObject();
    obj.put("nama", "Nursalim");
    obj.put("gender", "Laki-Laki");
    obj.put("umur", new Integer(20));
 
    JSONArray listHobbies = new JSONArray();
    listHobbies.add("Makan");
    listHobbies.add("Tidur");
    listHobbies.add("Jalan-Jalan");
 
    obj.put("hobi", listHobbies);
 
    try {
 
        FileWriter file = new FileWriter("D:\\dishph2h\\api\\txt\\output\\error\\simplejson.json");
        file.write(obj.toJSONString());
        file.flush();
        file.close();
 
    } catch (IOException e) {
        e.printStackTrace();
    }
 
    System.out.print(obj);
 
     }
 
}