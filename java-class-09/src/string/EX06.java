package string;

public class EX06 {

	public static void main(String[] args) {

		String str1 = "Hello Java";
		
		//indexOf : 문자열에 지정한 문자가 처음 몇번 째에 있는지 반환
		System.out.println("indexOf : " + str1.indexOf("l"));
		
		//lastIndexOf : 문자열에 지정한 문자가 마지막 몇번째에 있는지 반환
		System.out.println("lastIndexOf : "+ str1.lastIndexOf("l"));
		
		//substring : 문자열에 지정한 범위에 속하는 문자열을 반환
		//(시작범위에 값은 포함하고, 끝나는 범위에 값은 포함하지 않는다/.)
		String str2 = "ABCDE";
		String substring = str2.substring(0,2);
		System.out.println("substring :" + substring);
	}

}
