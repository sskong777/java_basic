package array_ex;

import java.util.Scanner;

public class Ex02_5개숫자작은순서대로 {

	public static void main(String[] args) {

		// 5개 숫자를 입력받아 작은수부터 나열하기
		// 배열, for문 (중첩), if문 ,Scanner 사용
		Scanner scan = new Scanner(System.in);
		int[] array = new int[5];
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf(i+1 + "번 쨰 숫자 입력 : ");
			array[i] = scan.nextInt();
		}
//		for (int i = 0; i < array.length; i++) {
//			
//			System.out.println(array[i]);
//			}
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
			}
	
	scan.close();
	}
	
	
	
	

}
