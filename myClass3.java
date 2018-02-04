package armedia;

/*Write a complete subroutine that finds the largest value in an array of ints. 
 * The subroutine should have one parameter, which is an array of type int[]. 
 * The largest number in the array should be returned as the value of the subroutine.
 */
//O(n)
public class myClass3 {

	public myClass3() {

	}

	public static int findLargest(int[] nums) {
    	int largest =  nums[0];
    	for(int i = 1; i< nums.length; i++) {  
    		
    			if(nums[i] > largest) {
    				largest = nums[i];
    			}
    	
    	}
    	return largest;
    	}
    public static void main(String args[]) {
    	
    	int[] ary = { 55, 89, 90, 23, 44, -1, -6, 9};
    	int largest = myClass3.findLargest(ary);
    	System.out.println(largest);
    }
}
