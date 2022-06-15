package conditon_ex;

import java.util.Scanner;

public class Ex07_최대최소값구하기 {

	public static void main(String[] args) {

			// 정수 3개를 입력받아 최대값, 최소값, 평균값 구해보자
		Scanner scan = new Scanner(System.in);
		
		int n1, n2, n3;
		int max, min;
		
		System.out.print("첫 번째 정수 입력 : ");
		n1 = scan.nextInt();

		System.out.print("두 번째 정수 입력 : ");
		n2 = scan.nextInt();
	
		System.out.print("세 번째 정수 입력 : ");
		n3 = scan.nextInt();
		
		//최대값 구하기
		if (n1 > n2 && n1 > n3) {
			max = n1;
		} else if ( n2 > n3) {
			max = n2;
		} else{
			max = n3;
		}
		
		// 최소값 구하기
		if (n1 < n2 && n1 < n3) {
			min = n1;
		} else if ( n2 < n3) {
			min = n2;
		} else{
			min = n3;
		}
		
		//평균값 구하기
		double agv = (n1+n2+n3)/3;
		
		
		System.out.printf("최대값은 : %d\n",max);
		System.out.printf("최솟값은 : %d\n",min);
		System.out.printf("평균값은 : %.2f\n",agv);
		

		scan.close();
		
	}

}
