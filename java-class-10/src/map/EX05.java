package map;

import java.util.*;

//Food 클래스를 만들고
//필드는 private String food;이다
//생서자를 통해 초기화를 하고 필드를 리턴하는 get메소드를 만든다
//Object클래스의 eqauls hashCode메소드를
//오버라이딩하여 재정의하자 

class Food{
	
	private String food;

	public Food(String food) {
		this.food = food;
	}

	public String getFood() {
		return food;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Food) {
			Food f = (Food)obj;
			return this.food.equals(f.food);
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return food.hashCode();
	}
}

public class EX05 {

	public static void main(String[] args) {

		Map<Food,Integer> map = new HashMap<>();
		map.put(new Food("치킨"),4);
		map.put(new Food("김밥"),20);
		map.put(new Food("삼겹살"),2);
		map.put(new Food("돈까스"),10);
		map.put(new Food("초밥"),3);
		map.put(new Food("치킨"),7);

	
		Set<Food> keySet = map.keySet();
		Iterator<Food> keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			Food food = keyIter.next();
			int number = map.get(food);
			
			System.out.println("내가 한달에 먹는 음식 >> " + food.getFood()
														+ " : " + number + "번");
			
		}
	}

}
