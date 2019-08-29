package com.string.assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountDomain {
	
	public static void main(String args[]) {
		String[] emails = {"amrendra@gmail.com","chirag@gmail.com","anuj@yahoo.com","manav@reddif.com","tanish@yahoo.com","sunny@reddif.com"};
		
		//using java 8 stream 
		Map<String,Long> hmapStream = Stream.of(emails).collect(Collectors.groupingBy(s->s.substring(s.lastIndexOf('@')+1),Collectors.counting()));
		hmapStream.forEach((k,v)->System.out.println(k + " -> " + v));
		
		System.out.println("---------------------------------------");
		//normal code
		HashMap<String,Integer> hmap = new HashMap<>();
		
		for(String email : emails) {
			String domain = email.substring(email.lastIndexOf('@')+1);
			hmap.compute(domain, (k,v)->(v==null)?1:v+1);
		}
		hmap.forEach((k,v)->System.out.println(k + " -> " + v));
		
	}

}
