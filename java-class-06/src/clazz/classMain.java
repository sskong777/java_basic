package clazz;

class Person{	//설계도
	//클래스 안에 구성멤버는
	//필드, 생성자, 메소드
	
	// 필드(속성)
	// class에 선언된 변수를 필드라고 한다.
	String name;
	int age;
	
	public Person() {}	// 생성자
	// 생성자 이름은 클래스 이름과 같다
	// 메소드 (기능)
	public void walk() {}
	public void run() {}

}



public class classMain {	//객체생성

	public static void main(String[] args) {

		Person person = new Person();
		//클래스 변수 = new 생성자;
		//Person클래스를 쓰기위한 객체생성
		
	}

}
