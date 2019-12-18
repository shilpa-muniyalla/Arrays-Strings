package com.shil.sample.project;
import java.util.*;

public class ListAndMap {

	public static void main(String[] args) {
	
		Student stu1 = new Student();
		stu1.setName("ramya");
		stu1.setAge(28);
		
		Student stu2=new Student();
		stu2.setName("mithun");
		stu2.setAge(29);
		
		Student stu3= new Student();
		stu3.setName("praveen");
		stu3.setAge(30);
		
		List<Student> list=new ArrayList<>();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		
		Iterator<Student> i=list.iterator();
		while(i.hasNext()) {
			Student stu=i.next();
		System.out.println(stu.getName() +stu.getAge());

	}
		
		for(int j=0;j<list.size();j++) {
			System.out.println(list.get(j).getName() +list.get(j).getAge());
		}
		
		for(Student s:list) {
			System.out.println(s.getName() +s.getAge());
		}

}
}
