package pack01;

public class FieldMethodTest1 {

	public static void main(String[] args) {
		FieldMethodEx ex = new FieldMethodEx();
		
		System.out.println(ex.str1);
		System.out.println(ex.str2);
		System.out.println(ex.str3);
		//private만 접근 안됨 ( 다른 클래스 ) 
//		System.out.println(ex.str4);
		System.out.println();
		
		ex.method1();
		ex.method2();
		ex.method3();
		//private만 접근 안됨 ( 다른 클래스 ) 
//		ex.method4();
	}

}
