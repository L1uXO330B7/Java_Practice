package interfaceClass;

public class SalariedEmployee extends Employee {
	
	private double salary;
	
	public SalariedEmployee(String firstName,String lastName,String idNumber,double salary) {
		super(firstName,lastName,idNumber);
		
		setSalary(salary);
	}

	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary < 0.0) {
			throw new IllegalArgumentException("薪資資料錯誤，固定薪資金額必須 >= 0.0");
		}
		
		this.salary = salary;
	}

	@Override
	public double getPaymentAmount() {
		return getSalary();
	}
	
	@Override
	public String toString() {
		return String.format("%s%s%s: %.2f%n",
				"領固定薪資的員工-",super.toString(),
				"固定薪資",getPaymentAmount()
				);
	}

}
