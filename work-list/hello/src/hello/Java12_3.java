package hello;

public class Java12_3 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		
		int b[][] = { {1, 2, 3},{3, 2, 1} };
		int c[][] = { {1, 2}, {2, 3}, {3, 5} };
		
		int i,j,k;
		int x = b.length , y =b[1].length ,z = c[1].length;
		int a[][] = new int[x][z];
		
		for(i = 0; i < x; i++)
			for(j = 0;j < z; j++)
				for(k = 0;k < y;k++) {
					a[i][j] = a[i][j] + (b[i][k] * c[k][j]);
				}
					
		System.out.println("結果矩陣 a : ");
		
		for(i = 0;i < a.length; i++) {
			System.out.print(" ");
			for(j = 0;j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();	
		}

	}

}
