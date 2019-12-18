package com.shil.sample.project;

public class BinarySearch {

	public void checkBinarySearch(int[] array, int start, int end, int x) {
		if (start <= end) {
			int mid = (start + (end - start) / 2);
			
			if (x == array[mid]) {
				System.out.println("element found at index: " + mid);
				return;

			}
			if (x > array[mid]) {
				start = mid + 1;
			}
			if (x < array[mid]) {
				end = mid - 1;
			}
			
			checkBinarySearch(array, start, end, x);
		}

		else {
			System.out.println("number not found");
		}

	}

	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		int[] array = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		binarySearch.checkBinarySearch(array, 0, array.length - 1, 25);

	}

}
