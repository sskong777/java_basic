package method;

public class EX05 {
	
	// 메소드 오버로딩
	
	// 같은 이름으로 다양한 기능을 사용하기 위해서
	// 조건 : 매개변수의 타입,갯수,순서 중 하나가 달라야 한다.
	
	public static void profile(String name) {
		System.out.println("이름 : " + name);
	}
	
	public static void profile(String name, int age) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}

	public static void profile(String name, int age, String phoneNum) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전화번호 : " + phoneNum);
	}
	
	
	public static void main(String[] args) {

		profile("홍길동");
		System.out.println();

		profile("성춘향",20);
		System.out.println();
		
		profile("성춘향",20,"010-2333-5553");
	
	}

}
