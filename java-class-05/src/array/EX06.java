package array;

public class EX06 {

	public static void main(String[] args) {
		// index가 3인곳은 출력하지 않고 
		// 나머지만 출력해보자
		int[] intArray = {10,20,30,40,50,60};
		
		for (int i =0 ; i < intArray.length; i ++) {
			if (i == 3) {
				continue;
			}else {
			System.out.println("intArray[" + i + "] : " +  intArray[i]);
			}
		}
		
	}

}
