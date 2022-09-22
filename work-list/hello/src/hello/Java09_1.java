package hello;

import java.util.Scanner;

public class Java09_1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		String str;
		int i ;
		double d;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("請輸入一串文字  >> ");
		str = sc.nextLine();
		
		System.out.print("請輸入整數  >> ");
		i = sc.nextInt();
		
		System.out.print("請輸入浮點數  >> ");
		d = sc.nextDouble();
		
		System.out.println("你輸入的文字是 : "+str);
		System.out.println("你輸入的整數是 : "+i);
		System.out.println("你輸入的浮點數是 : "+d);
		
        sc.close();
	}

}
