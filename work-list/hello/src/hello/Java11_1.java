package hello;

public class Java11_1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		int x = 18, y = 27, z = 60;
		
		System.out.println("x = "+ x + ",y = "+ y + ",z = "+ z);
		
		if ( x >= y) {
			if( y >= z) {
				System.out.println("x >= y >= z");
			} else {
				if ( x >=z ) {
					System.out.println("x >= z >= y");
				} else {
					System.out.println("z >= x >= y");
				}
			}
		} else {
			if (z >= y) {
				System.out.println("z >= y >= x");
			} else {
				if (z >= x) {
					System.out.println("y >= z >= x");
				} else {
					System.out.println("y >= x >= z");
				}
			}
		}
	}

}
