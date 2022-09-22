package hello;

public class Java12_9 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		int a[] = {4,9,16,25,36,49,64,81};
		int b = 49;
		
		print(a);
		sqrt(a);
		print(a);
		
		System.out.println("參數b的內容為 :" + b);
		b = sqrt(b);
		System.out.println("參數b的內容為 :" + b);
	}

	public static void print(int x[]) {
		int i;

		System.out.println("陣列的內容為 :");
		for(i=0;i<x.length;i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}
	
	public static void sqrt(int x[]) {
		int i;
		for(i=0;i<x.length;i++) {
			if(i==0) {
				System.out.println("sqrt函數內部，陣列的內容為:");
			}
			x[i]=(int)Math.sqrt((double)x[i]);
			System.out.print("x["+i+"] = "+x[i]+", ");
		}
		System.out.println();
	}
	
	public static int sqrt(int x) {
		x=(int)Math.sqrt((double)x);
		System.out.println("sqrt函數內部， x = "+x);
		
		return x;
	}

}
