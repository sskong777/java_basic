package clazz.array;

class Name{
	
	String name ;	//필드
	
	public Name() {}	//기본생성자
	
	public Name(String name) {	//매개값을 받아서 필드초기화 생성자
		this.name = name;
	}
	
	
	public String getName() {	//name을 리턴해주는 메소드
		return name;
	}
	public void setName(String name) {	//필드에 셋팅해주는 메소드
		this.name = name;
	}


}
public class EX02 {

	public static void main(String[] args) {

		Name[] name = new Name[3];	//객체 "배열" 생성
		name[0] = new Name("홍길동");
		name[1] = new Name("성춘향");
		name[2] = new Name("이순신");
		
		for(int i = 0; i < name.length; i++) {
			System.out.println(name[i].name);
			//객체원소에 도트연산자(.)를 사용해서 필드나 메소드에 접근가능
		}
		System.out.println();
		
		name[1].name = "이준영";	//필드로 접근
		name[2].setName("장보고");//메소드로 접근
	
		for(int i = 0; i < name.length; i++) {
			System.out.println(name[i].getName());
		}
	}

}
