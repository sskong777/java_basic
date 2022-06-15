package inner;

class Outer5 {
	
	public void aaa() {
		System.out.println("aaa");
	}

	public void bbb() {
		System.out.println("bbb");
	}

	public void ccc() {
		System.out.println("ccc");
	}
}

public class EX05_Override어노테이션 {
	
	public static void main(String[] args) {
		//익명의 자식클래스 
		Outer5 anonymity = new Outer5() {
			
			@Override
			public void bbb() {	//오버라이딩
				System.out.println("bbbbb");
			}			
		};	//세미콜론을 붙여준다
		
		//어노테이션
		// -소스코드에 메타코드를 주는 것
		// -컴파일러에게 코드문법 에러를 체크하도록 정보제공
		// -실행 시 (런타임 시) 특정 기능을 실행하도록 정보제공
		
		//@Override 어노테이션
		// -컴파일러에게 코드문법 에러를 체크하도록 정보제공
		// -메소드 선언 시 사용되며, 메소드가 오버라이드(재정의) 된 것임을
		//	컴파일러에게 알려 컴파일러가 검사를 하도록 한다.
		// -오버라이드 되지 않았다면, 컴파일러는 에러를 발생시킨다.
		
		
		anonymity.aaa();
		anonymity.bbb();
		anonymity.ccc();
	}
	
	

}
