package clazz.field;

class Car2{
	String color;
	int speed;
	
	public void setSpeed(int speed) { //set : 저장하다
		this.speed = speed;
		// (필드를 메소드로 초기화)
		// 매개변수와 필드의 이름이 동일하기 때문에 
		// (this.필드)는 this라는 참조변수로 필드를 사용
	}
	public int getSpeed() {	//get : 얻다, 가져오다.
		return speed;	//int speed 필드를 리턴한다.
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
}

public class EX04 {

	public static void main(String[] args) {
		
		Car2 myCar = new Car2();
		//필드로 바로 접근
		myCar.color = "빨강";
		myCar.speed =30;
		System.out.println("내 자동차 색상은  : "  + myCar.color);
		System.out.println("내 자동차 색상은  : "  + myCar.speed);
		
		//아래 방법을 더 선호(객체의 무결성때문)
		//필드를 메소드로 접근
		myCar.setColor("파랑");
		myCar.setSpeed(50);
		System.out.println("내 자동차 색상은  : "  + myCar.getColor());
		System.out.println("내 자동차 색상은  : "  + myCar.getSpeed());
	
	}

}
