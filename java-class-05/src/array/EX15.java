package array;

public class EX15 {

	public static void main(String[] args) {

		int[] engScores = new int[] {70 ,80, 90, 65, 89};
		// 학생 5명의 영어점수를 향상된  for문으로 출력
		for (int i : engScores) {
			System.out.print(i + "점  ");
		}
		System.out.println();
		
		// 학생이 2명이 더 늘었다면..
		// --> 새로운 배열을 만들어야됨
		// 기존 배열 복사하기!
		
		int[] newEngScores = new int[7];
		
		for(int i = 0; i < engScores.length; i++) {
			newEngScores[i] = engScores[i];
		}
	
		for (int eng : newEngScores) {
			System.out.print(eng + "점  ");
		}
	
	
	}
	
	

}
