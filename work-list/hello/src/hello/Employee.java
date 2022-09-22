package hello;

public class Employee {
	
	private String firstName;
	private String lastName;
	private Date birthDay;
	private Date hireDay;
	
	public Employee(String firstName, String lastName,Date birthDay, Date hireDay) {
		if(firstName.equals("")) {
			throw new IllegalArgumentException("輸入錯誤，firstName 不可為空白!!");
		}
		if(lastName.equals("")) {
			throw new IllegalArgumentException("輸入錯誤，lastName 不可為空白!!");
		}
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
		this.hireDay = hireDay;
	}
	
	public String toString() {
		return String.format("%s, %s- 雇用日期:%s - 出生日期:%s", lastName,firstName,hireDay,birthDay);
	}
}
