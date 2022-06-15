package string;

public class EX04 {

	public static void main(String[] args) {

		//String 메소드
		
		String str1 = "Hello world";
		
		//charAt : 해당 위치의 문자하나를 char형으로 반환
		System.out.println("charAt : " + str1.charAt(0));
		
		//isEmpty : 해당 변수가 비어있으면 true를 아니면 false를 반환
		System.out.println("isEmpty : " + str1.isEmpty());
		
		//length : 문자열의 길이를 반환
		System.out.println("length : " + str1.length());
		
		//toCharArray : 문자열을 한 글자씩 char배열로 반환
		char[] array = str1.toCharArray();
		for(char arr : array) {
			System.out.print(arr + "  ");
		}
		System.out.println();
		
		//replace : 문자열을 교체
		System.out.println(str1.replace("Hello", "Hi"));
		
		
	}

}
