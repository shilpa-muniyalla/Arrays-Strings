package com.shil.sample.project;
import java.util.*;

public class ListCompare {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("ramya");
		list.add("shilpa");
		list.add("praveen");
		Collections.sort(list);
		
		for(String s:list) {
			System.out.println(s);
		}
		
		Student stu1=new Student();
		stu1.setName("ramya");
		stu1.setAge(28);
		
		Student stu2=new Student();
		stu2.setName("shilpa");
		stu2.setAge(31);
		
		Student stu3=new Student();
		stu3.setName("praveen");
		stu3.setAge(30);
		
		List<Student> studentList =new ArrayList<>();
		studentList.add(stu1);
		studentList.add(stu2);
		studentList.add(stu3);
		
		Collections.sort(studentList, new StudentCompByName());
		Iterator<Student> studentIterator=studentList.iterator();
		while(studentIterator.hasNext()) {
			Student student=studentIterator.next();
			System.out.println(student.getAge() +student.getName());
		}
		
		Collections.sort(studentList, new StudentCompByAge());
		for(int i=0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i).getAge() +studentList.get(i).getName());
			
		}
		
		
		
	}

}
