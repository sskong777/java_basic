package map;

import java.util.*;

public class EX02 {

	public static void main(String[] args) {

		// HashMap을 이용해서 과목하고 성적을 입력
		// 과목 :  국어 영어 수학 자바
		// 과목은 String 성적 Integer
		// key값을 이용해서 value출력
		
		HashMap<String,Integer> map = new HashMap<>();
		map.put("국어", 75);
		map.put("수학", 100);
		map.put("영어", 86);
		map.put("자바", 90);
		map.put("자바", 96);
		
		System.out.println(map);

		Set<String> keySet = map.keySet();
		Iterator<String> keyIter= keySet.iterator();
		
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			int value = map.get(key);
			
			System.out.println("key : " + key + " , value : " + value);
		}
	}

}
