package hello;

public class Java12_2 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int i,j,k;
		
		int arrayInt[][][] = {
				               {
				            	 {11, 12, 13, 14},
				            	 {21, 22, 23, 24},
				            	 {31, 32, 33, 34}
				               },
				               {
				            	 {41, 42, 43, 44},
				            	 {51, 52, 53, 54},
				            	 {61, 62, 63, 64}
				               }
		                     };

		System.out.println("三維 2x3x4 陣列的內容為 : ");
		
		for(i = 0;i<arrayInt.length; i++) {
			System.out.println("第 "+(i+1)+ " 組 : ");
			for(j = 0;j<arrayInt[i].length; j++) {
				System.out.println("第 "+(j+1)+" 列 : ");
				for(k = 0;k<arrayInt[i][j].length; k++) {
					System.out.print(arrayInt[i][j][k] + ", ");
				}
				System.out.print("\n");
			}
		}
		
		System.out.println("陣列 arrayInt 第一維的元素個數 : "+arrayInt.length);
		System.out.println("陣列 arrayInt 第二維的元素個數 : "+arrayInt[0].length);
		System.out.println("陣列 arrayInt 第三維的元素個數 : "+arrayInt[0][0].length);
		
		int arrayInt_1[][][]  = new int[2][3][4];
		
		arrayInt_1[0][0][0] = 11;
		arrayInt_1[0][0][1] = 12;
		arrayInt_1[0][0][2] = 13;
		arrayInt_1[0][0][3] = 14;
		
		arrayInt_1[0][1][0] = 21;
		arrayInt_1[0][1][1] = 22;
		arrayInt_1[0][1][2] = 23;
		arrayInt_1[0][1][3] = 24;
		
		arrayInt_1[0][2][0] = 31;
		arrayInt_1[0][2][1] = 32;
		arrayInt_1[0][2][2] = 33;
		arrayInt_1[0][2][3] = 34;
		
		
		arrayInt_1[1][0][0] = 41;
		arrayInt_1[1][0][1] = 42;
		arrayInt_1[1][0][2] = 43;
		arrayInt_1[1][0][3] = 44;
		
		arrayInt_1[1][1][0] = 51;
		arrayInt_1[1][1][1] = 52;
		arrayInt_1[1][1][2] = 53;
		arrayInt_1[1][1][3] = 54;
		
		arrayInt_1[1][2][0] = 61;
		arrayInt_1[1][2][1] = 62;
		arrayInt_1[1][2][2] = 63;
		arrayInt_1[1][2][3] = 64;
		
		
		System.out.println("\n\n\narrayInt_1 ， 三維 2x3x4 陣列的內容為 : ");
		
		for(i = 0;i<arrayInt_1.length; i++) {
			System.out.println("第 "+(i+1)+ " 組 : ");
			for(j = 0;j<arrayInt_1[i].length; j++) {
				System.out.println("第 "+(j+1)+" 列 : ");
				for(k = 0;k<arrayInt_1[i][j].length; k++) {
					System.out.print(arrayInt_1[i][j][k] + ", ");
				}
				System.out.print("\n");
			}
		}
		
		System.out.println("陣列 arrayInt 第一維的元素個數 : "+arrayInt_1.length);
		System.out.println("陣列 arrayInt 第二維的元素個數 : "+arrayInt_1[0].length);
		System.out.println("陣列 arrayInt 第三維的元素個數 : "+arrayInt_1[0][0].length);
	}

}
