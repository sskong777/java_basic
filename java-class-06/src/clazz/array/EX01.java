package clazz.array;


class Book {
	
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void disp() {
		System.out.println(title + " : " + author);
	}
	
}
public class EX01 {

	public static void main(String[] args) {
		
		Book[] book = new Book[5];		//클래스 배열 5개 생성
		
		book[0] = new Book("java","홍길동");
		//객체를 생성해서 배열의 각 요소에 저장
		book[1] = new Book("jsp","홍석현");
		book[2] = new Book("database","홍민지");
		book[3] = new Book("javascript","홍은지");
		book[4] = new Book("Django","김준식");
	
		for(int i = 0; i < book.length; i++) {
			
			book[i].disp();
			System.out.println();
			
		}
	}

}
