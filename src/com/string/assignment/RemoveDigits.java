package com.string.assignment;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDigits {

	public static void main(String args[]) {

		String s = "ad3daddfd5443dfsfss";
		List<Integer> digits = IntStream.range(48,58).boxed().collect(Collectors.toList());
		
		StringBuffer sb = new StringBuffer(s);
		int start=0;

		while(start<sb.length()) {
			if(digits.contains((int)sb.charAt(start))) {
				sb.deleteCharAt(start);
				continue;
				
			}
			start++;
		}
		System.out.println(sb.toString());
		
	}
}
