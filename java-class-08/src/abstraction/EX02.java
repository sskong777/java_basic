package abstraction;

abstract class Car{
	
	String color;
	int speed;
	
	public Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
		
	}
	public abstract void work();
	
	public abstract void disp();
}

//Car클래스를 상속받는 Sedan클래스를 만든다
//추상메소드를 오버라이딩하여 재정의 해보자

class Sedan extends Car{
	
	// 부모클래스의 기본생성자가 없으므로 자식클래스에서는 부모클래스의 매개변수가 있는 생성자를 호출해야한다.
	public Sedan(String color, int speed) {
		super(color, speed);
	}
	@Override
	public void disp() {
		System.out.println("세단은" + color + "색 이고," + speed + "의 속도를 냅니다");
	}
	@Override
	public void work() {
		System.out.println("승용차가 사람을 태우고 있습니다");
	}
}

class Truck extends Car{
	
	// 부모클래스의 기본생성자가 없으므로 자식클래스에서는 부모클래스의 매개변수가 있는 생성자를 호출해야한다.
	public Truck(String color, int speed) {
		super(color, speed);

	}
	@Override
	public void disp() {
		System.out.println("트럭은" + color + "색 이고," + speed + "의 속도를 냅니다");
	}
	@Override
	public void work() {
		System.out.println("트럭이 짐이 싣고있습니다 있습니다");
	}
}

public class EX02 {
	public static void main(String[] args) {
		
		Sedan sedan = new Sedan("검정",300);
		sedan.disp();
		sedan.work();
		
		Truck truck = new Truck("파랑",100);
		truck.work();
		truck.disp();
}
	}






