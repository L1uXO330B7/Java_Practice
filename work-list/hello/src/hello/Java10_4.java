package hello;

import java.util.Scanner;

public class Java10_4 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		int i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入 0 - 100 之間的整數 >>");
		i = sc.nextInt();
		
		if ( (i < 0) || (i > 100)) {
			System.out.println("輸入範圍錯誤!!  請輸入 0 - 100 之間的整數。");
		} else {
			if ( (i >= 0) && (i <= 40) ) {
				System.out.println("i = " + i + ",A組 位於 0 - 40 之間");
			} else if ( (i >= 41) && (i <= 80) ) {
				System.out.println("i = " + i + ",B組 位於 41 - 80 之間");
			} else {
				System.out.println("i = " + i + ",C組 位於 81 - 100 之間");
			}
		}
		
		sc.close();
	}

}
