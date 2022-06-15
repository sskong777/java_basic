package set;

import java.util.*;

class SimpleNumber{
	
	int num;
	
	public SimpleNumber(int num) {
		this.num = num;
	}
	
	// equals(), hashCode() 오버라이딩해서 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof SimpleNumber) {
			SimpleNumber number = (SimpleNumber)obj;
			return this.num == number.num;
			
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return num;
	}
	
}


public class EX03 {

	public static void main(String[] args) {

		HashSet<SimpleNumber> set = new HashSet<>();
		
		set.add(new SimpleNumber(30));
		
		set.add(new SimpleNumber(30));
	
		set.add(new SimpleNumber(20));	
	
		System.out.println("저장된 데이터 수 : " + set.size());	//결과 : 3개
		
		Iterator<SimpleNumber> setIter = set.iterator();
		
		while(setIter.hasNext()){
			SimpleNumber number = setIter.next();
			System.out.println(number.num);
		}
		
		
	}
}
