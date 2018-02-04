package armedia;

public class Record {
	public static final String CONTROL_RECORD_INDICATOR = "*";
	private int totalNumberGroups = 0;
	String record;
	
    private int dataField1;
   

	private int dataField2;
    private String dataField3;



	

	public String getRecord() {
		return record;
	}

	public void setRecord(String record) {
		this.record = record;
	}

	public Record(String record) throws Exception {

		this.record = record;
        
	}
	public int getTotalNumberGroups() {
		return totalNumberGroups;
	}

	public void setTotalNumberGroups(int totalNumberGroups) {
		this.totalNumberGroups = totalNumberGroups;
	}
	


	 public int getDataField1() {
			return dataField1;
		}


		public void setDataField1(int dataField1) {
			this.dataField1 = dataField1;
		}


		public int getDataField2() {
			return dataField2;
		}


		public void setDataField2(int dataField2) {
			this.dataField2 = dataField2;
		}



		public String getDataField3() {
			return dataField3;
		}


		public void setDataField3(String dataField3) {
			this.dataField3 = dataField3;
		}

}
