package io;

import java.io.*;

class SungJuk implements Serializable{
	
	String name = "홍길동";
	transient int java = 100;
	
	//Object를 파일로 직접 저장할 때 직렬화기능을 이용하는데
	// 변수를 사용할때 transient로 지정하게 되면 해당변수는 직렬화하지 않는다.
}
public class EX10 {

	public static void main(String[] args) throws Exception {

		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir,"aaa.txt");
		
		FileOutputStream fos =  new FileOutputStream(file);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		SungJuk sj =  new SungJuk();
		
		oos.writeObject(sj);
		
		
		oos.close();
		bos.close();
		fos.close();

	}

}
