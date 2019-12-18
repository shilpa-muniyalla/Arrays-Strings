package com.shil.sample.project;

import java.util.Comparator;

public class StudentCompByAge implements Comparator<Student>{
	
	public int compare(Student s1,Student s2) {
		if(s1.getAge()==s2.getAge()) {
			return 0;
		}
		if(s1.getAge()>s2.getAge()) {
			return 1;
		}
		else {
			return -1;
			
		}
	}

}
