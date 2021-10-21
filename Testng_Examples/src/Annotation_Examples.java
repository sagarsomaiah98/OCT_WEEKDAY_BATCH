import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_Examples {
	
	@BeforeMethod
	public void before() {
		
		System.out.println("**************before***************");
	}
	
	@AfterMethod
	public void after() {
		
		System.out.println("*************after*****************");
	}
	@Test
	public void test1() {
		
		System.out.println("test 1 method");
	}
	
	@Test
	public void test2() {
		
		System.out.println("test 2 method");
	}
	@Test
	public void test3() {
		
		System.out.println("test 3 method");
	}
	
	@Test
	public void test4() {
		
		System.out.println("test 4 method");
	}

}
