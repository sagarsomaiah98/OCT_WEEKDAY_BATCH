import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Assertion_Example {
	
	@Test
	public void test() {
		String name1="Mike";
		String name2="Steve";
		String name3="mike";
		
		String name4="Steve";
		
		
		//System.out.println(name1.equals(name2));
	//	System.out.println(name1.equals(name3));
		//System.out.println(name2.equals(name4));
		
		
		assertEquals(name1,name2);//false-fail
		assertEquals(name1,name3); //false-fail
		assertEquals(name2, name4);//true-pass
		
		
		
	}

	
}
