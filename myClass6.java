package armedia;

import java.io.File;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.Scanner;

public class myClass6 {

		// TODO Auto-generated constructor stub
	

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		String filename = scanner.nextLine();
		File file = new File(filename);
		scanner =  new Scanner(file);
		int totalNumberGroups = scanner.nextInt();
		 int avg = -1;
		
		
		  for(int gp = 0; gp < totalNumberGroups; gp++) {
			System.out.println("totalNumberGroups[" +gp + "]");
			
			  String controlRecord = scanner.next();   // has to be asterisk
			  System.out.println("controlRecord[" + controlRecord + "]");
			  String controlRecordIndicator = controlRecord.substring(0,1);
			  
			  System.out.println("controlRecordIndicator[" + controlRecordIndicator + "]");
			  
			  
			  int numDataRecsPerGp  = -1;
			  int numElements = -1;
					
					numDataRecsPerGp =scanner.nextInt();//number rows in group:number data-records in in group:number data elements
					  numElements = scanner.nextInt();
					
					  
					  
					  System.out.println("numRowsGp[" + numDataRecsPerGp + "]");
			 
			  //int numElements = scanner.nextInt();
			  System.out.println("numDataRecsGp[" + numDataRecsPerGp + "]");
			  //actual data begins next line
			 // int numDataElements = scanner.nextInt(); // indicates columns in each group of records
			  String[] valuesInDataElements = new String[numElements];
			  int total = 0;
			
			    for(int row = 0; row < numDataRecsPerGp; row++) {
			       for(int col=0; col < numElements; col++) {
			    	   String data_record = "";
				  
			    	    data_record = scanner.next();
				   
				   
				   System.out.println("data_record[" + data_record + "]");
				  
				   valuesInDataElements[col] = data_record;
				   }
			     System.out.println("AVG =" + total/numElements);  
			       int[] intElements = new int[valuesInDataElements.length];
			       String[] stringElements = new String[valuesInDataElements.length];
			      
			       for(int k=0, q=0; k < valuesInDataElements.length; k++, q++) {
			 
			    	       try {
			    	          intElements[k] =  Integer.parseInt(valuesInDataElements[k]);
			    	       }  catch(Exception e)
			    	        {
			    	    	      stringElements[q] = valuesInDataElements[q] ;
			    	       }
			          if(numDataRecsPerGp == 2) {
				          System.out.println("AVG =" + total/numElements);  
			    	          double Result = (3.14 * intElements[0]) + .16 * (1.44 + 
			    		     	 (intElements[1] * intElements[1] * intElements[1]));
			    	      System.out.println("FORM = " + Result);
			          } // if numelements 2
			       
			          if(numDataRecsPerGp == 3) {
				          System.out.println("AVG33 =" + total/numElements);  

                  // Double Result = pi * (first value) + psi * (1.44 + (second value)3  )  + (zeta (lookup using the following mapping)) / (second value)
						   
				           double ROOT_FACTOR=-1;
	                   if(stringElements[0] != null) {
	                	     if(stringElements[0].equals("b") ){
	                      
	                   		ROOT_FACTOR =3.2 * 3.2 * 3.2 * 3.2 ;
	                     } else if(stringElements[0].equals("c")) {
	                	         ROOT_FACTOR = 3.2 * 3.2 * 3.2 * 3.2 * 3.2 * 3.2 * 3.2;
	                     } else {
	              	     ROOT_FACTOR = 3.2 * 3.2 * 3.2;
	                     
	                     } 
	                  
					   Double Result =
							   3.14 * (intElements[0] + 6.39485 ) * 
							       (1.44 + (intElements[1] * intElements[1] * intElements[1]) + 
							    		   ROOT_FACTOR);
					   System.out.println("Result[" + Result + "]");
				       }  // if numelements 3
			          }
			       } 
			      }
			    
			    
         }//totl number groups
	}
}