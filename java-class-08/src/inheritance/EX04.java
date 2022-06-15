package inheritance;


class Car {
	int speed;
	
	void upSpeed(int speed) {
		this.speed += speed;
		System.out.println("현재속도(Car클래스) : " + this.speed);
	}
}

// Car 클래스를 상속받는 Genesis 클래스를 만들어
// upSpeed 메소드를 재정의 해보세요
// 속도는 최고속도 150
class Genesis extends Car{
	
	@Override
	void upSpeed(int speed) {	//재정의 메소드
		this.speed += speed;
		if(this.speed  >150) {
			this.speed = 150;
		}
		System.out.println("현재속도(Genesis클래스) : " + this.speed);
	}
}

class Porter extends Car{
	
	@Override
	void upSpeed(int speed) {
		this.speed += speed;
		if(this.speed  >100) {
			this.speed = 100;
		}
		System.out.println("현재속도(Porter클래스) : " + this.speed);
	}
}

public class EX04 {

	public static void main(String[] args) {

		Car car =  new Car();
		Genesis genesis = new Genesis();
		Porter porter = new Porter();
		
		car.upSpeed(200);
		genesis.upSpeed(200);
		porter.upSpeed(200);
	}

}
