package wrapper;

public class EX04 {

	public static void main(String[] args) {
		
		// 문자열을 기본형으로 바꿀 때
		// parseInt : 문자열 >> 기본형
		// valueOf : 문자열 >> wrapper 클래스타입
		
		String str = "100";
		
		Integer value1 = Integer.valueOf(str);
		System.out.println(value1.intValue());
		
		int value2 = Integer.parseInt(str);
		System.out.println(value2);
		
		// JDK 1.5부터 자동박싱, 자동언박싱이 지원되어
		// 반환값이 기본형일때와 wrapper 클래스 일때의 차이가 없어졌다.
		
		
		
	}
}
