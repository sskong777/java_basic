package singleton;

public class SingletonMain {

	public static void main(String[] args) {

		//Singleton singleton = new Singleton();
		//객체생성이 안됨.	//생성자를 private으로 해놔서
		
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		
		if(sing1 == sing2) {
			System.out.println("같은 객체 입니다.");
		}else {
			System.out.println("다른 객체 입니다.");
		}
	}

}

