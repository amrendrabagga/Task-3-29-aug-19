package com.string.assignment;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountingCharacterTypesInString {

	public static void main(String[] args) {
		//ascii value for 0-9 is 48-57
		//ascii value for A-Z is 65-90
		//ascii value for a-z is 97-122
		//ascii value for space is 32
		//considering other ascii value as special characters
		
		List<Integer> digits = IntStream.range(48,58).boxed().collect(Collectors.toList());
		List<Integer> capitalAlphabets = IntStream.range(65,91).boxed().collect(Collectors.toList());
		List<Integer> smallAlphabets = IntStream.range(97,123).boxed().collect(Collectors.toList());
		int space = 32;
		
		HashMap<String,Integer> hmap = new HashMap<>();
		
		String s = "hello user123, You can Mail me @ xyz4343@gmail.com with # tag java!";
		
		for(int i=0;i<s.length();i++) {
			
			if (digits.contains((int)s.charAt(i))) 
				hmap.compute("digits", (k,v)->(v==null)?1:++v);	
			
			else if(capitalAlphabets.contains((int)s.charAt(i)))
				hmap.compute("CapitalLetter", (k,v)->(v==null)?1:++v);
			
			else if(smallAlphabets.contains((int)s.charAt(i)))
				hmap.compute("SmallLetter", (k,v)->(v==null)?1:++v);
			
			else if(space == (int)s.charAt(i))
				hmap.compute("Space", (k,v)->(v==null)?1:++v);
			
			else
				hmap.compute("SpecialCharacter", (k,v)->(v==null)?1:++v);
		}
		
		hmap.forEach((k,v)->System.out.println(k+" are "+v));
		

	}

}
