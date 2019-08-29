package com.string.assignment;

public class SeperateCountryNames {

	public static void main(String[] args) {

		String s = "India,Australia,England,Canada";
		int i = s.indexOf(',',0);
		int startStr = 0;
		
		while(i!=-1) {
			System.out.println(s.substring(startStr, i));
			startStr = i+1;
			i = s.indexOf(',',i+1);
		}
		//this is to print last country
		System.out.println(s.substring(startStr));
	}

}
