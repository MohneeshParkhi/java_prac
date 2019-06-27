package com.mohneesh.interviewPRograms;

class Course{
	String subject1;
	String subject2;
	String subject3;
	public Course(String subject1, String subject2, String subject3) {
		super();
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
	}
}

class Student implements Cloneable {
	
	int id;
	String name;
	Course course;
	
	public Student(int id, String name, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

public class ShallowCopyExample {
	public static void main(String[] args) {
			
		Course science = new Course("physics","chemistry","mathsmatics");
	
		Student student1 = new Student(1,"Engineering", science);
		
		Student student2 = null;
		try {
		student2 = (Student)student1.clone();
	}	catch(CloneNotSupportedException ex) {
		System.out.println(ex.getLocalizedMessage());
	}
		
		System.out.println("Printing subjects of First student");
		
		System.out.println(student1.course.subject3);
		
		
		System.out.println("Printing subjects of Copied student");
		
		System.out.println(student2.course.subject3);
		
		System.out.println("Trying to change original object using clone object");
		
		student2.course.subject3 = "Biology";
		
		System.out.println("Printing again object");
		
		
		System.out.println(student1.course.subject3);
		
     	student1.course.subject3 = "BABABABA";
		student1.id = 45454545;
		System.out.println(student1.course.subject3);
		System.out.println(student2.course.subject3); 
		System.out.println(student2.id);
		System.out.println(student1.id);
	
	}
}
