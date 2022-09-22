package interfaceClass;

public class InterfaceClassTest {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		int i;
		
		Payable payableArray[] = new Payable[8];
		payableArray[0] = new CommissionEmployee("真倉", "輸", "A111111111", 200000, 0.06);
		payableArray[1] = new CommissionEmployee("蚊折", "蚵", "A222222222", 60000, 0.1);
		payableArray[2] = new BasePlusCommissionEmployee("有蟻", "猴", "A333333333", 60000, 0.5 , 10000);
		payableArray[3] = new BasePlusCommissionEmployee("粒輪", "豬",  "A444444444", 80000, 0.04 , 20000);
		payableArray[4] = new WeekSalaryPlusCommissionEmployee("拾盅", "塵", "A555555555", 40000, 0.1, 5000);
		payableArray[5] = new SalariedEmployee("玩庵", "講", "A666666666", 30000);
		
		payableArray[6] = new Invoice("P0001", "鍵盤", 150, 10);
		payableArray[7] = new Invoice("P0002", "滑鼠", 200, 5);
		

		
		for(i=0;i<payableArray.length;i++) {
			System.out.printf("%s%d%s :%n%n%s%n%n", "第 ", i+1 ," 筆應付帳款資料",payableArray[i].toString());
			
//			payableArray[2].setGrossSales(150);
			((CommissionEmployee)payableArray[2]).setGrossSales(150);
			
			((BasePlusCommissionEmployee)payableArray[i]).setBaseSalary(i);
			
			if(payableArray[i] instanceof BasePlusCommissionEmployee) {
				((BasePlusCommissionEmployee)payableArray[i]).setBaseSalary(1.1 * ((BasePlusCommissionEmployee)payableArray[i]).getBaseSalary());
				System.out.printf("%s%n%s:%n%n%s%n", "符合加薪條件!! 為底薪加獎金員工","底薪加薪 10% 後，薪資資料",payableArray[i].toString());
			}
		}
	}

}
