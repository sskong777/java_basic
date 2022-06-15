package inheritance;

class Suv{
	
	private String color;
	
	int speed = 100;
	 
	public void run() {
		System.out.println("SUV차량이 달립니다");
	}
	//부모클래스의 private 접근제한을 갖는 필드 및 메소드는 자식이 물려받을 수 없다/
	
	//부모와 자식클래스가 서로 다른 패키지에 있다면 부모의 default 접근제한을 갖는 
	//필드 및 메소드도 자식이 물려받을 수 없다
	
	//그 이외의 경우는 모두 상속의 대상이 된다.
}

class Santafe extends Suv{
	int speed = 120;
	
	@Override
	public void run() {	//Override (재정의 매소드)
		System.out.println("Santafe 차량이 달립니다");
	}
	
	public void disp() {
		
		super.run();	//부모메서드 호출
		System.out.println("SUV속도 : " + super.speed); //부모필드
		
		this.run();		//자식메소드 호출
		System.out.println("Santafe속도  : " + this.speed);
	}
	
	// 부모클래스에서 상속받은 멤버필드의 이름과 자식클래스에서 만든 멤버필드의 이름이
	// 같은 경우 부보멤버를 사용하기 위해서는 super라는 키워드를 사용해야한다.
	
	// 자식클래스는 this가 생략되어있어서 그냥 사용하면 자식클래스 멤버가 사용된다
}

public class EX03 {

	public static void main(String[] args) {
		
		Santafe santafe = new Santafe();
		santafe.run();
		
		santafe.disp();
	}

}
