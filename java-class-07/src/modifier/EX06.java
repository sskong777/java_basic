package modifier;

public class EX06 {



public static void main(String[] args) {

	//public : 접근제한자, 누구나 접근가능
	//static : 지정예약어, 메모리에 미리 올린다.
	//void : 반환형, 반환할 것이 없다고 알려주는 반환형
	//main : 메소드명, 시작 시 JVM이 main메소드를 찾는다.
	//String[] args : 매개변수, String형태의 배열로 arguments 값을 처리한다.
	
	for(String str : args) {
		System.out.println(str);
	}
	}

}