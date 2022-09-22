package hello;

public class Java10_5 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int i = 24;
		
		System.out.println("i = "+i);
		
		i = i >> 1;
		System.out.println("i 右移1位元 = "+ i);
		
		i = i >> 1;
		System.out.println("i 右移2位元 = "+ i);
		
		i = i >> 1;
		System.out.println("i 右移3位元 = "+ i);

		System.out.println("目前 i 值 = "+i);
		
		i = i << 4;
		System.out.println("i 左移4位元 = "+ i);
	}

}
