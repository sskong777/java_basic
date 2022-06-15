package wrapper;

public class EX02 {

	public static void main(String[] args) {

		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(100);

		// 포장객체 비교
		System.out.println(obj1 == obj2);	//결과 false
		
		System.out.println(obj1.equals(obj2));	//결과 True
		// equals() 메소드 object 클래스의 메소드이다/
		// wrapper 클래스는 Object의 equals 메소드를 재정의해서 안에 있는 값을 비교한다.
		
	}

}
