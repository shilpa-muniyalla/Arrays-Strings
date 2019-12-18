package com.shil.sample.project;

public class EqualsAndHashcode {

	public static void main(String[] args) {
		
		HumanEquals shilpa = new HumanEquals(1001,"shilpa");
		HumanEquals ramya = new HumanEquals(1002,"shilpa");
		int result=ramya.hashCode();
		int result2=shilpa.hashCode();
		System.out.println(result);
		System.out.println(result2);
		
		String str1="FB";
		String str2="Ea";
		System.out.println(str1.hashCode()+ " " + str2.hashCode());
		
		boolean value=shilpa.equals(ramya);
		System.out.println(value);
	

	}

}
