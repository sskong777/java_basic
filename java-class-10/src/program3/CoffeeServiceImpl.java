package program3;

import java.util.*;

public class CoffeeServiceImpl implements CoffeeService {
	//필드
	HashMap<Coffee, Integer> map;
	Set<Client> set;
	Scanner scan;
	
	//생성자
	public CoffeeServiceImpl() {
		map = new HashMap<Coffee,Integer>();
		scan = new Scanner(System.in);
		set = new HashSet<Client>();
		
		//기본 메뉴 생성
		map.put(new Coffee("아메리카노"), 2000);
		map.put(new Coffee("카페라떼"), 3000);
	}
	
	@Override
	public void viewAll() {
		//커피메뉴 출력
		Set<Coffee> keySet = map.keySet();
		Iterator<Coffee> keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			Coffee key = keyIter.next();
			String coffeeName = key.getCoffeeName();
			
			int price = map.get(key);
			System.out.println(coffeeName + " : " + price);
		}
	}

	
//Coffee(사장님)
	@Override
	public void menuRegister() {
		//메뉴이름과 메뉴가격을 입력받아 메뉴 등록
		System.out.print("메뉴 이름 : ");
		String menuName = scan.next();
		System.out.print("메뉴 가격 : ");
		int menuMoney = scan.nextInt();
		
		map.put(new Coffee(menuName), menuMoney);
		// OR
		Coffee coffee = new Coffee(menuName);
		map.put(coffee, menuMoney);
	}

	@Override
	public void menuEdit() {
		//메뉴이름을 입력받아 가격수정
		System.out.print("수정할 메뉴 이름 : ");
		String menuName = scan.next();

		
		Set<Coffee> keyset = map.keySet();
		Iterator<Coffee> keyIter = keyset.iterator();
		
		while(keyIter.hasNext()) {
			
			Coffee key = keyIter.next();
			
			if(key.getCoffeeName().equals(menuName)) {
				System.out.print("수정할 메뉴 가격 : ");
				int menuMoney = scan.nextInt();
				
				map.put(new Coffee(menuName), menuMoney);
				return;
			}
			System.out.println("기존에 없던 메뉴입니다");
		}
	}

	@Override
	public void menuDelete() {
		//메뉴이름을 입력받아 메뉴삭제
		System.out.print("삭제할 메뉴 이름 : ");
		String menuName = scan.next();

		Set<Coffee> keyset = map.keySet();
		Iterator<Coffee> keyIter = keyset.iterator();
		
		while(keyIter.hasNext()) {
			Coffee key = keyIter.next();
			
			if(key.getCoffeeName().equals(menuName)) {
				map.remove(key);
				System.out.println(menuName + "메뉴를 삭제하였습니다");
				return;
			}
		}
		System.out.println(menuName + "는 메뉴에 없습니다");
	}

	
//Client(고객)
	@Override
	public void chargeMoney() {
		//금액을 입력받아 충전금 충전
		Client client = Client.getInstance();	//싱글톤 객체 (하나만 생성 가능)
		System.out.print("충전할 금액을 입력 : ");
		int money = scan.nextInt();
		client.addMoney(money);			//	필드선언시 : Set<Client> set;
		set.add(client);		
	}

	@Override
	public void order() {		//******어려움*********
		
		//메뉴이름을 입력받아 메뉴주문 (내 충전금에서 메뉴 가격만큼 차감)
		System.out.print("주문할 메뉴 이름 : ");
		String menuName = scan.next();
		
		Set<Coffee> keySet = map.keySet();
		Iterator<Coffee> keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			
			Coffee key = keyIter.next();
		
			if(key.getCoffeeName().equals(menuName)) {
				
				int price = map.get(key);		
				Iterator<Client> setIter = set.iterator();
				
				while(setIter.hasNext()) {
					Client client = setIter.next();
					int clientMoney = client.getMoney();
					
					if(clientMoney >= price) {
						System.out.println(menuName + "주문이 들어갔습니다");
						client.setMoney(clientMoney - price);
						System.out.println("음료나왔습니다 맛있게드세요");
						System.out.println("남은 금액은 :  " + (clientMoney - price) );
						return;
					}else {
						System.out.println("금액이 부족합니다");
						System.out.println("충전금 충전해주세여");
						return;
					}
					
				}
						System.out.println("충전금이 없습니다");
						System.out.println("충전해주세요");
						return;
			}
		
		}
		System.out.println(menuName + "은(는) 메뉴에 없습니다");
			
	}

	@Override
	public void showMoney() {
		//충전금 잔액 보기
		Iterator<Client> setIter = set.iterator();
		
		while(setIter.hasNext()) {
			Client client = setIter.next();
			int money = client.getMoney();
			System.out.println("현재 충전 잔액은 :  " + money + "원 입니다");
			return;
		}
		System.out.println("충전금이 없습니다");
		System.out.println("충전을 해주세요");
	}
	

	
}
