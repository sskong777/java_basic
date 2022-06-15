package program3;

public class Client {
	
	//싱글톤
	private static Client client = new Client();
	
	private int money;
	
	private Client() {}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void addMoney(int money) {
		this.money += money;
	}
	
	//싱글톤 호출 메소드
	public static Client getInstance() {
		return client;
	}

	
	
}
