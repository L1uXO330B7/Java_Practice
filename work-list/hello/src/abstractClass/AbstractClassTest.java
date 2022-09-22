package abstractClass;

public class AbstractClassTest {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		int i;
		
		Employee employeeArray[] = new Employee[6];
		employeeArray[0] = new CommissionEmployee("真倉", "輸", "A111111111", 200000, 0.06);
		employeeArray[1] = new CommissionEmployee("蚊折", "蚵", "A222222222", 60000, 0.1);
		employeeArray[2] = new BasePlusCommissionEmployee("有蟻", "猴", "A333333333", 60000, 0.5 , 10000);
		employeeArray[3] = new BasePlusCommissionEmployee("粒輪", "豬",  "A444444444", 80000, 0.04 , 20000);
		employeeArray[4] = new WeekSalaryPlusCommissionEmployee("拾盅", "塵", "A555555555", 40000, 0.1, 5000);
		employeeArray[5] = new SalariedEmployee("玩庵", "講", "A666666666", 30000);
		
		for(i=0;i<employeeArray.length;i++) {
			System.out.printf("%s%d%s :%n%n%s%n%n", "第 ", i+1 ," 位員工資料",employeeArray[i].toString());
		}
		
	}

}
