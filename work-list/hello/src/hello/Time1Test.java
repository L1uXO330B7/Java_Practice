package hello;

public class Time1Test {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		
		Time1 t = new Time1(18,36,27);
		
		System.out.println("已建立新的 Time1 物件 t，時間內容 : " + t.toUniversalString());
		
		t.setTime(5, 25, 56);
		System.out.println("修改 Time1 物件時間，目前24小時制時間 : " + t.toUniversalString());
		System.out.println("修改 Time1 物件時間，目前12小時制時間 : " + t.toString());
		
		try {

		    t.setTime(69, 15, 30);
		    System.out.println("修改 Time1 物件時間，目前內容 : " + t.toUniversalString());
		} catch (IllegalArgumentException ex) {
			System.out.println("企圖修改 Time1 物件時間，發生例外狀況 : " + t.toUniversalString());
			
		}
		
		Time1 t1 = new Time1();
		
		System.out.println("已建立新的 Time1 物件 t1，時間內容 : " + t1.toUniversalString());
		
		t1.setTime(15, 21, 05);
		System.out.println("修改 Time1 物件時間，目前24小時制時間 : " + t1.toUniversalString());
		System.out.println("修改 Time1 物件時間，目前12小時制時間 : " + t1.toString());
	
		
		Time1 t2 = new Time1();
		System.out.println("已建立新的 Time1 物件 t2，時間內容 : " + t2.toUniversalString());
		t2.hour = 12;
		int hour =  t2.hour;
		t2.minute = 35;
		t2.second = 50;
		System.out.println("修改 Time1 物件 t2 時間，目前24小時制時間 : " + t2.toUniversalString());
		
		System.out.println("\n ========================================= \n");
		
		Time2 T1 = new Time2(2);
		Time2 T2 = new Time2(2,41);
		Time2 T3 = new Time2(2,41,38);
		Time2 T4 = new Time2(2,41,38,596);
		
		System.out.println("已建立新的 Time2 物件 T1，時間內容 : " + T1.toUniversalString());
		System.out.println("已建立新的 Time2 物件 T2，時間內容 : " + T2.toUniversalString());
		System.out.println("已建立新的 Time2 物件 T3，時間內容 : " + T3.toUniversalString());
		System.out.println("已建立新的 Time2 物件 T4，時間內容 : " + T4.toUniversalString());
		
		T1.setTime(12, 0, 0, 0);
		T2.setTime(12, 31, 0, 0);
		T3.setTime(12, 31, 28, 0);
		T4.setTime(12, 31, 28, 469);
		System.out.println("修改 Time2 物件時間，目前12小時制時間 : " + T1.toString());
		System.out.println("修改 Time2 物件時間，目前12小時制時間 : " + T2.toString());
		System.out.println("修改 Time2 物件時間，目前12小時制時間 : " + T3.toString());
		System.out.println("修改 Time2 物件時間，目前12小時制時間 : " + T4.toString());
		
		int Hour = T1.getH();
		System.out.println("T1 的 hour 屬性值 = "+ Hour);
		T1.setH(13);
		System.out.println("T1 的 hour 屬性值 = "+ T1.getH());
		
		try {
		    T4.setTime(69, 15, 30,956);
		    System.out.println("修改 Time2 物件 T4 時間，目前內容 : " + T4.toUniversalString());
		} catch (IllegalArgumentException ex) {
			System.out.println("企圖修改 Time2 物件 T4 時間，發生例外狀況 : " + T4.toUniversalString());
			
		}
		
	}

}
