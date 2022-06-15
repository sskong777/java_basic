package pack01;

public class ClassTest1 {

	public static void main(String[] args) {

		A a = new A();
		System.out.println("클래스 A의 x : " + a.x);
		System.out.println();
	
		B b = new B();
		System.out.println("클래스 B의 x : " + b.x);
		System.out.println();
		
		//같은 패키지 내에서는 public, default 둘 다 가능
	}
	

}
