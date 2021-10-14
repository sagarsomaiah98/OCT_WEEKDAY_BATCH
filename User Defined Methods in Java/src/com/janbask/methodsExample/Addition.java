package com.janbask.methodsExample;

public class Addition {
	
	
	public void add(int a, int b) {
		
		int res=a+b;
		
		System.out.println("Addition of "+a+" and "+b+" is "+res);
		
		
		
		
	}

	public static void main(String[] args) {
		
		Addition a = new Addition();
	   a.add(30, 10);
		a.add(50, 20);
		a.add(40, 30);
		a.add(0, 100);
		

	}

}
