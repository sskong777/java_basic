package method;

public class EX01 {

	public static void method1() {
		System.out.println("void형 메소드는 리턴값이 없음");
	}
	
	public static int method2() {
		System.out.println("리턴 타입은 int형인 메소드");
		int b =100;
		return b;
	}
	
	public static void main(String[] args) {
		
		System.out.println("main  메소드 ");
		
		method1();	// void 메소드 호출
		
//		method2();	// int 리턴타입 메소드 호출
		int a;
		a = method2();
		
		System.out.printf("메소드2에서 돌려준 값 : %d\n",a);

	}
	
}
