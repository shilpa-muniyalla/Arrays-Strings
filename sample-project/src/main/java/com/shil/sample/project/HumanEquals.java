package com.shil.sample.project;

public class HumanEquals {
	
	public int adharNumber;
	public String name;
	
	HumanEquals(int adharNumber,String name){
		this.adharNumber=adharNumber;
		this.name=name;
	}
	
	@Override
	public int hashCode() {
		return adharNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		HumanEquals anotherHuman=(HumanEquals)obj;
		if(this.adharNumber!=anotherHuman.adharNumber) {
			return false;
		}
		
		
		if(!this.name.equals(anotherHuman.name)){
			return false;
		}
		else {
			return true;
			
		}
	}
}


