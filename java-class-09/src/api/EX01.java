package api;
//우리가 만든 클래스는
//String 클래스같이 equals() 메소드가 재정의 되어있지 않다
//따라서 Object 클래스의 hashCode() 메소드와 equals() 메소드를
//오버라이딩 하여 재정의 해주어야한다

class Person{
	private String name;
	private int age;
	private final String SSN;

	public Person(String name, int age, String ssn) {
		this.name = name;
		this.age = age;
		this.SSN = ssn;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person person = (Person)obj;
			boolean bool = this.name.equals(person.name)	//name은 String타입이라 equals재정의 되어있음
					&& this.age == person.age
					&& this.SSN.equals(person.SSN);
			return bool;
			
		}else {
		return super.equals(obj);
		}
	}
	
	@Override
	public int hashCode() {
		return (name +age + SSN).hashCode();	
		//String의 해시코드 호출: 동일한 문자열이라면 동일한 해시코드 반환
	}

	@Override
	public String toString() {
		return "이름 : " + name + "\n나이 : " + age + "\n주민번호 : " + SSN;
	}
}
public class EX01 {

	public static void main(String[] args) {
		
		Person person1 = new Person("홍길동", 20, "123456-7890");
		Person person2 = new Person("홍길동", 20, "123456-7890");
	
		System.out.println(person1.equals(person2));	
		//object의 equals메소드는 데이터가 아니라 객체 비교이다/.. 결과 : false

		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());

		System.out.println(person1.toString());
	}

}
