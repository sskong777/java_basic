package clazz.constructor;


class Car2{
	

	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//기본생성자
	public Car2() {}
	
	// 생성자 오버로딩 1
	public Car2(String model) {
//		this.model = model;
		this(model, null, 0);
	}
	
	// 생성자 오버로딩 2
	public Car2(String model, String color) {
//		this.model = model;
//		this.color = color;
		this(model, color, 0);
		
	}
	// 생성자 오버로딩 3
	public Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;

	}
	
}



public class EX02 {

	public static void main(String[] args) {

		Car2 car = new Car2();
		System.out.println("제작회사 : "  + car.company);
		System.out.println();
		
		Car2 car2 = new Car2("아반떼");
		System.out.println("제작회사 : "  + car2.company);
		System.out.println("모델 : "  + car2.model);
		System.out.println();
		
		Car2 car3 = new Car2("아반떼","빨강");
		System.out.println("제작회사 : "  + car3.company);
		System.out.println("모델 : "  + car3.model);
		System.out.println("색상 : "  + car3.color);
		System.out.println();
	
		Car2 car4 = new Car2("아반떼", "빨강", 200);
		System.out.println("제작회사 : "  + car4.company);
		System.out.println("모델 : "  + car4.model);
		System.out.println("색상 : "  + car4.color);
		System.out.println("색상 : "  + car4.maxSpeed);
		System.out.println();
		
	}

}
