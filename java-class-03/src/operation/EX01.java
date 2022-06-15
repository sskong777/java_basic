package operation;

public class EX01 {

	public static void main(String[] args) {
		
		int i, j;	//변수 두 개 동시선언
		i = +100;
		j = -200;
		System.out.println(i+j);	//산술연산자
		
		
		//증감연산자의 독립사용일 때
		int x = 1, y = 1 ;
		
		x++; 	// x는 현재 2
		y = x;	// 대입연산자 --> y : 2
		System.out.printf("결과 >> x : %d, y: %d\n\n", x, y);

		++x;	// x : 3
		y = x;	// y : 3
		System.out.printf("결과 >> x : %d, y: %d\n\n", x, y);
		
		x = y = 1;
		System.out.printf("결과 >> x : %d, y: %d\n\n", x, y);
		
		
		
		//증감연산자의 독립사용이 아닐 때
		y = ++x;
		// 연산 과정 : x룰 1 증가 후 y = x를 실행
		// x : 2, y : 2
		System.out.printf("결과 >> x : %d, y: %d\n\n", x, y);
		
		y = x++;
		//연산과정 : y = x를 실행 후 x를 1증가
		// x : 3 , y =2
		System.out.printf("결과 >> x : %d, y: %d\n\n", x, y);
		
	}

}
