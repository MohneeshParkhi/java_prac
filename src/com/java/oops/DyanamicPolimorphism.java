package com.java.oops;

class Animal{
	
	public void sound() {
		System.out.println("I am Animal");
	}
}

class Dog  extends Animal{
	
	@Override
	public void sound() {
		System.out.println("Bark bark");
	}
	
}

class Cat extends Animal {
	
	@Override
	public void sound() {
		System.out.println(54);
	}
}

public class DyanamicPolimorphism {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.sound();
		Animal an = new Dog();
		an.sound();
		Animal  a = new Cat();
		a.sound();
	}
}
