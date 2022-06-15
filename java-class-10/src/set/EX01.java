package set;

import java.util.*;

public class EX01 {

	public static void main(String[] args) {
		// Set : 데이터를 중복 저장하지 않는다
		// 데이터의 저장 순서를 유지하지 않는다
		Set<String> set = new HashSet<>();
		
		set.add(new String("홍길동"));
		//원칙 : new 연산자를 이용해서 객체를 넣는다
		set.add("이순신");
		set.add("홍길동");
		set.add("성춘향");
		set.add("이몽룡");
		
		System.out.println("set의 크기 : " + set.size());
		System.out.println();
		
		Iterator<String> setIter = set.iterator();
		
		while(setIter.hasNext()) {	//요소가 있는지 확인 후 있으면 true 없으면 false
			System.out.println(setIter.next());	
		}
		System.out.println();
		
		set.remove("홍길동");
		
		System.out.println("set의 크기 : " + set.size());

		setIter = set.iterator();
		//Iterator는 1회성이다
		//모든 요소를 next()로 읽고나면 더이상 읽을 요소가 없기 때문에
		//더 요소를 읽고싶으면 재생성을 해줘야한다.
		
		while(setIter.hasNext()) {
			String str = setIter.next();
			System.out.println(str);
		}
		System.out.println();
		set.clear();	//전체 삭제

		if(set.isEmpty()) {		//요소가 비어있으면  true반환
			System.out.println("비어있음");
		}
		
	}

}
