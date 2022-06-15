package exception;

public class EX02 {

	public static void main(String[] args) {

		try {
			System.out.println(1 / 0);	//0으로 나누기 금지
			
			System.out.println("try 블록");	// 실행 안됨

		}catch(ArithmeticException ae){
			System.out.println("ArithmeticException 예외가 발생");
			
		}catch(Exception e) {
			// ArithmeticException 제외한 모든 예외처리
			// 제일 마지막에 와야한다.**
			System.out.println("Exception 예외가 발생");
		}
		
	}

}
