package hello;

public class Java12_4 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		String s1 = new String("I Love Java!");
		
		char c1, c2[], c3[] = new char[8];
		
		c3[0] = 'a';
		c3[1] = 'b';
		
		c1 = s1.charAt(7);
		c2 = s1.toCharArray();
		s1.getChars(7, 11, c3, 3);
		
		System.out.println("s1 = "+s1);
		System.out.println("c1 = "+c1);
		System.out.println("c2 = "+new String(c2));
		System.out.println("c3 = "+new String(c3));			

	}

}
