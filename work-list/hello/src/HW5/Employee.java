package HW5;

public abstract class Employee extends Object implements Payable {

	private String firstName;
	private String lastName;
	private String idNumber;

	// public abstract double earnings();

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public Employee(String firstName, String lastName, String idNumber) {
		super();

		if (firstName.equals("")) {
			throw new IllegalArgumentException("基本資料錯誤，員工 firstName 不可空白!");
		}

		if (lastName.equals("")) {
			throw new IllegalArgumentException("基本資料錯誤，員工 lastName 不可空白!");
		}

		if (idNumber.equals("")) {
			throw new IllegalArgumentException("基本資料錯誤，員工 idNumber 不可空白!");
		}

		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
	}

	@Override
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n", "姓名", getLastName(), getFirstName(), "身分證字號", getIdNumber());
	}

}
