package variable;

public class EX07 {

	public static void main(String[] args) {
//		byte a = 128;	// 지정된 크기보다 더 큰 수를 담을 수 없다.
		byte b = 127;	//byte = 8bit = 256 --> -128~127
		byte c = -128;
				
		System.out.println(b);
		System.out.println(c);
		
		long d = 1234567891L;
		float e = 1234567879123f;
		// 실수는 더 큰 수가 표현이 가능하다.
		
		System.out.println(d);
		System.out.println(e);
	}
	

}
