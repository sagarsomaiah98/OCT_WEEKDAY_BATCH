package com.janbask.collectionExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<String> colors= new HashSet<String>();
		
		colors.add("RED");
		colors.add("BLUE");
		colors.add("YELLOW");
		colors.add("BROWN");
		colors.add("BLACK");
		colors.add("WHITE");
	//	colors.add("brown");
		
		//System.out.println(colors.size());
		
		
		Iterator<String> pointer= colors.iterator();
		
		/*
		 * System.out.println(pointer.hasNext()); System.out.println(pointer.next());
		 * System.out.println(pointer.hasNext()); System.out.println(pointer.next());
		 * System.out.println(pointer.hasNext()); System.out.println(pointer.next());
		 * System.out.println(pointer.hasNext()); System.out.println(pointer.next());
		 * System.out.println(pointer.hasNext()); System.out.println(pointer.next());
		 * System.out.println(pointer.hasNext()); System.out.println(pointer.next());
		 * System.out.println(pointer.hasNext());
		 */
		
		
		while(pointer.hasNext())
		{
			
			System.out.println(pointer.next());
		}

	}

}
