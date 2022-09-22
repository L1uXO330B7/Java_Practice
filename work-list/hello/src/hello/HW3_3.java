package hello;

import java.util.Scanner;

public class HW3_3 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入大於 0 的整數: ");
		n = sc.nextInt();
		if(n==1) {
			  System.out.println(" 1 不是質數");
		}
		else {
			int i=1;
			int d=2;
			int count=0;
			System.out.print("小於等於"+n+"的質數為:");
			while(i<=n){
				d=2;
				while(d<i) {
					if(i%d==0) {
						break;
					}
					d++;
				}
				if(d>=i&&i!=1) {
					System.out.print(i+",");
					count++;
				}
				i++;
			}
			System.out.print("共計"+count+"質數");
		}
		
			 sc.close(); 
		}

}
