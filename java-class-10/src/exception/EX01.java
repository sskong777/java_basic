package exception;

public class EX01 {

	public static void main(String[] args) {

//		system.out.println();
		//컴파일 에러 : 컴파일 자체가 안됨
		//자바 컴파일러 : 번역(구문체크)
		
//		System.out.println(args[0]);
		// 실행 에러 : 실행 중 발생
		
		try {
			System.out.println(args[0]);
			//예외가 발생할 가능성이 잇는 문장들을 넣는다
		}catch(Exception e){
			//예외처리를 위한 문장을 넣는다
			System.out.println("예외 발생!!");
		}finally {
			System.out.println("항상 수행");
			// 예외의 발생여부에 관계없이 항상 수행되어야 하는 문장들을 넣는다.
			// finally 블록은 try - catch문의 맨 마지막에 위해야한다.
			
		}
		try {
			System.out.println(123);
			//예외가 발생할 가능성이 잇는 문장들을 넣는다
		}catch(Exception e){
			//예외처리를 위한 문장을 넣는다
			System.out.println("예외 발생!!");
		}finally {
			System.out.println("항상 수행");
			// 예외의 발생여부에 관계없이 항상 수행되어야 하는 문장들을 넣는다.
			// finally 블록은 try - catch문의 맨 마지막에 위해야한다.
			
		}
	
	
	}

}
