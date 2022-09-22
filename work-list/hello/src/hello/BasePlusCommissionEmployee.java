package hello;

public class BasePlusCommissionEmployee extends Object{
	
	public String firstName;
	public String lastName;
	public String idNumber;
	public double grossSales;
	public double commissionRate;
	public double baseSalary;
	
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

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if(baseSalary < 0.0) {
			throw new IllegalArgumentException("薪資資料錯誤，底薪金額必須 >= 0.0");
		}
		this.baseSalary = baseSalary;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public BasePlusCommissionEmployee(String firstName,String lastName,String idNumber,double grossSales,double commissionRate,double baseSalary) {
		super();
		
		if(firstName.equals("")) {
			throw new IllegalArgumentException("基本資料錯誤，員工 firstName 不可空白!");
		}
		
		if(lastName.equals("")) {
			throw new IllegalArgumentException("基本資料錯誤，員工 lastName 不可空白!");
		}
		
		if(idNumber.equals("")) {
			throw new IllegalArgumentException("基本資料錯誤，員工 idNumber 不可空白!");
		}
		
		if(grossSales < 0.0) {
			throw new IllegalArgumentException("薪資資料錯誤，銷售金額必須 >= 0.0");
		}
		
		if((commissionRate < 0.0) || (commissionRate >1.0)){
			throw new IllegalArgumentException("薪資資料錯誤，傭金比率必須 >= 0.0 並且 <= 1.0");
		}
		
		if(baseSalary < 0.0) {
			throw new IllegalArgumentException("薪資資料錯誤，底薪金額必須 >= 0.0");
		}
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		this.baseSalary = baseSalary;
	}

	public double earnings() {
		return this.baseSalary + (this.grossSales * this.commissionRate);	
	}
	
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f%n%s: %.2f%n",
				"領底薪加傭金的員工-姓名",lastName,firstName,
				"身分證字號",idNumber,
				"銷售金額",grossSales,
				"傭金比例",commissionRate,
				"底薪金額",baseSalary,
				"總薪資",this.earnings());
	}
	
	
}
