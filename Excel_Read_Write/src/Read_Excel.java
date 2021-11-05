
public class Read_Excel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Xls_Reader xls= new Xls_Reader("D:\\JANBASK\\OCT_WEEKDAY_BATCH\\Excel_Read_Write\\TESTDATA\\TESTSUITE.xlsx");
		
		int row_count=xls.getRowCount("GMAIL");
		
		System.out.println(row_count);
		
		String value=xls.getCellData("GMAIL", "STATUS", 3);
		
		//System.out.println(value);
		
		
		for( int i=1;i<=row_count;i++) {
			
			String first=xls.getCellData("GMAIL", "TCID", i);
			String second=xls.getCellData("GMAIL", "TESTCASE", i);
			String third=xls.getCellData("GMAIL", "STATUS", i);
			
			System.out.print(first);
			System.out.print(" | ");
			System.out.print(second);
			System.out.print(" | ");
			System.out.print(third);
			
			System.out.println();
		}
		
		
		

	}

}
