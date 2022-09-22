package hello;

import java.io.*;

public class Java08_3 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		String strLine;
		
		System.out.print("請輸入字串 : ");
		
		try {
			
			InputStreamReader iStreamReader = new InputStreamReader(System.in);
			
			BufferedReader bufferReader = new BufferedReader(iStreamReader);
			
			while((strLine = bufferReader.readLine()) != null ) {
				System.out.println(strLine);
			}
			
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		
		
	}

}
