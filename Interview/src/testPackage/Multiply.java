package testPackage;

public class Multiply {
	public int multiply(int x, int y)
	{
		if (x > 999) {
		      throw new IllegalArgumentException("X should be less than 1000");
		    }
		return x/y;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
