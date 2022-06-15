package operation;

public class EX03 {

	public static void main(String[] args) {
		int a ,b ,c ;
		a = b = c =100;
		//오른쪽의 값을 왼쪽 변수에 저장 --대입연산자
		System.out.printf("%d, %d, %d\n", a, b, c);
		
		a += 100;
		b -= 100;
		c *= 100;
		System.out.printf("%d, %d, %d\n", a, b, c);
		
		
		a = b= 10;
		System.out.printf("a,b 의 값 : %d , %d\n",a,b);
		a /= 5;
		b %= 3;

		System.out.printf("a,b 의 값 : %d , %d\n",a,b);
	
	}

}
