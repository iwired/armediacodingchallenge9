package armedia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class myClass7 {
	public static final String CONTROL_RECORD_INDICATOR = "*";
    final String fName = "src/armedia/armedia.txt";
    private List<String> recordList = null;
    int dataField1 = 0;
    int dataField2 =0;
    String dataField3 = null;
    int numDatasets = -1;
    int numRows = -1;
	int numElements = -1;
  
	public myClass7() {}

	
	
	public List<String> getRecords() throws Exception {		
		try (Stream<String> fileContentStream = Files.lines(Paths.get(fName))) {
			
	        recordList = null;
			recordList = fileContentStream.collect(Collectors.toList());						 
	     }
		return recordList;
		
	}
	
	public static void main(String[] args) throws Exception {		
		myClass7 myclass7 = new myClass7();		
		myclass7.getRecords();
		//myclass7.getData();
		//for(String record: recordList)
		myclass7.parseRecord();
	}
	
	
	public void parseRecord() throws Exception {	
		
		for(String record : recordList) {				
				
			String ss[] = record.split("\\s+");
			if(ss.length == 1 && !ss[0].isEmpty()) {					
				numDatasets = Integer.parseInt(ss[0].trim().substring(0,1));						
			} else 	
				if(ss[0].contains(CONTROL_RECORD_INDICATOR)) {
					try {
					  if(numRows > 0) {
						throw  new Exception("data inconsistent");
					  }
					} catch (Exception e) {
						e.printStackTrace();
					}
				numRows =  Integer.parseInt(ss[0].substring(1,2));
				numElements = Integer.parseInt(ss[1]);
				}
			 else {
				
				  if(numElements == 3) {
					  try {
					     if(ss[0].isEmpty() || ss[1].isEmpty() || ss[2].isEmpty()) {
						  throw new Exception("error data set is empty");
					     }  else { 
					    	   dataField1 = Integer.parseInt(ss[0]);
					     
						  dataField2 = Integer.parseInt(ss[1]);
						  dataField3 = ss[2];
						 
								doCalculate();
								numRows--;
					     }
					  
					  }catch(Exception e) {
						  e.printStackTrace(	);
						  System.out.println();
					  } 
					      				  
				  }	 
	
					
				  if (numElements == 2 ) {
						 try {
						    if(ss[0].isEmpty() || ss[1].isEmpty()) {
						      	  throw new Exception("error data set is empty");
						     } else {
							       dataField1 = Integer.parseInt(ss[0]);
							       dataField2 = Integer.parseInt(ss[1]);
							      
										doCalculate();
										numRows--;
									
					         }
				   
						  } catch(Exception e) {
							  e.printStackTrace();
						  }
					    } 
				  }
			 }
		
					
			}
			


           
			
			
		
		public void doCalculate() throws Exception {

			
			
			if (numElements == 2) {
				if(dataField1 != 0  || dataField2 != 0) {
				//System.out.println("here 2");
				System.out.format("AVG   =  " + "%.3f%n", ((dataField1 + dataField2 )/ 2d));
				System.out.format("FORM  =  " + "%.3f%n", (3.14 * dataField1)
						+ (6.39485 * (1.44 + (dataField2 * dataField2 * dataField2))));
				  System.out.println();
				}
			}
		
			
			
			
			
			if (numElements == 3) {
				if(dataField1 !=0 && dataField2 != 0 && dataField3 != null) {
				
				if(dataField3.equals("b")) {
						System.out.format("AVG 33  =  " + "%.3f%n", (dataField1 + dataField2 + 4d) / 3d);
					System.out.format("FORM 33 =  " + "%.3f%n", (3.14 * (dataField1))
							+ ( 6.39485 * (1.44  + (dataField2 * dataField2 * dataField2)) + ((3.2 * 3.2 * 3.2 * 3.2) /( dataField2))));
					  System.out.println();
				} else if (dataField3.equals("c")) {
						System.out.format("AVG 33  =  " + "%.3f%n",( (dataField1 + dataField2 + 6d) / 3d));
					System.out.format("FORM 33 =  " + "%.3f%n",
							(3.14 * dataField1)+ (6.39485 * (1.44 + (dataField2 * dataField2 * dataField2))
									+( (3.2 * 3.2 * 3.2 * 3.2 * 3.2 * 3.2 )  / (dataField2))));
									
					  System.out.println();

				} else if(!dataField3.equals("c") && (!dataField3.equals("b"))){
					System.out.format("AVG 33  =  " + "%.3f%n",((dataField1 +  dataField2 + 3d) / 3d));
					System.out.format("FORM 33 =  " + "%.3f%n",( 3.14 * dataField1)
							+ ( 6.39485 *  (1.44 + (dataField2 * dataField2 * dataField2)) +( (3.2 * 3.2 * 3.2) / dataField2)));
					  System.out.println();

				   }
					}
			}
		}	
		
}
