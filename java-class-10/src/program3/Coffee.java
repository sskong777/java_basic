package program3;

public class Coffee {

	private String coffeeName;
	
	public Coffee(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	//get set 메소드
	//equals , hashCode 오버라이딩해서 재정의
	public String getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Coffee) {
			Coffee coffee = (Coffee)obj;
			return this.coffeeName.equals(coffee.coffeeName);
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return (coffeeName).hashCode();
	}
}
