package io;

import java.io.*;

public class EX08 {

	public static void main(String[] args) throws Exception {

		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir,"aaa.txt");
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.println("안녕하세요");
		pw.println("자바 ");
		pw.println("수업 마지막 날");
		
		
		pw.close();
	
	}

}
