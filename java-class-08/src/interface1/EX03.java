package interface1;

//필드의 다형성
class Car{
	Tire tire = new HankookTire();
	void run() {
		tire.roll();
	}
}

interface Tire {
	public abstract void roll();
}

class HankookTire implements Tire{
	@Override
	public void roll() {
		System.out.println("한국타이어가 굴러갑니다");
	}
}

class KumhoTire implements Tire{
	@Override
	public void roll() {
		System.out.println("금호타이어가 굴러갑니다");
	}
}

public class EX03 {

	public static void main(String[] args) {

		Car car = new Car();
		car.run();
		
		car.tire = new KumhoTire();	//필드의 다형성
		car.run();
	}
	
}

