package com.mohneesh.CollectionsPackage.map;

import java.util.HashMap;

class Employee {
	String name;
	
	Employee(String name){
		this.name = name;
	}
	
	void printDetails() {
		System.out.println(this.name);
	}
}

class Department {
	String deptName;
	
	Department(String dptName){
		this.deptName = dptName;
	}
	
	
	void printDetails() {
		System.out.println(this.deptName);
	}
} 



public class HashMapCompute {
	public static void main(String[] args) {
		
		HashMap<Department, Employee > map = new HashMap();
		Department d = new Department("Science");
		
		map.put(d, new Employee("mohneesh"));
		map.put(new Department("R&D"), new Employee("Himasnhu"));
		map.put(new Department("R&D"), new Employee("rohan"));
		map.put(new Department("R&D"), new Employee("alam"));
		map.put(new Department("R&D"), new Employee("appoorve"));
		
		
		
		
		
		System.out.println("Size of map is :"+ map.size());
		
		System.out.println(map.containsKey(d));
		
		map.computeIfPresent(d,(Department, Employee)->{
			return new Employee("jhk");
		});
		

		map.compute(d, (Department, Employee) ->{
			return null;
		});
		
		Department dd = new Department("jk");
		
		map.computeIfAbsent(dd ,(Department) -> {
			return new Employee("hello");
		});
		
		map.forEach((Department, Employee) ->{
			System.out.print("\n"+Department.deptName+" "+Employee.name);
			System.out.println();
		});
		
	}
}
