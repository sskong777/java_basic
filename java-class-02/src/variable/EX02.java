package variable;

public class EX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메인메소드 자동 호출
		
		int a; //정수타입 변수선언
		a = 10; //선언 후 저장 ; 초기화
		// =은 오른쪽의 값을 왼쪽 변수에 저장한다.
		
		
//		int a = 20; // 에러 <--변수 선언
//		a = 20; //가능		<-- 변수에 대입
		// 같은 이름의 변수가 2개가 있으면 프로그램에서는 
		// 어떤 변수를 골라야하는지 모른다.
		
		int b;
		b = 20;
		
		int c;
		c = 30;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int aa = 40; // 변수 선언과 동시에 초기화
		int bb = 50;
		int cc = 60;
		
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
	}

}
