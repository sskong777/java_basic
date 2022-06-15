package variable;

public class EX08 {

	public static void main(String[] args) {
		
		byte a = 10;
		int b = a; //자동 타입변환
		
		//char ch = a;
		//음수가 저장될 수 있는 byte타입을
		//char 타입으로 자동 타입변환 시킬 수 없다.
	
		
		byte c =10;
		byte d =20;
		//byte result = c + d; // 에러
		//정수의 연산 시에는 기본티입인 int형으로 연산한다.
		int result = c + d;
		
		int e = 10;
		double f =10.2;
		double result2 = e + f;
		//int 타입 피연산자가 double타입으로 자동타입변환 되고 연산을 수행.
		// --> e가 double타입으로 자동 형변환 --> 10.0
	
		char ch1 = 'A';
		int g = ch1; //char값은 실제로는 정수로 저장
		//int형으로 자동타입변환이 될 수 있다. --> 65
		
		System.out.println(b);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(g);
	}
}
