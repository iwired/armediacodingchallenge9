package armedia;
/*
Please implement this method to
return a new array with only positive numbers from the given array.
The elements in the resulting array shall be sorted in the ascending order.
*/
public class myClass4 {

	
		// TODO Auto-generated constructor stub
	   public  static int[] retainPositiveNumbers(int[] nums) {
	       
	   int[] positive = new int[nums.length];
	      	for(int i = 0, j = 0; i< nums.length; i++, j++) {  	    		
	    			if(nums[i] > 0) {
	    				positive[j] = nums[i];
	    			}    	
	      	}
	     	return positive;
	    	}
	    public static void main(String args[]) {
	    	
	    	int[] ary = { 55, 89, 90, 23, 44, -1, -6, 9};
	    	int[] positive = myClass4.retainPositiveNumbers(ary);
	   for(int i = 0; i < positive.length; i++) {
		   
	        	System.out.println(positive[i]);
	    }
	    
	 }
}


