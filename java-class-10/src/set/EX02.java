package set;

import java.util.*;

public class EX02 {

	public static void main(String[] args) {
		
		//String 타입의 HashSet 클래스를 생성한 후
		//과일의 이름을 5개 넣는다
		//반복자를 이용해서 하나씩 출력해보자
		
		Set<String> set = new HashSet<>();
		
		set.add(new String("사과"));
		set.add("바나나");
		set.add("딸기");
		set.add("복숭아");
		set.add("토마토");
		
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("총 객체 수 : " + set.size() );
		
		Iterator<String> setIter = set.iterator();
		
		while(setIter.hasNext()) {
			System.out.println(setIter.next());
		}
		System.out.println("총 객체 수 : " + set.size() );
		

		

	}

}
