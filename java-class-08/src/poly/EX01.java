package poly;

// 다형성 : 부모클래스타입으로 자식객체를 얻는 것.
// 1.부모클래스가 가지고 잇는 모든 멤버에 접근할 수 있다.
// 단, 자식클래스에서 메소드 오버라이딩을 했다면 오버라이딩이 된 자식의 메소드가 호출된다.

// 2. 멤버필드의 경우 부모클래스의 멤버필드에만 접근할 수 있다.
// 자식클래스의 멤버필드는 오버라이딩이 된 자식클래스의 메소드에 의해서만 접근할 수 있다.

class Parent { 
	
	int money = 1000;
	
	public void disp() {
		 System.out.println("money : " + this.money);
	 }
}

class Child extends Parent { 
	
	int money = 500;
	
	@Override
	public void disp() {
		System.out.println("money : " + this.money);
	}
}

public class EX01 {

	public static void main(String[] args) {

		Parent poly = new Child();		//자동타입변환(업캐스팅)
		// 다형성은 부모타입의 변수를 자식객체로 생성하는 것.
	    // 부모위주이다.( 부모필드와 부모메소드에만 접근가능 ) 
		
		System.out.println("poly.money : " + poly.money);
		//부모클래스의 money가 출력
		
		poly.disp();
		//자식필드를 사용하고 싶으면 오버라이딩 메소드를 이용하면 된다.
		System.out.println();
		
		Child poly2 = (Child)poly;	//강제 타입변환 (다운캐스팅)
		System.out.println("poly2.money : " + poly2.money);
		System.out.println();
		
		Parent poly3 = poly2;	//자동타입변환 ( 업캐스팅 ) 
		System.out.println("poly3.money : " + poly3.money);
	}

}
