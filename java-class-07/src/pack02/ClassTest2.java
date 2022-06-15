package pack02;

import pack01.A;

public class ClassTest2 {

	public static void main(String[] args) {

		A a = new A();
		//public class여서 다른 패키지에서도 사용이 가능하다.
		//다른 패키지에 있는 클래스이므로 import해줘야한다.
		System.out.println("클래스 A의 x : " + a.x);
		System.out.println();
	
//		B b = new B();
		//default class는 다른 클래스여서 불가
//		//import 자체가 안된다.
//		System.out.println("클래스 B의 x : " + b.x);
//		System.out.println();
	}

}
