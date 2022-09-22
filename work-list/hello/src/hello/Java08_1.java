package hello;

import java.io.*;

public class Java08_1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		char c;
		
		try {
			
			System.out.print("請輸入字串:");
			
			while ((c = (char)System.in.read()) > 0) {
			
			   System.out.print(c);
			
			   if (c == '\n') {
				   System.out.println("\r\n以上為你輸入的字串");
			   }
				   			
			}
					
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}

}
