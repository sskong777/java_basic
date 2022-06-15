package clazz.field;

//Person 클래스를 만든다.
//필드는 String name; int age; String number;로 하고 외부접근 금지가 되게한다.
//get set 메소드를 만들어서 메소드로 필드를 접근하게 한다.
//나이가 기본 성인 나이 20살부터 100살까지만 초기화 할 수 있게 setAge 메소드를 수정한다.

class Person{

	private String name;
	private int age;
	private String number;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 20 || age >100) {
			System.out.println("나이는 20살부터 100살까지 입니다.");
			System.out.println("기본 성인나이 20살로 초기화 합니다.");
			this.age = 20;
		}else {
			this.age = age;
		}
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
}
public class EX07 {

	public static void main(String[] args) {

		Person person = new Person();
//		person.name = "홍길동";	//바로 접근 불가능
		
		person.setName("홍길동");
		person.setAge(99);
		person.setNumber("010-2312-1246");
		
		String name = person.getName();
		int age = person.getAge();
		String number = person.getNumber();
		
		System.out.println("이름은 : " + name);
		System.out.println("나이는 : " + age);
		System.out.println("번호는 : " + number);
		
	}

}
