package hello;

public class BasePlusCommissionEmployeeExtV1 extends CommissionEmployeeExtV1{
	
	public double baseSalary;
	
	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if(baseSalary < 0.0) {
			throw new IllegalArgumentException("薪資資料錯誤，底薪金額必須 >= 0.0");
		}
		this.baseSalary = baseSalary;
	}

	public BasePlusCommissionEmployeeExtV1(String firstName,String lastName,String idNumber,double grossSales,double commissionRate,double baseSalary) {
		super(firstName,lastName,idNumber,grossSales,commissionRate);
		
		if(baseSalary < 0.0) {
			throw new IllegalArgumentException("薪資資料錯誤，底薪金額必須 >= 0.0");
		}
		
		this.baseSalary = baseSalary;
	}

	public double earnings() {
		return this.baseSalary + (getGrossSales() * getCommissionRate());	
	}
	
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f%n%s: %.2f%n",
				"領底薪加傭金的員工-姓名",lastName,firstName,
				"身分證字號",idNumber,
				"銷售金額",getGrossSales(),
				"傭金比例",getCommissionRate(),
				"底薪金額",baseSalary,
				"總薪資",this.earnings());
	}
}
