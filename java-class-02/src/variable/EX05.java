package variable;

public class EX05 {

	public static void main(String[] args) {

		byte a = 100;
		short b = 200;
		
		char c1 = 'A';
		//문자는 작은따옴표 (' ') 를 쓴다
		char c2 = '\u0041'; //유니코드 표현법
		char c3 = 65; //내부적으로 정수로 저장됙 떄문에 오류x --> 65로 출력
		
		int d = 1000;	//4byte
		long e = 123456789L; //8byte
		
		float f = 3.14f;	//4byte
		double g = 3.148592;	//8yte
		
		boolean h = true;	//1byte
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	
		
	}
	

}
