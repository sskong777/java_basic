package variable;

public class EX09 {
	public static void main(String[] args) {
		
		char ch1 ='A';
		int a = ch1;
		System.out.println(a);	// -->65
		
		byte b =65;
		char ch2 = (char)b;
		//char는 ㅎ음수가 없는 특수 자료형이기 떄문에
		// 자동 타입 변환예외이다. 강제타입변환 형식으로 해준다
		System.out.println(ch2);	//--> A
		
		int c =128;
		byte d =(byte)c; //강제 타입 변환
		//지정된 타입보다 값이 더 클 경우 강제 타입변환을 하면
		//(OverFlow) : 가장 작은 값으로 돌아간다.
		System.out.println(d); 		//--> -128
		
		float e = 3.14f;
		int f = (int)e;
		//실수를 정수로 강제 타입변환을 하면 정수부분만 저장된다.
		System.out.println(f); 	//--> 3
		
			
	}

}
