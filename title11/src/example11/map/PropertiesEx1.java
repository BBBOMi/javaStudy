package example11.map;

import java.util.*;

public class PropertiesEx1 { // p.658-659

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		
		// prop에 키와 값(key, value)을 저장한다
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		// prop에 저장된 요소들을 Enumeration을 이용해서 출력
		Enumeration e = prop.propertyNames();
		
		while(e.hasMoreElements()) {
			String element = (String)e.nextElement();
			System.out.println(element + " = " + prop.getProperty(element));
		}
		
		System.out.println();
		prop.setProperty("size", "20");
		System.out.println("size = " + prop.getProperty("size"));
		System.out.println("capacity = " + prop.getProperty("capacity", "20"));
		System.out.println("loadfactor = " + prop.getProperty("loadfactor", "0.75"));
		// prop에 저장된 값 중 읽어오려는 키가 존재하지 않으면 기본값(defaultValue)을 반환, 기본값 없을 시 null반환

		System.out.println(prop); // prop에 저장된 요소들을 출력
		System.out.println();
		prop.list(System.out); // prop에 저장된 요소들을 화면(System.out)에 출력
	}

}
