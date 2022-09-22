package hello;

public class Java12 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int arrayInt[] = new int[10];
		
		arrayInt[0] = 5;
		arrayInt[1] = 20;
		arrayInt[2] = 45;
		arrayInt[3] = 136;
		arrayInt[4] = 23;
    	arrayInt[5] = 18;
		arrayInt[6] = 91;
     	arrayInt[7] = 49;
     	
     	int arrayInt_1[] = {112,25,43,15,12,5,38,64};
     	
     	for(int i = 0;i<8;i++) {
     		System.out.println("arrayInt["+i+"] : "+arrayInt[i]);
     	}
        System.out.println("陣列 arrayIny 的元素個數 : "+arrayInt.length);
        
     	for(int i = 0;i<8;i++) {
     		System.out.println("arrayInt_1["+i+"] : "+arrayInt_1[i]);
     	}
	}

}
