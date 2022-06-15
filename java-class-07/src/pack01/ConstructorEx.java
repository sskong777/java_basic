package pack01;

public class ConstructorEx {
	
	//public은 모든 패키지에서 생성자 호출
	public ConstructorEx() {
		System.out.println("public 생성자");
	}
	
	//protected는 같은 패키지와 자식클래스에서 생성자 호출
	protected ConstructorEx(int a) {
		System.out.println("protected 생성자");
	}
	
	//default는 같은 패키지에서 제한없이 생성자 호출
	ConstructorEx(int a, int b) {
		System.out.println("default 생성자");
	}
	
	//private는 오로지 클래스 내부에서만 생성자 호출
	private ConstructorEx(int a, int b, int c) {
		System.out.println("private 생성자");
	}
	
	public static void main(String[] args) {
		// 같은 클래스 내부에서는 모두 사용 가능
		ConstructorEx ex1 = new ConstructorEx();
		ConstructorEx ex2 = new ConstructorEx(1);
		ConstructorEx ex3 = new ConstructorEx(1,2);
		ConstructorEx ex4 = new ConstructorEx(1,2,3);
	
	}
}
