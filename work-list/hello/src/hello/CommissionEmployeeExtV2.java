package hello;

public class CommissionEmployeeExtV2 extends Object{
	
	public String firstName;
	public String lastName;
	public String idNumber;
	public double grossSales;
	public double commissionRate;

	public CommissionEmployeeExtV2(String firstName,String lastName,String idNumber,double grossSales,double commissionRate) {
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
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public double earnings() {
		return this.grossSales * this.commissionRate;	
	}
	
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f%n",
				"領傭金的員工-姓名",lastName,firstName,
				"身分證字號",idNumber,
				"銷售金額",grossSales,
				"傭金比例",commissionRate,
				"薪資",this.earnings());
	}
}

