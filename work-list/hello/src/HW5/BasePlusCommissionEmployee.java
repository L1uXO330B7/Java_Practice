package HW5;

public class BasePlusCommissionEmployee extends CommissionEmployee {

	public double baseSalary;

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) {
			throw new IllegalArgumentException("薪資資料錯誤，底薪金額必須 >= 0.0");
		}
		this.baseSalary = baseSalary;
	}

	public BasePlusCommissionEmployee(String firstName, String lastName, String idNumber, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, idNumber, grossSales, commissionRate);

		if (baseSalary < 0.0) {
			throw new IllegalArgumentException("薪資資料錯誤，底薪金額必須 >= 0.0");
		}

		this.baseSalary = baseSalary;
	}

	@Override
	public double getPaymentAmount() {
		// return getBaseSalary() + (getGrossSales() * getCommissionRate());
		return (getBaseSalary()) + super.getPaymentAmount();
	}

	@Override
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f%n%s: %.2f%n", "領底薪加佣金的員工-姓名",
				getLastName(), getFirstName(), "身分證字號", getIdNumber(), "銷售金額", getGrossSales(), "佣金比例",
				getCommissionRate(), "底薪金額", getBaseSalary(), "總薪資", this.getPaymentAmount());
	}
}
