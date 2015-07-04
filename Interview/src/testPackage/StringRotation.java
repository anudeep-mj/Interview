package testPackage;

public class StringRotation {
	static boolean checkRotate(String s1,String s2) {
		if (s1.length() == s2.length())		//check if same length first
		{
			if((s1+s1).indexOf(s2) == -1)
				return false;
				else
					return true;
		}
		return false;
//	    return (s1.length() == s2.length()) && ((s1+s1).indexOf(s2) != -1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "asdfgh";
		String s2 = "sdfgha";
		Boolean k = checkRotate(s1,s2);
		System.out.println(k);
		String s3 = "aeiouAeiouAnudeepJayaramEEjkladfiaghflkajg";
		s3= s3.replaceAll("[AEIOUaeiou]", "");
		System.out.println(s3);
		
		int i = 5;
		int x = 10;
		int y = 5;
		int z = x ^ y; 
		int z1 = Integer.bitCount(z);
		System.out.println(Integer.bitCount(z));
//		if(z1 == 1)
//			return true;
//		return false;
		
	}

}








