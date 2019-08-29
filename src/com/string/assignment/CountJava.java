package com.string.assignment;

public class CountJava {
	public static void main(String args[]) {
		
		String s = "this is java and java is object oriented and java is powerful. I love java language";
		int i=s.indexOf("java",0);
		int count = 0;
	
		while(i!=-1) {
			
			System.out.println("JAVA OCCURED AT INDEX " + i);
			count++;
			i = s.indexOf("java",i+1);
		}
		System.out.println("---------------------------------");
		System.out.println("JAVA OCCURED " + count + " TIMES");
	}
}
