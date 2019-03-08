package com.mohneesh.inheritance;

class Dog{
	private String name;
	private String breed;
  
	public Dog() {
		super();
	}

	Dog(String name, String breed){
		this.name = name;
		this.breed = breed;
		
	}
	
	void printInfo(){
		System.out.println("Dog details are as follows");
		System.out.print(this.name);
	    System.out.println(this.breed);
	}

}


public class SimpleInheritance extends Dog {
//    SimpleInheritance(String name, String breed) {
//		super();
//		// TODO Auto-generated constructor stub
//	}

public static void main(String[] args) {
	Dog dog = new Dog("Mat","White German  shefard");
	dog.printInfo();
}
}
