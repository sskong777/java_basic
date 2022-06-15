package quiz_ex;

public class Ex03_별찍기 {

	public static void main(String[] args) {
		//중첩 for문을 이용해서 *찍기
		for(int i = 0; i <5;i++) {
			for(int j = 4; j >=0; j--) {
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
