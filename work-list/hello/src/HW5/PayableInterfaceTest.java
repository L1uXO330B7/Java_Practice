package HW5;


public class PayableInterfaceTest {

	public static void main(String[] args) {
		
		// TODO 自動產生的方法 Stub
		Payable payableArray[] = new Payable[6];

		payableArray[0]=new Invoice("KB001", "鍵盤", 150, 10);
		payableArray[1]=new Invoice("M0002", "滑鼠", 50, 5);
		payableArray[2] = new HourlyEmployee("沒錢", "林", "A333333333", 200, 50);
		payableArray[3] = new CommissionEmployee("獎金", "林", "A777777777", 1500000, 0.06);
		payableArray[4] = new BasePlusCommissionEmployee("底薪", "林", "A666545454", 60000, 0.5, 10000);
		payableArray[5] = new SalariedEmployee("大大", "陳", "A666666666", 30000);		
		
		for(int i=0;i<payableArray.length;i++) {
			System.out.println(i+"-----------------------------");
			System.out.println(payableArray[i]);
			if(payableArray[i] instanceof BasePlusCommissionEmployee) {
				((BasePlusCommissionEmployee)payableArray[i]).setBaseSalary(1.1 * ((BasePlusCommissionEmployee)payableArray[i]).getBaseSalary());
				System.out.printf("%s%n%s:%n%n%s%n", "符合加薪條件!! 為底薪加獎金員工","底薪加薪 10% 後，薪資資料",payableArray[i].toString());
			}
		}
        System.out.println("-------------------------------");
		
		System.out.printf("%s:%s%n","取得原銷售金額為",((CommissionEmployee)payableArray[4]).getGrossSales()); 
		((CommissionEmployee)payableArray[4]).setGrossSales(50000);
	    System.out.printf("%s:%n%s%n%n","重設應付帳款資料為",payableArray[0].toString());
	}

}
