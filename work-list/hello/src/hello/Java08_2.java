package hello;

public class Java08_2 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		int bufferLength = 8;
		byte[] buffer = new byte[bufferLength];
		
		int i = 0,j = 0;
		
		char c;
		
		try {
			
			System.out.print("請輸入字串 : ");
			
			System.in.read(buffer);
			
			while ((c = (char)buffer[i]) != '\n' ) {
				i++;
				if(i >= bufferLength) {
					System.out.print(new String(buffer));
					
					for( j = 0 ;j < bufferLength; j++) {
						buffer[j] = 0;					
					}
					
					System.in.read(buffer);
					i = 0;
				}	
			}
			
			if (c == '\n') {
				System.out.print(new String(buffer));
			}
			
		} catch (java.io.IOException ex) {
			ex.printStackTrace();
		}
	}

}
