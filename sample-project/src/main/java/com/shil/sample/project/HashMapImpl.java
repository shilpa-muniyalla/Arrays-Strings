package com.shil.sample.project;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapImpl {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap();
		map.put("1", "ramya");
		map.put("2","mithun");
		map.put("3","shilpa");
		map.put("4","praveen");
		
		if(map.containsValue("praveen")) {
			
			System.out.println("true");
			
		}
		
		System.out.println(map.containsKey("2"));
		
		Set<Entry<String,String>> set=map.entrySet();
		for(Entry e:set) {
			System.out.println("Key is:" +e.getKey() +"value is:" +e.getValue());
		}

	
	
	
	Employee emp1=new Employee();
	emp1.setName("ramya");
	emp1.setAge(28);
	
	Employee emp2=new Employee();
	emp2.setName("mithun");
	emp2.setAge(29);
	
	Employee emp3=new Employee();
	emp3.setName("shilpa");
	emp3.setAge(30);
	
	Map<Integer,Employee> m=new HashMap();
	m.put(1,emp1);
	m.put(2, emp2);
	m.put(3, emp3);
	
	Set<Entry<Integer,Employee>> set1 =m.entrySet();
	for(Entry<Integer,Employee> e1:set1) {
	System.out.println(e1.getKey() +e1.getValue().getName() +e1.getValue().getAge());
	
		

}

}
}