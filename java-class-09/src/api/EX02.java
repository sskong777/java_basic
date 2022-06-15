package api;
//Member클래스를 만든다
//필드는 String name; int age; Stirng number; 이다
//생성자의 매개값을 받아서 필드초기화를 시켜준다
//equals() hashCode() toString() 메소드를 재정의 해보자

class Member{
	private String name;
	private int age;
	private String number;

	public Member(String name, int age, String number) {
		this.name = name;
		this.age = age;
		this.number = number;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			boolean bool  = this.name.equals(member.name)
					&& this.age == member.age
					&& this.number == member.number;
			return bool;
		}else {
			return super.equals(obj);
		}
	}	
	@Override
	public int hashCode() {
		return (name + age + number).hashCode();
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "\n나이 : " + age + "\n전화번호 : " + number;
	}
}
public class EX02 {
	
	public static void main(String[] args) {
		Member member1 = new Member("석현",26,"010-2355-6997");
		Member member2 = new Member("석현",26,"010-8255-6997");
		Member member3 = new Member("석현",26,"010-2355-6997");

		System.out.println(member1.equals(member2));
		System.out.println(member1.equals(member3));
		
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode());
		System.out.println(member3.hashCode());
		
		
		System.out.println(member1.toString());
		System.out.println(member2.toString());
		System.out.println(member3.toString());
			
		
	}

}
