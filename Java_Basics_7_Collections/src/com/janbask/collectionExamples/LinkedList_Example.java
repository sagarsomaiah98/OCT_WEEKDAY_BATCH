package com.janbask.collectionExamples;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<String> Students= new LinkedList<String>();
		

		Students.add("PAUL");
		Students.add("Keivin");
		Students.add("JOHN");
		Students.add("JOE");
		Students.add("CHRIS");
		Students.add("SOM");
		
		
		int size=Students.size();
		
	//	System.out.println(Students.get(3));
		
		
		//System.out.println("Student arraylist size is "+size);
		
		for(int i=0;i<size;i++) {
			
			
			System.out.println(Students.get(i));
		}
		
		
		
		
		

	}
		

	}


