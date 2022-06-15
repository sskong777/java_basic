package io;

import java.io.*;

public class EX11 {

	public static void main(String[] args) throws Exception {

		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir,"aaa.txt");
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		SungJuk sj = (SungJuk)ois.readObject();
		//캐스팅 해줘야함
		
		System.out.println("이름 : " + sj.name);
		System.out.println("자바 점수 : "  + sj.java);
		
		ois.close();
		bis.close();
		fis.close();
		
		
	}

}
