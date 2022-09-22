package hello;

import java.util.Date;

public class Time2Test {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		Time2 T1 = new Time2(2);
		Time2 T2 = new Time2(2,41);
		
		System.out.println("已建立新的 Time2 物件 T1，時間內容 : " + T1.toUniversalString());
		System.out.println("已建立新的 Time2 物件 T2，時間內容 : " + T2.toUniversalString());

		T1.setTime(12, 0, 0, 0);
		T2.setTime(12, 31, 0, 0);

		System.out.println("修改 Time2 物件時間，目前12小時制時間 : " + T1.toString());
		System.out.println("修改 Time2 物件時間，目前12小時制時間 : " + T2.toString());
		
		T1.setH(9);
		T1.setMinute(35);
		T1.setSecond(24);
		T1.setMillisecond(640);
		System.out.println("呼叫修改方法 設定Time2 物件 T1，時間內容 : " + T1.toUniversalString());
		
		try {
			T1.setTime(14, 86, 45, 330);
			System.out.println("呼叫setTime 方法 設定Time2 物件 T1，時間內容 : " + T1.toUniversalString());
		} catch (IllegalArgumentException ex) {
			System.out.println("設定Time2 物件 T1時間，發生錯誤，錯誤訊息 : "+ ex.getMessage());
		}
		
		Date d1 = new Date(2022,7,15);
		System.out.println(d1.toString());

	}

}
