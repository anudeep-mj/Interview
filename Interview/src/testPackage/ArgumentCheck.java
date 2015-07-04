package testPackage;

public class ArgumentCheck {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file = args[args.length-1];
		int[] values = new int[args.length-1];
		for(int i = 0; i<args.length-1; i++)
		{
			values[i] = Integer.parseInt(args[1]);
		}
		
		System.out.println(file);
		for(int i=0; i < values.length; i++)
		{
			System.out.println(values[i]);
		}
	}

}
