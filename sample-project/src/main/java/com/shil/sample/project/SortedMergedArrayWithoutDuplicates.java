package com.shil.sample.project;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SortedMergedArrayWithoutDuplicates {
	
	public static int[] findSortedMergedArrayWithoutDuplicates(int[] arrayA,int[] arrayB) {
		
		int[] mergedArray=new int[arrayA.length+arrayB.length];
		int i=0,j=0,k=0;
		
		while(i<arrayA.length) {
			mergedArray[k]=arrayA[i];
			i++;
			k++;
		}
		
		while(j<arrayB.length) {
			mergedArray[k]=arrayB[j];
			j++;
			k++;
		}
		
		Set<Integer> set=new HashSet();
		
		for(int m=0;m<mergedArray.length;m++) {
			set.add(mergedArray[m]);
		}
		
		Iterator<Integer> it=set.iterator();
		
		int[] mergedWithoutDuplicateArray =new int[set.size()];
		int n=0;
		while(it.hasNext()) {
			mergedWithoutDuplicateArray[n]=it.next();
			n++;
		}
		
		Arrays.sort(mergedWithoutDuplicateArray);
		return mergedWithoutDuplicateArray;
	}

	public static void main(String[] args) {
		int[] arrayA= {7, -5, 3, 8, -4, 11, -19, 21};
		int[] arrayB= {6, 13, -7, 0, 11, -4, 3, -5};
		int[] result=findSortedMergedArrayWithoutDuplicates(arrayA,arrayB);
		System.out.println("Array A: " +Arrays.toString(arrayA));
		System.out.println("Array B: "+Arrays.toString(arrayB));
		System.out.println("Sorted array without duplicates: "+Arrays.toString(result));
		
		

	}

}
