
public class Excel_Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xls_Reader xls=new Xls_Reader("TESTDATA\\TESTSUITE.xlsx");
		
	int rowCount=xls.getRowCount("GMAIL");
	
	/*
	 * System.out.println(rowCount);
	 * 
	 * String first=xls.getCellData("GMAIL", "TCID", 3);
	 * 
	 * System.out.println(first); String second=xls.getCellData("GMAIL", "TESTCASE",
	 * 3) ; System.out.println(second);
	 * 
	 * String third=xls.getCellData("GMAIL", "STATUS", 3) ;
	 * System.out.println(third);
	 */
		
	
	//for loop
	
	
	
	for(int i=1;i<=rowCount;i++) {
		
		   String first=xls.getCellData("GMAIL", "TCID", i);
		 
		  
		  String second=xls.getCellData("GMAIL", "TESTCASE", i) ;
			
		 
		 String third=xls.getCellData("GMAIL", "STATUS", i) ;
		 
		 System.out.println(first+"  | "+second+" | "+third);
		  
		
		
		
		
	}
	
	
	
	

	}

}
