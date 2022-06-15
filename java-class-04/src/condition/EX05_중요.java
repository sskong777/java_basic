package condition;

import java.util.Scanner;

public class EX05_중요 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int temp;
		
		int num1, num2 ,num3;
		
		System.out.print("첫번째 숫자입력 : ");
		num1 = scan.nextInt();
	
		System.out.print("두번째 숫자입력 : ");
		num2 = scan.nextInt();
	
		System.out.print("세번째 숫자입력 : ");
		num3 = scan.nextInt();
		
		if(num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num1 > num3){
			temp = num1;
			num1 = num3;
			num3 = temp;
		} 
		if (num2 > num3) {
			temp = num2;
			num3 = num2;
			num2 = temp;
		}
			

		System.out.printf("정렬 : %d, %d, %d", num1, num2, num3);
		
		scan.close();
	
	}

}
