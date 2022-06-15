package clazz.field;

class Car4{

	private int speed;	//필드를 외부에서 바로 접근 불가능
	// private는 외부접근 허용안됨 // 데이터 보호를 위해서 사용한다.
	// 메소드를 통해서 접근 가능	// 메소드는 매개값을 검증할 수 있다(if문으로)

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed < 0 || speed > 300) {
			return;
		}else {
			this.speed = speed;
		}		
	}
}
public class EX06 {

	public static void main(String[] args) {
		
		Car4 car = new Car4();
		
//		car.speed = 100;	//접근 불가능 --> private때문
		car.setSpeed(400);
		System.out.println(car.getSpeed());
		
		
	}

}
