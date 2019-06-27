package com.mohneesh.interviewPRograms;

class Coursee implements Cloneable{
	
	String subject1;
	String subject2;
	String subject3;
	public Coursee(String subject1, String subject2, String subject3) {
		super();
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

class Studentt implements Cloneable{
	
	int id;
	String name;
	
	Course coursee;

	public Studentt(int id, String name, Course coursee) {
		super();
		this.id = id;
		this.name = name;
		this.coursee= coursee;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		Studentt student = (Studentt) super.clone();
		student.coursee = (Course) coursee;	
		return student;
	}
}



public class DeepCopyInJava {
	public static void main(String[] args) {
		Course science = new Course("Science","Maths","Biology");
		
		Student student1 = new Student(1,"Himanshu", science);
		
		Student student2 = null;
		
		try {
			student2 = (Student) student1.clone();
			
		}catch(CloneNotSupportedException ex) {ex.getLocalizedMessage();}
	
		
		//Printing the subject3 of 'student1'
		 
        System.out.println(student1.course.subject3);         //Output : Biology
 
        //Changing the subject3 of 'student2'
 
        student2.course.subject3 = "Maths";
 
        //This change will not be reflected in original student 'student1'
 
        System.out.println(student1.course.subject3);    
		
	}
}
