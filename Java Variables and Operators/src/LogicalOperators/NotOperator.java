package LogicalOperators;

public class NotOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean h=true;
		boolean m=false;
		
		System.out.println(h&& m);//false
		System.out.println(!(h&&m));// not false
		System.out.println(h||m);  //true
		
		
		int a=10;
		
		
		if(!(a==20))
       System.out.println("a is equal to 20");
	}

}
