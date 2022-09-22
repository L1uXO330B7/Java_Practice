package abstractClass;

public class CommissionEmployee extends Employee{
	
	private double grossSales;
	private double commissionRate;

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		if(grossSales < 0.0) {
			throw new IllegalArgumentException("薪資資料錯誤，銷售金額必須 >= 0.0");
		}
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if((commissionRate < 0.0) || (commissionRate >1.0)){
			throw new IllegalArgumentException("薪資資料錯誤，傭金比率必須 >= 0.0 並且 <= 1.0");
		}
		this.commissionRate = commissionRate;
	}
	
	public CommissionEmployee(String firstName,String lastName,String idNumber,double grossSales,double commissionRate) {
		super(firstName,lastName,idNumber);
		
		if(grossSales < 0.0) {
			throw new IllegalArgumentException("薪資資料錯誤，銷售金額必須 >= 0.0");
		}
		
		if((commissionRate < 0.0) || (commissionRate >1.0)){
			throw new IllegalArgumentException("薪資資料錯誤，傭金比率必須 >= 0.0 並且 <= 1.0");
		}
		
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public double earnings() {
		return (getGrossSales() * getCommissionRate());
	}

	@Override
	public String toString() {
		return String.format("%s%s%s: %.2f%n%s: %.2f%n%s: %.2f%n",
				"領獎金的員工-",super.toString(),
				"銷售金額",getGrossSales(),
				"獎金比例",getCommissionRate(),
				"薪資",this.earnings());
	}
	
//	@Override
//	public String toString() {
//		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f%n",
//				"領獎金的員工-姓名",getLastName(),getFirstName(),
//				"身分證字號",getIdNumber(),
//				"銷售金額",getGrossSales(),
//				"獎金比例",getCommissionRate(),
//				"薪資",this.earnings());
//	}
}

