package hello;

public class Time2 {
	
	private int hour;  //0-23;
	private int minute; //0-59;
	private int second; //0-59;
	private int millisecond; //0-999;
	
	public Time2() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
		this.millisecond = 0;
	}

	public Time2(int hour) {	

		this(hour,0,0,0);
		
//		if ((hour < 0) || (hour >= 24)) {
//			throw new IllegalArgumentException("輸入的 \"小時\" 時間錯誤，範圍必須在 0-23 之間!");
//		}
//		this.hour = hour;
//		this.minute = 0;
//		this.second = 0;
//		this.millisecond = 0;
	}
	
	public Time2(int hour,int minute) {
		
		this(hour,minute,0,0);
		
//		if((hour < 0) || (hour >= 24)) {
//			throw new IllegalArgumentException("輸入的 \"小時\" 時間錯誤，範圍必須在 0-23 之間!");
//		}
//		if((minute < 0) || (minute >= 60)) {
//			throw new IllegalArgumentException("輸入的 \"分鐘\" 時間錯誤，範圍必須在 0-59 之間!");
//		}
//		this.hour = hour;
//		this.minute = minute;
//		this.second = 0;
//		this.millisecond = 0;
	}
	
	public Time2(int hour,int minute,int second) {

		this(hour,minute,second,0);
		
//		if((hour < 0) || (hour >= 24)) {
//			throw new IllegalArgumentException("輸入的 \"小時\" 時間錯誤，範圍必須在 0-23 之間!");
//		}
//		if((minute < 0) || (minute >= 60)) {
//			throw new IllegalArgumentException("輸入的 \"分鐘\" 時間錯誤，範圍必須在 0-59 之間!");
//		}
//		if((second < 0) || (second >= 60)) {
//			throw new IllegalArgumentException("輸入的 \"秒\" 時間錯誤，範圍必須在 0-59 之間!");
//		}
//		this.hour = hour;
//		this.minute = minute;
//		this.second = second;
//		this.millisecond = 0;
	}
	
	public Time2(int hour,int minute,int second,int millisecond) {
		if((hour < 0) || (hour >= 24)) {
			throw new IllegalArgumentException("輸入的 \"小時\" 時間錯誤，範圍必須在 0-23 之間!");
		}
		if((minute < 0) || (minute >= 60)) {
			throw new IllegalArgumentException("輸入的 \"分鐘\" 時間錯誤，範圍必須在 0-59 之間!");
		}
		if((second < 0) || (second >= 60)) {
			throw new IllegalArgumentException("輸入的 \"秒\" 時間錯誤，範圍必須在 0-59 之間!");
		}
		if((millisecond < 0) || (millisecond >= 1000)) {
			throw new IllegalArgumentException("輸入的 \"豪秒\" 時間錯誤，範圍必須在 0-999 之間!");
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.millisecond = millisecond;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if((minute < 0) || minute >=60) {
			throw new IllegalArgumentException("輸入的 \"分鐘\" 時間錯誤，超過合理範圍!!");
		}	
		this.minute = minute;
	}

	public int getH() {
		return this.hour;
	}
	
	public void setH(int hour) {
		if ((hour < 0) || (hour >= 24)) {
			throw new IllegalArgumentException("輸入的 \"小時\" 時間錯誤，範圍必須在 0-23 之間!");
		}
		this.hour = hour;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if((second < 0) || second >=60) {
			throw new IllegalArgumentException("輸入的 \"秒\" 時間錯誤，超過合理範圍!!");
		}
		this.second = second;
	}

	public int getMillisecond() {
		return millisecond;
	}

	public void setMillisecond(int millisecond) {
		if((millisecond < 0) || millisecond >= 1000) {
			throw new IllegalArgumentException("輸入的 \"豪秒\" 時間錯誤，超過合理範圍!!");
		}	
		this.millisecond = millisecond;
	}
	
	public void setTime(int hour,int minute,int second,int millisecond) {
		if((hour < 0) || hour >=24) {
			throw new IllegalArgumentException("輸入的 \"小時\" 時間錯誤，超過合理範圍!!");
		}
		if((minute < 0) || minute >=60) {
			throw new IllegalArgumentException("輸入的 \"分鐘\" 時間錯誤，超過合理範圍!!");
		}	
		if((second < 0) || second >=60) {
			throw new IllegalArgumentException("輸入的 \"秒\" 時間錯誤，超過合理範圍!!");
		}
		if((millisecond < 0) || millisecond >= 1000) {
			throw new IllegalArgumentException("輸入的 \"豪秒\" 時間錯誤，超過合理範圍!!");
		}	
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.millisecond = millisecond;
	}
	
	public String toUniversalString() {
		return String.format("現在的時間是 >> %02d:%02d:%02d.%03d", hour,this.getMinute(),this.second,this.millisecond);
	}
	
	public String toString() {
		return String.format("%d:%2d:%2d.%3d  %s",((hour == 0 || hour ==12) ? 12 : (hour % 12)), minute , second, millisecond, ((hour < 12) ? "AM" : "PM") );
	}    
}
