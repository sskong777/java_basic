package loop_ex;

public class Ex12_구구단while {

	public static void main(String[] args) {
		
		int num = 1;
		while (num < 10) {
			int dan = 2;
			while( dan < 10) {
				System.out.printf("%d * %d = %d\t",dan, num, dan * num);
				dan ++;
			}
			num++;
//			dan =2;
			System.out.println();
		}
	}

}
