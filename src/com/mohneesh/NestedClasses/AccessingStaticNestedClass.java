package com.mohneesh.NestedClasses;

class Hcl {
	
	String employee[];
	
	Hcl(){}
	
	Hcl(String[] employee){
		this.employee = employee;
	}
	
	
	static class EmployeeNames{
		
		void printEmployeeNames() {
			System.out.println(new Hcl().employee);
		}
	}
}

public class AccessingStaticNestedClass {
	public static void main(String[] args) {
		String[] empl = {"mohneesh", "Rohan", "himanshu", "alam"}; 
		
		Hcl.EmployeeNames hcl = new Hcl.EmployeeNames();
		hcl.printEmployeeNames();
		
	}
}
