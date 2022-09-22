package hello;

public class Time1 {
	
	public int hour;  //0-23;
	public int minute; //0-59;
	public int second; //0-59;
	
	public Time1() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	
	public Time1(int h,int minute,int second) {
		if((h < 0) || h >=24) {
			throw new IllegalArgumentException("輸入的 \"小時\" 時間錯誤，超過合理範圍!!");
		}
		if((minute < 0) || minute >=60) {
			throw new IllegalArgumentException("輸入的 \"分鐘\" 時間錯誤，超過合理範圍!!");
		}	
		if((second < 0) || second >=60) {
			throw new IllegalArgumentException("輸入的 \"秒\" 時間錯誤，超過合理範圍!!");
		}	
		hour = h;
		this.minute = minute;
		this.second = second;
	}

	public void setTime(int hour,int minute,int second) {
		if((hour < 0) || hour >=24) {
			throw new IllegalArgumentException("輸入的 \"小時\" 時間錯誤，超過合理範圍!!");
		}
		if((minute < 0) || minute >=60) {
			throw new IllegalArgumentException("輸入的 \"分鐘\" 時間錯誤，超過合理範圍!!");
		}	
		if((second < 0) || second >=60) {
			throw new IllegalArgumentException("輸入的 \"秒\" 時間錯誤，超過合理範圍!!");
		}	
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public String toUniversalString() {
		String outputString;
		                             // 18 :  36  :  40
		outputString = String.format("現在的時間是 >> %02d:%02d:%02d", hour,this.minute,this.second);
		
		return outputString;
	}
	
	public String toString() {
		return String.format("%d:%2d:%2d  %s",((hour == 0 || hour ==12) ? 12 : (hour % 12)), minute , second, ((hour < 12) ? "AM" : "PM") );
	}                      //  6:36:40  PM
	
}
