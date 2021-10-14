package com.Managers;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.common.io.PatternFilenameFilter;

public class TestCode {

	public static void main(String[] args) throws IOException, ParseException {

//		Map<String, Object> stuDeatils = new HashMap<>();
//
//		stuDeatils.put("id", 123);
//		stuDeatils.put("name", "Anbu");
//		stuDeatils.put("age", 28);
//
//		JSONArray subjects = new JSONArray();
//		subjects.add("java");
//		subjects.add("Selenium");
//		stuDeatils.put("subjects", subjects);
//		
//		JSONObject jso = new JSONObject(stuDeatils);
//		FileWriter file= new FileWriter(System.getProperty("user.dir")+"//outputFiles//jsonFile.json");
//		file.write(jso.toJSONString());
//		file.flush();
//		file.close();
//		JSONParser jParse = new JSONParser();
//		JSONObject jobj = new JSONObject();
//		Object obj = jParse.parse(new FileReader(System.getProperty("user.dir") + "//outputFiles//jsonFile.json"));
//		jobj = (JSONObject) obj;
//		System.out.println(jobj.get("id"));
//		JSONArray jArray = new JSONArray();
//		jArray = (JSONArray) jobj.get("subjects");
//		System.out.println(jArray.get(0));
//		int n = 10;
//		int temp =0;
//		int n1=0,n2=1;
//		for(int i=1;i<=n;i++) {
//			System.out.println(temp);
//			temp = n1+n2;
//			n1=n2;
//			n2=temp;
//
//		}
		
		String name = "#";
		Pattern p = Pattern.compile("[^a-zA-Z]");
		Matcher m = p.matcher(name);
		System.out.println(m.find());
	}

}
