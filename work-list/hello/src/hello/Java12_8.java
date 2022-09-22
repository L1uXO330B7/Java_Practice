package hello;

public class Java12_8 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		StringBuffer s1 = new StringBuffer("我愛學習 ");
		
		System.out.println("s1 = \"" + s1 +"\"，其長度為 "+s1.length());
		
		s1.append("程式設計");
		
		System.out.println("s1 = \"" + s1 +"\"，其長度為 "+s1.length());
		
		s1.insert(4, " Java");
	
		System.out.println("s1 = \"" + s1 +"\"，其長度為 "+s1.length());
		
		StringBuffer S1 = new StringBuffer("我愛學習 java 程式設計!!");
		
		System.out.println("S1 = \"" + S1 +"\"，其長度為 "+S1.length());
		
		S1.replace(5,9,"C#");
		
		System.out.println("S1 = \"" + S1 +"\"，其長度為 "+S1.length());
		
		S1.delete(4, 8);
		
		System.out.println("S1 = \"" + S1 +"\"，其長度為 "+S1.length());
	}

}
