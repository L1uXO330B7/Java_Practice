package HW5;

import java.text.MessageFormat;


public class HourlyEmployee extends Employee {
	private int wage;
	private int hours;
	
	@Override
	public double getPaymentAmount() {
		// TODO 自動產生的方法 Stub
		if (getHours() <= 40) {
			return (int) (getWage() * getHours());
		} else {
			return (int)(getWage() * 40 + (getHours() - 40) * getWage() * 1.5);
		}
	}	
	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		if (wage < 0) {
			throw new IllegalArgumentException("時薪必須 >= 0");
		}
		this.wage = wage;
	}
	
	public double getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (hours < 0 || hours >= 160) {
			throw new IllegalArgumentException("工時必須 >= 0，時數不得超過40小時一周(共160)");
		}

		this.hours = hours;
	}

	public HourlyEmployee(String firstName, String lastName, String idNumber, int wage, int hours) {
		super(firstName, lastName, idNumber);
		this.wage = wage;
		this.hours = hours;
	}

	@Override
	public String toString() {
		return MessageFormat.format("員工{3}為打工仔!\n打工時數: {0}\n時薪: {1}\n月薪:{2}",getHours(),getWage(),getPaymentAmount(),super.toString());
	}
}
