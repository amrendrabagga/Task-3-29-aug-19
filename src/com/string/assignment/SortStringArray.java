package com.string.assignment;

import java.util.stream.Stream;

public class SortStringArray {

	public static void main(String[] args) {
		
		String cities[]={"bhopal","agra","mumbai","chennai","pune","delhi"};
		
		//using quick sort for sorting, as a practice
		quickSort(cities,0,cities.length-1);
		Stream.of(cities).forEach(x->System.out.print(x + "\t"));
	}

	private static void quickSort(String[] cities, int low, int high) {
		
		if(low<high) {
			int partition = partition(cities,low,high);
			quickSort(cities,low,partition-1);
			quickSort(cities,partition+1,high);
		}
		
	}

	private static int partition(String[] cities, int low, int high) {
		
		int left = low;
		int right = high;
		String pivotItem = cities[low];
		while(left<right) {
			while(pivotItem.compareTo(cities[left])>=0)
				left++;
			while(pivotItem.compareTo(cities[right])<0)
				right--;
			if(left<right)
				swap(cities,left,right);
		}
		swap(cities,low,right);
		
		return right;
	}

	private static void swap(String[] cities, int left, int right) {
		String tmp = cities[left];
		cities[left] = cities[right];
		cities[right] = tmp;
		
	}

}
