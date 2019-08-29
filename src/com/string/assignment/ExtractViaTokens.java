package com.string.assignment;

import java.util.StringTokenizer;

public class ExtractViaTokens {
	
	public static void main(String args[]) {
		
		String s="1.java,2.oracle,3.python,4.php,5.linux,6.hadoop,7.scala"; 
		StringTokenizer st = new StringTokenizer(s,",");
		
		while(st.hasMoreTokens()) {
			String tk = st.nextToken();
			int startIndex = tk.indexOf('.')+1;
			System.out.println(tk.substring(startIndex));
		}
	}

}
