package hello;

public class Java12_7 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		
		String s1 = new String("我愛學習 Java 程式設計，你呢? 你愛嗎?");
		String s2 = s1.replace('a', 'A');
		String s3 = new String();
		
		int i = s1.indexOf("?");
		int j = s1.indexOf("java");
		int k = s1.lastIndexOf("Java");
		int l = s1.indexOf("愛");
		int m = s1.lastIndexOf("愛");
		
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		System.out.println("k = "+k);
		System.out.println("l = "+l);
		System.out.println("m = "+m);
		
		s3 = s1.replace("Java", "java");
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		System.out.println("s3 = "+s3);		

		String s4 = s1.toUpperCase();
		
		System.out.println("s4 = "+s4);
		System.out.println("s4 字串內容轉換成小寫 = "+ s4.toLowerCase());
		
	}

}
