package com.shil.sample.project;

import java.util.Comparator;


	
public class StudentCompByName implements Comparator<Student> {

		
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}
		
		 
	}



