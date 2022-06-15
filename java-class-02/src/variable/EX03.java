package variable;

public class EX03 {

	public static void main(String[] args) {

		// 변수명을 알아보자
		int price1 = 100;
		int $price = 200;
		int _price = 300;
		// 변수 첫 번째 글자는 문자, $, _ 만 가능
//		int 1price = 500; --> 변수는 숫자로 시작할 수 없다.
		// 특수기호는 되도록 사용하지 않도록 한다.
		System.out.println(price1);
		System.out.println($price);
		System.out.println(_price);
		
		
		String firstname = "java";
		String firstName = "자바";
		//String은 문자열을 저장하는 타입.
		//자바의 변수는 대소문자를 구별 
		// 변수 : 첫번째 문자는 소문자 두번째 이어지는 문자는 대문자
		// 클래스명 : 첫번째 문자 대문자, 두번째 이어지는 문자 대문자
		System.out.println(firstname);
		System.out.println(firstName);
	}

}
