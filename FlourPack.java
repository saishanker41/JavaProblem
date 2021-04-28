package javapractice;

public class FlourPack {
	
	public static boolean canPack(int bigCount, int smallCount, int goal) {
	    // Input validation.
	    if (bigCount < 0 || smallCount < 0 || goal < 0) {
	        return false;
	    }
	    // Create a variable for the the bigCount variable to show it in kg.
	    int bigCountInKg = bigCount * 5;
	    
	    if (bigCountInKg < goal) {
	        int result = goal - bigCountInKg;
	        if (result <= smallCount) {
	            return true;
	        } else {
	            return false;
	        }
	    } else if (bigCountInKg == goal) {
	        return true;
	    } else if (bigCountInKg > goal) {
	        int maxBigCount = goal / 5;
	        int result = goal - maxBigCount;
	        if (result <= smallCount) {
	            return true;
	        }
	    }
	    return false;
	}

}
