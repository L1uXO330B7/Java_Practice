package HW5;

public class SalariedEmployee extends Employee {

	private double Salaried;

	public SalariedEmployee(String firstName, String lastName, String idNumber, double Salaried) {
		super(firstName, lastName, idNumber);

		setSalaried(Salaried);

	}

	public double getSalaried() {
		return Salaried;
	}

	public void setSalaried(double Salaried) {
		if (Salaried < 0.0) {
			throw new IllegalArgumentException("薪資資料錯誤，週薪金額必須 >= 0.0");
		}
		this.Salaried = Salaried;
	}

	@Override
	public double getPaymentAmount() {
		// TODO 自動產生的方法 Stub
		return getSalaried();
	}

	@Override
	public String toString() {
		return String.format("%s%s%s: %.2f%n", "領固定薪資的員工", super.toString(), "固定薪資", this.getPaymentAmount());
	}

}
