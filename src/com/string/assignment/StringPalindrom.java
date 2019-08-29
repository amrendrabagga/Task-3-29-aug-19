package com.string.assignment;

public class StringPalindrom {
	
	public static void main(String args[]) {
		String s = "ababa";
		if(checkPalindrom(s))
			System.out.println("IT IS A PALINDROM");
		else
			System.out.println("NOT A PALINDROM");
	}

	private static boolean checkPalindrom(String s) {
		int last = s.length()-1;
		int i=0;
		while(i<last) {
			if(s.charAt(i) != s.charAt(last))
				return false;
			last--;
			i++;
		}
		return true;
	}

}
