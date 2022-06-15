package list;

import java.util.*;

public class EX05 {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long start;
		long end;
		
		start = System.nanoTime();
		//컴퓨터의 시계로부터 현재 시간을 읽어서
		//나노세컨드 단위의 long값을 리턴
		for(int i = 0; i < 10000; i++) {
			list1.add(0,String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("ArrayList 걸린시간 : " + (end-start));
	
	
		start = System.nanoTime();
		//컴퓨터의 시계로부터 현재 시간을 읽어서
		//나노세컨드 단위의 long값을 리턴
		for(int i = 0; i < 10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("LinkedList 걸린시간 : " + (end-start));

		//<결과>//
//		ArrayList 걸린시간 : 8786900
//		LinkedList 걸린시간 : 1957300
	
	}
}
