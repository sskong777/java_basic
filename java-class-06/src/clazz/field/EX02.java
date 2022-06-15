package clazz.field;

class Car{
	
	//Field 작성
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed;	//default : 0 (자동으로 초기화 / 기본값이 0이된다)
}

public class EX02 {

	public static void main(String[] args) {

		//Car 객체를 생성하고 필드를 출력해보자
		Car car = new Car();
		
		System.out.println(car.company);
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.maxSpeed);
		System.out.println(car.speed);
	
	}

}
