package hello;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入 1 - 9 之間的整數 >>");
		n = sc.nextInt();
		if(n<1||n>9) {
			System.out.println(n+"不在1 - 9 之間");
		}
		else {
			  int j = 1;
			 for(int k = 1; k <= n/3+1; k++){
				  int temp =3;
				  if(k+1>n/3+1){
					  temp = n%3;
				  }
			  System.out.println("====================================");
			  for(int m = 1; m <= 9; m++){
			   for(int a = j; a < j+temp; a++){
			    System.out.print(a+"x"+m+"="+a*m+"\t");
			   }
			   System.out.print("|");
			   System.out.println();
			  }
				  j = j + 3;
			 }
			 System.out.println("=====================================");
			 }
			 sc.close(); 
		}
	}

