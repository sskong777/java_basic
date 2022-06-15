package pack01;

//default클래스는 다른 패키지에서는 접근 할 수 없음
class B{
public int x = 100;
	
	public B() {
		System.out.println("클래스 B의 생성자 입니다");
	}
	
}

//public 클래스는 다른 패키지에서도 접근가능
public class A {

	public int x = 10;
	
	public A() {
		System.out.println("클래스 A의 생성자 입니다");
	}
	
	
	
}
