package operation;

public class EX02 {

	public static void main(String[] args) {
		
		int a, b, c, d;
		a = 10;
		b = 20;
		c = 30;
		d = 40;
		
		int result1 = a + b * c - d;
		System.out.println("10 + 20 * 30 - 40 = " + result1 );
		//산술연산식에서 덧셈,뺼셈보다는  곱셈,나눗셈이 우선처리된다.
	
		boolean result2 = a < b  && c > d;
		System.out.println("10 < 20 && 30 > 40 = " + result2);
		// 논리연산자(&&,||)보다는 비교연산자(<,>)의 우선순위가 높다.
		
		boolean result4  = a > b || c < d;
		System.out.println("10 > 20 || 30 < 40 = " + result4);
		// || : 피연산자 중 하나만 true이면 true
		
		// 비트 연산자 (사용안함)
		// 10 : 0 0 0 1 0 1 0
		//  7 : 0 0 0 0 1 1 1
		
		//  & : 0 0 0 0 0 1 0	--> 2
		//  | : 0 0 0 1 1 1 1	--> 15
		//  ^ : 0 0 0 1 1 0 1	--> 13
		System.out.println(7 & 10);
		System.out.println(7 | 10);
		System.out.println(7 ^ 10);
		
		
		
	}

}
