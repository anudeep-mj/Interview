package testPackage;

public class ArrayAddition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,1};
		int[] b = {6,6,9,9};
		addarray(a,b);
	}

	private static void addarray(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int alen = a.length;
		System.out.println(alen);
		int blen = b.length;
		int clen = 0;
		if(alen > blen){
			clen = alen;
		}
		else{
			clen = blen;
		}
		System.out.println("clen:" + clen);
		int[] c = new int[clen];
		
		if(alen > blen){
			System.out.println("alen > clen loop");
			c = a;
			for(int i = clen-1; i>=0; i--){
				int temp = b[blen-1] + c[i];
				if(temp > 10){
					temp = 10-temp;
					c[i-1] = c[i-1] + 1;
					c[i] = temp + c[i];
				}
				else{
					c[i] = temp + c[i];
				}
				blen--;
			}
		}
		else{
			c = b;
			System.out.println("blen > alen loop");
			int temp = 0;
			System.out.println(clen);
			for(int i = clen-1; i>=0; i--){
				System.out.println("i:" + i);
				temp = a[alen-1] + c[i];
				System.out.println(temp);
				if(temp > 10){
					temp = 10-temp;
					c[i-1] = c[i-1] + 1;
					c[i] = temp + c[i];
				}
				else{
					c[i] = temp + c[i];
				}
				alen--;
				System.out.println("c[i]:"+ c[i]);
//				System.out.println("i" + i);
//				System.out.println("alen:" + alen);
			}
		}
		
		
//		for(int i = clen; i >= 0; i--){
//			System.out.println(clen);
//			int temp = a[i] + b[i];
//			if(c[i] > 0){
//				c[i] = temp + c[i];
//			}
//			else{
//				c[i] = temp;
//			}
//			if(c[i] > 10){
//				c[i] = 10 - c[i];
//				c[i - 1] = 1;
//			}
//		}
//		for(int  j = 0; j<= clen; j++){
//			System.out.println(c[j]);
//		}
	}
}
