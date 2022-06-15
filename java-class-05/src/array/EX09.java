package array;

import java.util.Scanner;

public class EX09 {

	public static void main(String[] args) {
		
		//배열 중에 2개의 인덱스를 입력받아 값을 교환하기
	
		Scanner scan = new Scanner(System.in);
		
		int[] array = {1, 2, 3, 4, 5};
		
		System.out.println("교환 전 array 배열");
		
		for (int i = 0; i < array.length; i ++) {
			System.out.print(array[i] +  "  ");
		}
		System.out.println();
		
		System.out.print("첫 번째 교환할 인덱스 : ");
		int x = scan.nextInt();
		System.out.print("두 번째 교한할 인덱스 : ");
		int y = scan.nextInt();
		
		int temp;
		temp = array[x];
		array[x] = array[y];
		array[y] = temp;
		
		System.out.println("교환 후 array 배열");

		for (int i = 0; i < array.length; i ++) {
			System.out.print(array[i] +  "  ");
		}
		System.out.println();		
		
		scan.close();
	}

}
