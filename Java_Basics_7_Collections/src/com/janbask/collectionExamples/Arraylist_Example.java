package com.janbask.collectionExamples;

import java.util.ArrayList;
import java.util.List;

public class Arraylist_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Define the arraylist
		List<String> Students= new ArrayList<String>();
		
		Students.add("PAUL");
		Students.add("Keivin");
		Students.add("JOHN");
		Students.add("JOE");
		Students.add("CHRIS");
		Students.add("SOM");
		Students.add("Keivin");
		Students.add("JOHN");
		
		
		int size=Students.size();
		
	//System.out.println(Students.get(3));
		
		
		System.out.println("Student arraylist size is "+size);
		
		System.out.println("BEFORE INSERTION");
		
		for(int i=0;i<size;i++) {
			
			
			System.out.println(Students.get(i));
		}
		
		
		Students.add(0, "LUCY");
		
		Students.remove(6);
		
		
		System.out.println("**************** AFTER INSERTION**************");
		
		 size=Students.size();
		
		 System.out.println("Student arraylist size is "+size);
       for(int i=0;i<size;i++) {
			
			
			System.out.println(Students.get(i));
		}
		
		

	}

}
