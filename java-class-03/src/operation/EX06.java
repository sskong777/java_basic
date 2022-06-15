package operation;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a, b;
		
		System.out.print("첫번쨰 계산할 값 입력 : ");
		a = scan.nextDouble();

		System.out.print("두번쨰 계산할 값 입력 : ");
		b = scan.nextDouble();

		System.out.printf("%.2f + %.2f = %.2f\n",a,b,a+b);

		System.out.printf("%.2f - %.2f = %.2f\n",a,b,a-b);

		System.out.printf("%f * %f = %f\n",a,b,a*b);

		System.out.printf("%f / %f = %f\n",a,b,a/b);
	
		
		scan.close();
	}

}
