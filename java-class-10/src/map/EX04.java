package map;

import java.util.HashMap;

//ProfileInfo 클래스를 만든다.
//필드는 String address; String number;
//생성자를 통해 초기화 시켜준다
class ProfileInfo{
	String address;
	String number;
	
	public ProfileInfo(String address, String number) {
		this.address = address;
		this.number = number;
	}
}
public class EX04 {

	public static void main(String[] args) {

		// HashMap을 이용해서 key값(이름)은 String,  value값은 ProfileInfo이다
		// put 메소드로 3명의 키와 밸류를 넣고 key값을 이용해서 value를 출력해보다
		HashMap<String,ProfileInfo> map = new HashMap<>();

		map.put("홍길동", new ProfileInfo("종로3가", "010-2355-6997"));
		map.put("이순신", new ProfileInfo("강남", "010-9374-0182"));
		map.put("성춘향", new ProfileInfo("강북", "010-8766-1234"));
		
		ProfileInfo pro1 = map.get("홍길동");
		System.out.println("홍길동의 프로필");
		System.out.println("주소 : " + pro1.address);
		System.out.println("전화번호 : " + pro1.number);
		System.out.println();
		
		ProfileInfo pro2 = map.get("이순신");
		System.out.println("이순신의 프로필");
		System.out.println("주소 : " + pro2.address);
		System.out.println("전화번호 : " + pro2.number);	
		System.out.println();
		
		ProfileInfo pro3 = map.get("성춘향");
		System.out.println("성춘향의 프로필");
		System.out.println("주소 : " + pro3.address);
		System.out.println("전화번호 : " + pro3.number);
	
	}

}
