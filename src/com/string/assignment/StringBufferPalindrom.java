package com.string.assignment;

public class StringBufferPalindrom {

	public static void main(String args[]) {
		
		String s = "aa";
		StringBuffer sb = new StringBuffer(s);
		if(s.equals(sb.reverse().toString())) {
			System.out.println("IT IS A PALINDROM");
		}
		else
			System.out.println("IT IS NOT A PALINDROM");
	}
}
