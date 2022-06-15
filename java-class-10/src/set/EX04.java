package set;

import java.util.*;

class Person {
	
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age  = age;
	}

	//equlas()와 hashCode() 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person person = (Person)obj;
			boolean bool = this.name.equals(person.name)
					&& this.age == person.age;
			return bool;
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return (name+age).hashCode();
	}
}
public class EX04 {

	public static void main(String[] args) {

		Set<Person> set = new HashSet<>();
	
		set.add(new Person("홍길동", 20));
		set.add(new Person("성춘향", 21));
		set.add(new Person("장보고", 22));
		set.add(new Person("이순신", 23));
		set.add(new Person("홍길동", 20));	//중복 허용 안됨.
		
		System.out.println("Set 크기 : " + set.size()); //설정 전 5개	//설정 후 : 4개
		
		Iterator<Person> setIter = set.iterator();
		
		while(setIter.hasNext()) {
			Person person = setIter.next();
			System.out.println(person.name + " : " + person.age);
		}
	
	}

}
