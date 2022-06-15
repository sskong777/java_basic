package quiz;

public class EX03 {

	public static void main(String[] args) {
		// 중첩for문을 이용해서 *찍기
		//		*
		//	   **
		//	  ***
		//   ****
		//  *****
		for (int i = 0; i < 6; i++) {
			for(int j = 5; j >= 0; j--) {
				if(i < j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	
	}

}
