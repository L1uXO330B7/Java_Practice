package hello;

public class Java10_7 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		char ch = 'A';
		short s = -5;
		int i = 6;
		float f = 10.5f;
		double d = 100.25;
		
		System.out.println("(s * ch) = "+(s*ch));
		System.out.println("(d/f) = "+(d/f));
		System.out.println("(i+f) = "+(i+f));

		System.out.println("(s*ch) + (d/f) * (i+f) =" + ((s * ch)+(d / f)*(i+f)));
		System.out.println("s*ch + d/f * i+f = " + (s*ch + d/f * i+f));
	}

}
