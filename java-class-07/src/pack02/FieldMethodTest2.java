package pack02;

import pack01.FieldMethodEx;

public class FieldMethodTest2 {

	public static void main(String[] args) {
		FieldMethodEx ex = new FieldMethodEx();
		
		System.out.println(ex.str1);
		//다른 패키지이므로 public만 가능함
//		System.out.println(ex.str2);
//		System.out.println(ex.str3);
//		System.out.println(ex.str4);
		System.out.println();
		
		ex.method1();
		//다른 패키지
//		ex.method2();
//		ex.method3();
//		ex.method4();
	}
	

}
