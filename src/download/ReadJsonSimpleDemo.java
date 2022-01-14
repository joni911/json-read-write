/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package download;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonSimpleDemo {
    public static void main(String[] args){
	JSONParser parser = new JSONParser();
		 
	try {
	 
	  Object obj = parser.parse(new FileReader("D:\\dishph2h\\api\\txt\\output\\error\\542.txt"));
	 
	  JSONObject jsonObject = (JSONObject) obj;
	 
	  String nama = (String) jsonObject.get("nama");
	  System.out.println("Nama = "+nama);

	  String jenis = (String) jsonObject.get("jenis");
	  System.out.println("Jenis Kelamin = "+jenis);
          
          String ket = (String) jsonObject.get("keterangan");
	  System.out.println("Jenis Kelamin = "+ket);

	} catch (FileNotFoundException ex) {
	   ex.printStackTrace();
	} catch (IOException ex) {
	   ex.printStackTrace();
	} catch (ParseException ex) {
	   ex.printStackTrace();
	}
    }
}