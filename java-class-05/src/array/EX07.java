package array;

import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {

		int[] array = {100,200,300,400,500};
		
		// index를 입력 받아서 배열의 값 출력하기

		Scanner scan = new Scanner(System.in);
		
		System.out.print("인덱스 번호 입력 : ");
		
		int indexNo;
		indexNo = scan.nextInt();
		if (indexNo < 0 || indexNo >= array.length) {
			System.out.println("인덱스 범위를 초과했습니다");
		}else {
		System.out.println("array 배열의 인덱스 번호가 " + indexNo + "인 값은 " + array[indexNo]);
		System.out.printf("array 배열의 인덱스 번호가 %d인 값은 %d 이다",indexNo,array[indexNo]);
		}
		scan.close();
	}

}