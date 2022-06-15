package random_ex;

import java.util.Scanner;

public class Ex03_로또번호맞추기 {

	public static void main(String[] args) {

		Scanner scan  = new Scanner(System.in);
		int[] lotto = new int[6];
		int[] mylotto = new int[6];
		
		// lotto 배열에 중복 수 없이 1 ~ 45 사이의 임의의 정수 넣기
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45) + 1;
			
			for(int j = 0 ; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("이번주 로또 당첨 번호는 : ");
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}

		System.out.println();
		// Scanner로 입력받아 내가 직접 1~45 사이의 로또번호 넣기

		for (int i = 0; i < mylotto.length; i ++) {
			System.out.print(i + 1 +"번 째 번호 입력 : ");
			mylotto[i] = scan.nextInt();
			if(mylotto[i] < 1 || mylotto[i] > 45) {
				System.out.println("범위를 초과하였습니다.");
				i--;
				continue;
			}
			for (int j = 0 ; j < i; j ++) {
				if(mylotto[i] == mylotto[j]) {
					System.out.println("번호가 중복되었습니다");
					i--;
					break;
				}
			}
		}
		System.out.print("나의 로또 번호 : ");
		for (int j : mylotto) {
			System.out.print(j + "  ");
		}
		System.out.println();
		
		System.out.print("랜덤 로또 번호 : ");
		for (int i : lotto) {
			System.out.print(i + "  ");
		}
		System.out.println();
		
		
		
		// lotto배열과 myLotto배열을 비교하여 몇개나 맞추었는지 알아보기	
		int count = 0;
		for(int i = 0 ; i < lotto.length; i++) {
			for (int j = 0 ; j < mylotto.length; j++) {
				if(lotto[i] ==mylotto[j]) {
					count++;
				}
			}
		}
		System.out.println("이번주 로또번호 맞춘 갯수는 : " + count);
		
		scan.close();
	}

}
