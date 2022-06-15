package array_ex;

import java.util.Scanner;

public class Ex05_Ex04응용 {

	public static void main(String[] args) {
		// 정수 5번을 입력받아 array1 배열의 값을 넣은 후
		// 3과 나누어 떨어지는 (3의배수) 정수의 갯수를
		// array2 배열의 길이로 만든 후 그 값을 (3의 배수)
		// array2 배열에 담고 출력해보자

	Scanner scan = new Scanner(System.in);
	
	int[] array1 = new int[5];
	
	for (int i = 0 ; i < array1.length; i++) {
		System.out.print(i+1 + "번 째 정수를 입력 : ");
		array1[i] = scan.nextInt();
	}
	int count = 0;
	for (int i : array1) {
		if(i % 3 == 0) {
			count++;
		}
	}
	System.out.println(count);
	
	int[] array2 = new int[count];
	
	int x = 0;
	for(int i = 0 ; i < array1.length; i++) {
		if(array1[i] % 3 ==0) {
			array2[x] = array1[i];
			x++;
		}
	}
	
	
	for(int k : array2) {
		System.out.print(k + " ");
	}
//	
//	for(int i = 0 ; i < array2.length; i++) {
//		System.out.print(array2[i] + " ");
//	}
//	
	
	
	

	
	scan.close();
	}
}
