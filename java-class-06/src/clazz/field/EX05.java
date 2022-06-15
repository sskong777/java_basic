package clazz.field;


class Car3{

	String color;
	int speed;
	//우클릭 -> Source -> Getters and Setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}

public class EX05 {

	public static void main(String[] args) {

		Car3 car = new Car3();
		car.color = "빨강";
		car.speed = -30;
		// 필드로 바로 접근 시 문제가 될 수 있다.
		// private로 선언 시 외부 클래스에서 접근이 안됨.
		System.out.println(car.color);
		System.out.println(car.speed);
		
		//메소드를 통해서 접근을 한다.
		car.setColor("파랑");
		car.setSpeed(60);
		System.out.println(car.getColor());
		System.out.println(car.getSpeed());
		
		
	
	}

}
