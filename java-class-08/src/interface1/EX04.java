package interface1;

// 매개변수의 다형성
interface Vehicle{
	public void run();
}

class Bus implements Vehicle{
	@Override
	public void run() {
		System.out.println("버스가 달립니다");
	}
	public void checkFare() {
		System.out.println("승차요금을 체크합니다");
	}
}

class Taxi implements Vehicle{
	@Override
	public void run() {
		System.out.println("택시가 달립니다");
	}
}

class Driver{
	
	public void drive(Vehicle vehicle) {
		// 버스객체가 들어온다면 checkFare 메소드를 호출
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}

public class EX04 {

	public static void main(String[] args) {

		Driver driver = new Driver();
		Bus bus  = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(taxi);
		System.out.println();
		driver.drive(bus);
	}

}
