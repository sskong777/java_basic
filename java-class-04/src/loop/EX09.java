package loop;

public class EX09 {

	public static void main(String[] args) {
		//중첩 for문 이용해서 * 찍기
		// *****
		// *****
		// *****
		// *****
		// *****
		
		
		for (int i = 0; i <5; i ++) {
			for (int j =0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		// *
		// **
		// ***
		// ****
		// *****
		for (int i = 0; i <5; i ++) {
			for (int j =0; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
		

	}
}