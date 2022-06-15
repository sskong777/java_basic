package clazz.constructor;

class Car1{
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int speed;
	
	//생성자 
	// 1. 기본 생성자를 명시하지 않으면 자바 컴파일러는 기본생성자를 자동으로 만들어준다.
	// 2. 그러나 생성자를 명시해주면 만들지 않는다.
	// 3. 반환타입이 없다. !!!!!! ( 메소드랑 차이점 )
	// 4. 생성자는 클래스 이름과 같은 이름을 써야한다.
	public Car1() {
		System.out.println("생성자가 호출되었습니다.");
		System.out.println("생성자는 객체 생성시 호출되어 객체초기화 역활!!.");
		model = "Sonata";
		color = "black";
		speed =60;
		disp();
		//생성자 안에 함수 호출 가능,,
	}
	public void disp() {
		System.out.println("제작회사 : " + company);
		System.out.println("모델 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("속도 : " + speed);

	}
}
public class EX01 {

	public static void main(String[] args) {

		Car1 car = new Car1();
		// 객체를 생성하면 생성자가 호출이되고 필드 초기화와 메소드 호출 등
		// 객체를 사용할 준비를 한다.
		car.disp();
	}

}
