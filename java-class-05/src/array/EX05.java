package array;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		//배열과 for문을 이용해서 5명의 자바점수를 입력받고
		//각 학생의 자바점수를 출력하고 
		//총 자바점수의 합과 평균을 구해보자
		
		Scanner scan = new Scanner(System.in);
		
		int[] java = new int[5];
		int sum = 0;
		double agv = 0;
		
		for (int i = 0; i < java.length; i++) {
			System.out.print(i+1 + "번 학생의 점수는 : ");
			java[i] = scan.nextInt();
			sum += java[i];
		}
		System.out.println("총 자바점수의 합 : " + sum);
		agv = sum/java.length ;
		System.out.println("총 자바점수의 평균 : " + agv);
		
		scan.close();
	}

}
