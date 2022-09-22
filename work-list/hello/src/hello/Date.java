package hello;

import java.time.LocalDate;

public class Date {
	private int year;  // > 0 ,< now 
	private int month; //  1 - 12
	private int day;   //  1- 31;
	
	private static final int[] daysPerMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	public Date(int day) {
		this(2010,1,day);
	}
	
	public Date(int month,int day) {
		this(2010,month,day);
	}
	
	public Date(int year,int month,int day) {
		if ((year <= 0) || (year > LocalDate.now().getYear())) {
			throw new IllegalArgumentException("年份錯誤 ("+ year +") ，必須大於0、小於今年!!");
		}
		
		if ((month <=0) || (month >12)) {
			throw new IllegalArgumentException("月份錯誤 ("+ month +") ，必須在 1 - 12 之間!!");
		}
		
		if ((day <= 0) || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
			throw new IllegalArgumentException("日期錯誤 ("+ day +") ，該日期不符合指定月份的正常範圍!!");
		}
		
		if((month == 2 && day ==29) && !(((year % 400) == 0) || (((year % 4) == 0) && ((year % 100) != 0)))) {
			throw  new IllegalArgumentException("日期錯誤 ("+ day +") ，該日期不符合閏年二月份的正常範圍!!");		
		}
		
		this.year = year;
		this.month = month;
		this.day = day;
	}

	
	public int getYear() {
		return year;
	}

	
    public void setYear(int year) {
		if ((year <= 0) || (year > LocalDate.now().getYear())) {
			throw new IllegalArgumentException("年份錯誤 ("+ year +") ，必須大於0、小於今年!!");
		}
		this.year = year;
	}

	
    public int getMonth() {
		return month;
	}

	
    public void setMonth(int month) {
		if ((month <=0) || (month >12)) {
			throw new IllegalArgumentException("月份錯誤 ("+ month +") ，必須在 1 - 12 之間!!");
		}
		this.month = month;
	}

	
    public int getDay() {
		return day;
	}

	
    public void setDay(int day) {
		if ((day <= 0) || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
			throw new IllegalArgumentException("日期錯誤 ("+ day +") ，該日期不符合指定月份的正常範圍!!");
		}
		
		if((month == 2 && day ==29) && !(((year % 400) == 0) || (((year % 4) == 0) && ((year % 100) != 0)))) {
			throw  new IllegalArgumentException("日期錯誤 ("+ day +") ，該日期不符合閏年二月份的正常範圍!!");		
		}
		
		this.day = day;
	}
	
	public String toString() {
		return String.format("%d/%d/%d", year,month,day);
	}

}
