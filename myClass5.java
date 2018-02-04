package armedia;
/*Create a function with the following input parameters to perform the task defined

findMatch(int[] list, int total, int numToUse) {
 list = list of integers
total = a single integer
numToUse = how many numbers from the list to use as a maximum

This function should print all combinations of values in 'list', when summed up return the value in 'total'
The value provided in 'numToUse' indicates the maximum values to use from 'list' to calculate the 'total'.  If the value is 2 then use a maximum of 2 elements from 'list'.  If the value is 3, use a maximum of 3 elements from 'list'

For example:
list[1,5,6,3,6,7]
total = 13
numToUse = 2

Then the following should be printed:
Element 3 + Element 6 = 13
Element 5 + Element 6 = 13

If numToUse = 3 with the same inputs, then
Element 3 + Element 6 = 13
Element 5 + Element 6 = 13
Element 1 + Element 2 + Element 6 = 13



Execute for the following inputs:

list = {3,4,6,7,10,3,9,15,17,17, 10,7}
total = 20
numToUse = 2, 3, and 4

Please provide the output from the execution of the code.

*/
public class myClass5 {
	
	public myClass5() {
		// TODO Auto-generated constructor stub
	}

	
	 //Create a function with the following input parameters to perform the task defined

	static void findMatch(int[] list, int total, int numToUse) {	
		
		for(int i=0; i < list.length && numToUse > 0; i++) {					
			for(int j=1; j < list.length && numToUse > 0; j++) 
			{
			
			   if(list[i] + list[j]  == total ) { 
		    	     System.out.println(" Element " + i + " Element  =  " + j +  "  ==  "  + total);
			     
		    	     numToUse-- ;
				};
			 }			
		}					
	      System.out.println();
	      System.out.println();
	      System.out.println();
	}
	
	public static void main (String args[]) {
		
	int[] list = {3,4,6,7,10,3,9,15,17,17, 10,7};
	int 	total = 20;
	int	numToUse = 2;
	findMatch(list, total, numToUse);
	
	numToUse = 3;
	findMatch(list, total, numToUse);
	
	numToUse = 4;
	findMatch(list, total, numToUse);
		
	}
	
	
	
}
