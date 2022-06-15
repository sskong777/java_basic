package random;

import java.util.Scanner;

public class EX05_중요 {

	public static void main(String[] args) {
		//1 ~ 10까지 무작위 숫자 맞추기 게임
		
		//int[] randomNumber[]배열을 만들어서
		//1~10까지 숫자 중 무작위 숫자 3개를 뽑는다
		//내가 숫자를 1 ~ 10 까지만 계속 입력받아 무작위 숫자
		//3개를 몇번만에 맞췄는지 알아보자
		
		int[] randomNumber = new int[3];
		
		for(int i =0; i < randomNumber.length; i++) {
			randomNumber[i] = (int)(Math.random()*10)+1;
			
			for(int j =0; j < i ; j++) {
				if(randomNumber[i] == randomNumber[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("무작위 숫자 3개를 뽑았습니다");
		
		Scanner scan = new Scanner(System.in);
		
		boolean[] answer = new boolean[3];
		//입력받은 수를 하나씩 맞출때 마다 true로 변환
		int count = 0;	//몇번만에 맞추었는지 확인하는 수
		int i =0;	//temp배열의 제어변수
		
		int[] temp = new int[10];
		//내가 입력받은 수를 저장할 temp배열
		
		Loop1 : while(true) {	//while문의 이름 지정
			System.out.println("숫자 1~10까지 중 하나를 입력하세요");
			int myNumber = scan.nextInt();
			
			if(myNumber < 1 || myNumber >10) {
				System.out.println("잘못 입력했습니다.");
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			
			for(int j = 0; j <temp.length; j++) {
				if(temp[j] == myNumber) {
					System.out.println("전과 같은 수를 입력했습니다");
					continue Loop1;	//while문으로 다시 도려보낸다	
				}
			}
			temp[i] =myNumber;	//temp배열에 나의 숫자를 넣는다
			i++;
			
			count++;
			
			for(int j = 0 ; j < randomNumber.length; j++) {
				
				if(myNumber == randomNumber[j]) {
					
					answer[j] = true;
					
					if(answer[0] ==true && answer[1] ==true && answer[2] ==true ) {
						System.out.println(count + "만에 숫자륾 모두 맞췄습니다");
						
						for(int k = 0; k <randomNumber.length; k ++) {
							System.out.println(k+1 + "번째 랜덤 수 : "  + randomNumber[k]);
							
						}
						System.exit(0);
					}
					
					
					
					
					
				}
			}
			
			
			
			
		}
		
		
	}

}
