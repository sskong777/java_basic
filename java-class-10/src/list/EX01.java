package list;

import java.util.*;

public class EX01 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
//		List<String> list = new ArrayList<>();	-->이렇게도 가능 (다형성, 오른쪽의 String은 생략가능)
															 //:LinkedList로 구현 가능
		//List : 데이터를 일렬로 늘어놓은 자료구조
		//데이터 중복허용, 순서중요
		
		list.add(new String("Hong"));
		//원칙 : new 연산자를 이용해서 넣는다
		list.add("Sung");
		list.add("Lee");
				
		int size = list.size();	//저장되어있는 전체 객체의 수를 리턴
		System.out.println("총 객체 수  : " + size);
		System.out.println();
		
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println();
		
		//
		list.add(0,"Jung"); 	//index 0 번에 끼워넣는다
		
		list.add(2,"Jang");		//index 2 번에 끼워넣는다
		
		list.set(0, "Wang");	//index 0번의 객체를 대체한다
		
		String str2 = list.get(2);
		System.out.println("2 : " + str2);
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			String str3 = list.get(i);
			System.out.println(i + " : " +str3);
		}
		System.out.println();
		
		list.remove(1);		//index 1번의 객체를 삭제한다
		list.remove("Jang");	//"Jang" 객체를 삭제한다
		
		for(int i = 0; i < list.size(); i++) {
			String str3 = list.get(i);
			System.out.println(i + " : " +str3);
		}
		System.out.println();
		
		list.clear();//저장된 모든 객체를 삭제한다
		
		boolean bool = list.isEmpty();	//비어있으면 true, 요소가 있으면 false를 반환
		
		System.out.println(bool);
	}
}
