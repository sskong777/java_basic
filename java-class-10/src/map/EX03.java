package map;

import java.util.*;

public class EX03 {

	public static void main(String[] args) {

		// HashMap을 이용해서 아이디하고 비밀번호를 입력
		// 아이디 String 비밀번호 String
		// keySet 메소드로  Set에 넣어준 뒤 Iterator를 이용해서 
		// 아이디와 비밀번호를 출력
		
		HashMap<String,String> map = new HashMap<>();
		
		map.put("mchong1996", "tjrgus!");
		map.put("tjrgus1996", "tjrgu!");
		map.put("tjrgus8", "tjrgus02!");
		map.put("tjrguswkd02", "tjrguS02!");
	
		System.out.println(map);
		
		Set<String> keySet = map.keySet();
		
		Iterator<String> keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			String value = map.get(key);
			
			System.out.println("ID : " + key + " || Password : " + value);
			
		}
	
	}

}
