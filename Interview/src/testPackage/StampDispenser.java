package testPackage;

import java.util.*;

/**
 * Facilitates dispensing stamps for a postage stamp machine.
 */
public class StampDispenser
{
	int[] stampDenominations;
	
	/**
     * Constructs a new StampDispenser that will be able to dispense the given 
     * types of stamps.
     *
     * @param stampDenominations The values of the types of stamps that the 
     *     machine should have.  Should be sorted in descending order and 
     *     contain at least a 1.
     */
    public StampDispenser(int[] stampDenominations)
    {
    	if(stampDenominations.length > 1){
    			boolean check = false;
    	
    			outerloop:
    			for(int k = 0; k< stampDenominations.length - 1; k++)
    			{	
    				if(stampDenominations[k] < stampDenominations[k+1]) {    			
//    					throw new IllegalArgumentException("denominations not in descending order.");
    					System.out.println("Denominations not in descending order");
    					System.out.println("Commencing sorting:");
    					stampDenominations =  sortingInDescending(stampDenominations);   // stampDenominations sorted in descending order if not so.
    					System.out.println("sorting done");
    					break outerloop;
    				}
       			}
    	
//    			for(int j = 0; j < stampDenominations.length ; j++)
//				System.out.println(stampDenominations[j]);
    	
    			if(stampDenominations[stampDenominations.length-1] == 1)
				{
    			// checked if 1 is available in the list or not.
        			check = true;
				}
    	
    			if(!check) {
    				throw new IllegalArgumentException("1 not available in the list given");
    			}
    	}
    	else
    		 throw new IllegalArgumentException("array length given lesser than or equal to 1");
    	
    	 this.stampDenominations = stampDenominations;
    }
 
    private int[] sortingInDescending(int[] stampDenominations2) {
		// TODO Auto-generated method stub
    	Arrays.sort(stampDenominations2);	//sorting done
		for(int i = 0; i < stampDenominations2.length / 2; i++)
		{
			int tempVariable = stampDenominations2[i];
			stampDenominations2[i] = stampDenominations2[stampDenominations2.length-i - 1];
			stampDenominations2[stampDenominations2.length - i - 1] = tempVariable;			//array reversed to get descending order.
		}
		return stampDenominations2;
	}

	/**
     * Returns the minimum number of stamps that the machine can dispense to
     * fill the given request.
     *
     * @param request The total value of the stamps to be dispensed.
     */
    public int calcMinNumStampsToFillRequest(int request)
    {
    	int[] stampsToMakeAmount= new int[request+1];
    	
    	int[] answerUsingEachDenomination = new int[stampDenominations.length];
       

    	stampsToMakeAmount[0] = 0;

    	for (int centIndex = 1; centIndex <= request; centIndex++) {

    		for (int i = 0; i < stampDenominations.length; i++ ) {
    			answerUsingEachDenomination[i] = -1;                  
    		}
    		for (int i = 0; i < stampDenominations.length; i++){
    			if (centIndex >= stampDenominations[i]) {
    				answerUsingEachDenomination[i] = stampsToMakeAmount[centIndex - stampDenominations[i]] + 1;    // Solution to make change for $j
    			}
    		}
    		stampsToMakeAmount[centIndex] = -1;
    		
    		for (int i = 0; i < stampDenominations.length; i++) {
    			if (answerUsingEachDenomination[i] >= 0) {
    				if (stampsToMakeAmount[centIndex] == -1 || answerUsingEachDenomination[i] < stampsToMakeAmount[centIndex]) {
    					stampsToMakeAmount[centIndex] = answerUsingEachDenomination[i];
    				}
    			}
    		}
    	}

    	return stampsToMakeAmount[request];
    	
    }
    
    public static void main(String[] args)
    {
        int[] denominations = { 20, 30, 24, 10, 6, 2, 1 };
        StampDispenser stampDispenser = new StampDispenser(denominations);		//array checked if in descending order, else sorted in descending order.
        
        System.out.println("The stamps in descending order are:");
//        for(int j = 0; j < denominations.length ; j++)
//			System.out.println(denominations[j]);

        int numberOfStamps = stampDispenser.calcMinNumStampsToFillRequest(18);
        System.out.println(numberOfStamps);
        assert  stampDispenser.calcMinNumStampsToFillRequest(18) == 3;

    }
}