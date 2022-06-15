package array_ex;

import java.util.Scanner;

public class Ex03_성적입력_순위 {

	public static void main(String[] args) {
		//학생 3명의 이름, 국어, 영어 성적을 입력 받고
		//총점과 순위를 나타내보자
		
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] total = new int[3];
		int[] rank = new int[3];
		
		for(int i =0; i < 3 ; i++) {
			System.out.print("이름을 입력하세요 : ");
			name[i] = scan.next();
			System.out.print("국어 성적을 을 입력하세요 : ");
			kor[i] = scan.nextInt();
			System.out.print("영어 성적을 을 입력하세요 : ");
			eng[i] = scan.nextInt();
		
			total[i] = kor[i] + eng[i];
		}
		
		for(int i =0; i < 3 ; i++) {
			rank[i] = 1;
			for (int j = 0 ; j < 3; j++) {
				if(total[i] < total[j]) {
					rank[i]++;
				}
			}
		}
		for(int i =0; i < 3 ; i++) {
			System.out.print(rank[i] + " ");
		}
		
		
		
//		for(int i =0; i < 3 ; i++) {
//			System.out.println(name[i]);
//			System.out.println(kor[i]);
//			System.out.println(eng[i]);
//			System.out.println(total[i]);
//		}
		
		scan.close();
	}

}
