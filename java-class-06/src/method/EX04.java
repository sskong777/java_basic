package method;

public class EX04 {
	
	// 전원을 키는 powerOn() 메소드와
	// 매개값을 2개 받아서 더하는 add(int x, int y)메소드를 만들어보자

	public static void powerOn() {
		System.out.println("전원이 켜졌습니다.");
		
	}
	public static int add(int x, int y) {
		int sum;
		sum = x + y;
		return sum;
	}
	
	
	public static void main(String[] args) {

		powerOn();
		
		int sum = add(12,43);
		System.out.println("더한값은" + sum);
		//int형 메소드를 호출시 리턴값을 int형으로 받는다
		
	}

}
