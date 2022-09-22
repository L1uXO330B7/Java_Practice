package hello;

public class Java12_6 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		String s1 = new String("I Love to learning Java!!");
		String s2 = s1.substring(7,18);
		String s3 = "我愛學習JAVA程式設計";
		String s4 = s3.substring(3,9);
		
		System.out.println("s2 = "+ s2);
		System.out.println("s4 = "+ s4);
		
		s1 = new String("我正在學習 ");
		s2 = new String("c# ");
		s3 = s1 + s2 + "程式設計 !!";
		
		s4 = s1.concat(s2).concat("，").concat("學了很久，");
		s4 = s4.concat("都學不會.....");
		
		System.out.println("s3 = "+ s3);
		System.out.println("s4 = "+ s4);
				
	}

}
