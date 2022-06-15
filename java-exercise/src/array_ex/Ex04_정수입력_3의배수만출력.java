package array_ex;

import java.util.Scanner;

public class Ex04_정수입력_3의배수만출력 {

	public static void main(String[] args) {
		// 정수 5개를 입력받아
		// 입력받은 정수 중에서 3의 배수만 출력해보기

		Scanner scan = new Scanner(System.in);
		
		int[] array = new int[5];
		
		for(int i = 0 ; i < array.length; i++) {
			System.out.printf("%d번째 정수 입력 : ",i+1);
			array[i] = scan.nextInt();
		}
		System.out.print("3의 배수 : ");
		for (int i : array) {
			if(i % 3 == 0) {
				System.out.printf("%d ",i);
			}
		}
	
		scan.close();
	}

}
