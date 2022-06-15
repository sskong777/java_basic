package array;

import java.util.Scanner;

public class EX12 {

	public static void main(String[] args) {

		//학생 3명의 이름, 국어, 영어 성적을 입력 받고
		//총점과 순위를 나타내보자

		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] total = new int[3];
		int[] rank = new int[3];
		
		//데이터 입력받기
		for (int i = 0 ; i < 3; i++) {
			System.out.print(i + 1 + "번째 이름 : ");
			name[i] = scan.next();

			System.out.print(i + 1 + "번째 수학성적 : ");
			kor[i] =scan.nextInt();

			System.out.print(i + 1 + "번째 영어성적 : ");
			eng[i] =scan.nextInt();
		
		}
		// 총점 구하기
		for (int i = 0 ; i < 3; i++) {
			total[i] = kor[i] + eng[i];		
		}
		//
		// 순위 구하기 : 우선 1등으로 초기화를 하고
		// 다른 학생성적과 비교하여 작으면 순위를 하나 올려준다 (중첩 for문)
		for (int i = 0 ; i < 3; i++) {
			rank[i] = 1;
			
			for (int j = 0; j < 3; j ++) {
				
				if(total[i] < total[j]) {
					rank[i]++;
				}
			}		
		}
		for (int i = 0; i < 3; i ++) {
			System.out.printf("%s님의 총점은 %d점 이고 ,순위는 %d등 입니다\n",name[i],total[i],rank[i]);
		}
		
		
		scan.close();
		
	}
}
