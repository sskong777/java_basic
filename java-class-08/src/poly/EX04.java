package poly;
// 매개변수의 다형성
class Vehicle{
	public void run() {
		System.out.println("차량이 달립니다");
	}
}

class Bus extends Vehicle{
	@Override
	public void run() {
		System.out.println("버스가 달립니다");
	}
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}

class Taxi extends Vehicle{
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}

class Driver{
	public void drive(Vehicle vehicle) {	//매개변수도 클래스타입으로 받을 수 있다..
											//여기에 자식클래스도 받을 수 있다****
		if(vehicle instanceof Bus) {	//객체타입확인연산자(매개값으로 들어온 객체가 Bus타입으로 들어온 인스턴스라면)
			Bus bus = (Bus)vehicle;	//강제타입변환
			bus.checkFare();
		}
		vehicle.run();		//객체가 Bus타입이 아니라면 이 문장만 실행
	}
}
public class EX04 {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		//재정의 된 run메소드 출력
		driver.drive(taxi);	//매개변수의 다형성
		System.out.println();
		driver.drive(bus); //매개변수의 다형성
	}

}
