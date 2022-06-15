package array_ex;

public class Ex06_배열복사 {

	public static void main(String[] args) {
		
		int[] engScores = new int[] {70 ,80, 90, 65, 89};

		int[] newEngScores = new int[7];
		
		for(int i  = 0; i < engScores.length;i++) {
			newEngScores[i] = engScores[i];
		}
		
		for(int j : newEngScores) {
			System.out.print(j + " ");
		}
	}
	

}
