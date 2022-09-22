package hello;

public class Java12_1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		int i,j;
		
		int arrayInt[][] = {
				           {12, 1, 15, 38, 43, 21, 9 },
				           {2, 13, 17, 21, 33, 5, 18 },
				           {31, 40, 13, 11, 8, 27, 15 },
				           {41, 48, 30, 10, 20, 33, 23 },
				           {13, 14, 25, 22, 35, 33, 7 },
		                   }; 
		
		System.out.println("5 組陣列的內容分別為 : ");
		
		for(i = 0 ; i <arrayInt.length;i++) {
			System.out.println("第 "+ (i+1) +"組 :");
			for(j = 0;j<arrayInt[i].length;j++) {
				System.out.print(arrayInt[i][j] + ", ");
			}
			System.out.print("\n");
		}
		
		System.out.println("陣列 arrayInt 第一維的元素個數 : "+arrayInt.length);
		
		
		int arrayInt_1[][] = new int[5][7];
		
		arrayInt_1[0][0] = 12;
		arrayInt_1[0][1] = 1;
		arrayInt_1[0][2] = 15;
		arrayInt_1[0][3] = 38;
		arrayInt_1[0][4] = 43;
		arrayInt_1[0][5] = 21;
		arrayInt_1[0][6] = 9;
		
		arrayInt_1[1][0] = 2;
		arrayInt_1[1][1] = 13;
		arrayInt_1[1][2] = 17;
		arrayInt_1[1][3] = 21;
		arrayInt_1[1][4] = 33;
		arrayInt_1[1][5] = 5;
		arrayInt_1[1][6] = 18;
		
		arrayInt_1[2][0] = 31;
		arrayInt_1[2][1] = 40;
		arrayInt_1[2][2] = 13;
		arrayInt_1[2][3] = 11;
		arrayInt_1[2][4] = 8;
		arrayInt_1[2][5] = 27;
		arrayInt_1[2][6] = 15;
		
		arrayInt_1[3][0] = 41;
		arrayInt_1[3][1] = 48;
		arrayInt_1[3][2] = 30;
		arrayInt_1[3][3] = 10;
		arrayInt_1[3][4] = 20;
		arrayInt_1[3][5] = 33;
		arrayInt_1[3][6] = 23;
		
		arrayInt_1[4][0] = 13;
		arrayInt_1[4][1] = 14;
		arrayInt_1[4][2] = 25;
		arrayInt_1[4][3] = 22;
		arrayInt_1[4][4] = 35;
		arrayInt_1[4][5] = 33;
		arrayInt_1[4][6] = 7;
		
		System.out.println("\n\narrayInt_1 ， 5 組陣列的內容分別為 : ");
		
		for(i = 0 ; i <arrayInt_1.length;i++) {
			System.out.println("第 "+ (i+1) +"組 :");
			for(j = 0;j<arrayInt_1[i].length;j++) {
				System.out.print(arrayInt_1[i][j] + ", ");
			}
			System.out.print("\n");
		}
		
		System.out.println("陣列 arrayInt_1 第一維的元素個數 : "+arrayInt_1.length);		
			
	}

}
