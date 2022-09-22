package hello;

import java.util.Scanner;

public class Java09 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("請輸入一串文字 >>");
		str = sc.nextLine();
		System.out.println("輸入的是 : "+str);
		
		sc.close();
	}

}
