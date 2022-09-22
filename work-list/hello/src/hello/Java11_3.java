package hello;

public class Java11_3 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int i,sum = 0;
		int accumulateNumber = 10;
		
		for(i=1;i<=accumulateNumber;i++) {
			sum=sum+i;
			System.out.println("Sum =" + sum);
		}
		System.out.println("1到"+accumulateNumber+"的和為 : " + sum);

		for(i=1,sum=0;i<=accumulateNumber;i++) {
			if((i%2) == 1) {
				sum=sum+i;
			    System.out.println("Sum =" + sum);
			}
		}
		System.out.println("1到"+accumulateNumber+"的和為 : " + sum);
	}

}
