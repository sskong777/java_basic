package clazz.constructor;


// Car3 클래스를 만든다.
// 필드는 String  color; int speed;로 하고 외부접근 금지가 되게한다.
// 생성자에서 매개값을 받아 필드를 초기화 하자.
// 속도(speed)가 0미만이거나 200을 초과할경우 속도는 50으로 셋팅한다.
// get 메소드를 만들어서 color필드와 speed 필드를 사용할 수 있게 하자.

class Car3{
	
	private String color;
	private int speed;
	
	public Car3(String color, int speed){
		this.color = color;
		if(speed < 0 || speed > 200) {
			System.out.println("속도는 0이상이거나 200이하여야 합니다");
			System.out.println("속도를 50으로 기본셋팅합니다");
			this.speed = 50;
		}else {
			this.speed = speed;
		}
	
	}
	
	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}
		
}


public class EX03 {

	public static void main(String[] args) {

		Car3 mycar = new Car3("빨강",300);
		
		System.out.println("내 자동차 색상은  : " + mycar.getColor());
		System.out.println("내 자동차 속도는  : " + mycar.getSpeed());
	
	}

}
