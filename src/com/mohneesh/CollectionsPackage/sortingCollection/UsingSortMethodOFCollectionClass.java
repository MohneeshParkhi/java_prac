package com.mohneesh.CollectionsPackage.sortingCollection;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	public int rollNumber;
	public String name;
	
	Student(){}
	
	protected Student(int rollNumer, String name){
		this.rollNumber =rollNumer;
		this.name = name;
	}
	
	Student getInstance() {
		return new Student(); 
	}
	
//	void setRollNumber(int rollNumb){
//		this.rollNumber= rollNumb;
//	}
	
	@Override
	public int compareTo(Student stud) {
		if(this.rollNumber == stud.rollNumber)
			return 0;
		else if(this.rollNumber > stud.rollNumber) 
			return 1;
		
		else 
			return -1;
		
	}
}


public class UsingSortMethodOFCollectionClass {
	public static void main(String[] args) {
		 Student st, st1, st2; 
		 st= new Student(10,"mohneesh");
		 st1 = new Student(30,"Chitthi");
		 st2 = new Student(40,"Amarapali");
		 ArrayList<Student> list = new ArrayList();
		
		 list.add(st);
		 list.add(st1);
		 list.add(st2);
 		
		 Collections.sort(list);
		
		 list.forEach(obj ->{
			 
			 System.out.println(obj.name);
			 System.out.println(obj.rollNumber);
		 });
		 
	}
}
