package map;

import java.util.*;

public class EX01 {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(new Integer(1), new String("홍길동"));
		map.put(2, "성춘향");
		map.put(3, "이순신");
		map.put(4, "이몽룡");
		map.put(1, "홍길순");	//key가 1인 value 의 값을 변경
	
		System.out.println(map.size());
		
		System.out.println(map);	// 전체출력
		System.out.println(map.get(1));	//key값을 가지고 value출력
		System.out.println();
	
		//객체를 하나씩 처리
		Set<Integer> keySet = map.keySet();	//Set타입으로 Key객체를 반환
		
		Iterator<Integer> keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			int key = keyIter.next();
			String value = map.get(key);
			
			System.out.println("key : " + key + " , value : " + value);
		}
		
		map.remove(1);	//key값으로 객체(엔트리 : key,value) 삭제
		map.remove(2);
	
		System.out.println(map);
		
		map.clear();
		
		if(map.isEmpty()) {
			System.out.println("요소가 비어있습니다");
		}
		
		
	}
}
