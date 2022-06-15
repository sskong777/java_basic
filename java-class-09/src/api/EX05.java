package api;

public class EX05 {

	public static void main(String[] args) {

		int a = Math.abs(-10);
		//abs()메소드는 인자로 넘긴 데이터의 "절대값" 을 반환
		System.out.println(a);
		
		int b = Math.max(1, 9);
		// max() 메소드는 전달된 데이터 중 더 큰 수를 반환
		System.out.println(b);
		
		int c = Math.min(1, 9);
		System.out.println(c);
		//min()메소드는 전달된 데이터 중 더 작은 수를 반환
		
		double d = Math.random();
		//0.0부터 1.0.미만의 임의의 실수 하나를 반환
		System.out.println(d);
		
		double e  = Math.ceil(1.1);
		//전달된 데이터를 올림하여 반환
		System.out.println(e);
		
		double f = Math.floor(1.9);
		System.out.println(f);
		
		long g = Math.round(5.3);
		long h = Math.round(5.7);
		//전달된 데이터를 반올림하여 반환
		
		System.out.println(g);
		System.out.println(h);
		
	}
	

}
