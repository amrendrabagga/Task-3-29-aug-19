package com.string.assignment;

import java.util.HashMap;


public class CountBranchWiseStudents {

	public static void main(String args[]) {
		
		String[] rollnumbers = {"342568","124578","125623","562376","347834","784596","782367","124576"};
		
		HashMap<String,Integer> hmap = new HashMap<>();
		for(String rollno : rollnumbers) {
			
			String branch = rollno.substring(0,2);
			//it can be done via if else also
			switch(branch) {
				case "12" :
					hmap.compute("CS", (k,v)->(v==null)?1:++v);
					break;	
				case "34":
					hmap.compute("IT", (k,v)->(v==null)?1:++v);
					break;
				case "56":
					hmap.compute("MECH", (k,v)->(v==null)?1:++v);
					break;
				case "78":
					hmap.compute("CIVIL", (k,v)->(v==null)?1:++v);
					break;
			}
			
		}
		hmap.forEach((k,v)->System.out.println("NUMBER OF STUDENTS OF " + k + " ARE " + v));
	}
}
