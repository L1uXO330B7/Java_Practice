package abstractClass;

public class WeekSalaryPlusCommissionEmployee extends CommissionEmployee {
	
	private double weekSalary;
	
	public double getWeekSalary() {
		return weekSalary;
	}

	public void setWeekSalary(double weekSalary) {
		if(weekSalary < 0.0) {
			throw new IllegalArgumentException("薪資資料錯誤，週薪金額必須 >= 0.0");
		}
		
		this.weekSalary = weekSalary;
	}

	public WeekSalaryPlusCommissionEmployee(String firstName,String lastName,String idNumber,double grossSales,double commissionRate,double weekSalary) {
		super(firstName,lastName,idNumber,grossSales,commissionRate);
		
        setWeekSalary(weekSalary);
	}
	
	@Override
	public double earnings() {
		return (getWeekSalary() + super.earnings());
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f%n%s: %.2f%n ", 
				"領週新加獎金的員工-姓名",getLastName(),getFirstName(),
				"身分證字號",getIdNumber(),
				"銷售金額",getGrossSales(),
				"獎金比例",getCommissionRate(),
				"週薪金額",getWeekSalary(),
				"總薪資",this.earnings());		
	}

}
