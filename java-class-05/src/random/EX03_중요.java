package random;

import java.util.Scanner;

public class EX03_중요 {

	public static void main(String[] args) {

// 로또 게임 만들기
		Scanner scan  = new Scanner(System.in);
		
		int[] lotto = new int[6];
		int[] myLotto = new int[6];
		int count = 0 ;
// lotto 배열에 중복 수 없이 1 ~ 45 사이의 임의의 정수 넣기
		for (int i = 0 ; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45) + 1;
			
			for (int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
// Scanner로 입력받아 내가 직접 1~45 사이의 로또번호 넣기
		for (int i = 0; i < myLotto.length; i ++) {
			System.out.print(i+1 + "나의 로또번호 입력 : ");
			myLotto[i] = scan.nextInt();
			if (myLotto[i] > 45 || myLotto[i] < 1) {
				System.out.println("1~45사이의 정수를 입력해주세여");
				i--;
				continue;
			}
			
			for (int j = 0; j < i; j++) {
				if (myLotto[i] == myLotto[j]) {
					System.out.println("같은 번호를 입력할 수 없습니다. 다시 입력하세요");
					i--;
					break;
				}
			}
		}
		System.out.print("나의 로또 번호 : ");
		for (int j : myLotto) {
			System.out.print(j + "  ");
		}
		System.out.println();
		
		System.out.print("랜덤 로또 번호 : ");
		for (int i : lotto) {
			System.out.print(i + "  ");
		}
		System.out.println();
		
// lotto배열과 myLotto배열을 비교하여 몇개나 맞추었는지 알아보기
		for (int i =0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length; j++) {
				if(myLotto[i] == lotto[j]) {
					count++;
				}
			}
		}

		System.out.printf(count + "개 맞췄습니다");
		scan.close();
	}

}
