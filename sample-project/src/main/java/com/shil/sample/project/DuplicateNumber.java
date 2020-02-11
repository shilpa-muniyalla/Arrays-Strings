package com.shil.sample.project;

public class DuplicateNumber {
	
	/*public static void checkDuplicateNumber(int[] array) {
		
		for (int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					System.out.println("The duplicatenumber in the array is: "+array[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] array= {1,2,3,2,1,2,5,6};
	
		DuplicateNumber.checkDuplicateNumber(array);
	}

}*/

public static void findDupicateInArray(int[] a) {
    int count=0;
    for(int j=0;j<a.length;j++) {
        for(int k =j+1;k<a.length;k++) {
            if(a[j]==a[k]) {
                count++;
            }
        }
        if(count==1) { 
           System.out.println(a[j]);
           }
        count = 0;
    }
}


public static void main(String[] args) {
	int[] array= {1,2,3,2,1,2,5,6,1};

	DuplicateNumber.findDupicateInArray(array);
}
}
