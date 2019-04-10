package com.mohneesh.NestedClasses;

// import com.mohneesh.NestedClasses.Bike.HeroHonda;

class Bike {
	
	public int speed ;
	
	
	Bike(int speed){
		this.speed = speed;
	}
	
	
	class HeroHonda {
		
		void printSpeed() {
			System.out.println("Speed of the Bike in inner class \t" +  speed);
		}
	}
}


public class InnerClassConceptExp1 {
	public static void main(String[] args) {
			Bike bike = new Bike(45);
			Bike.HeroHonda bi = bike.new HeroHonda();
			bi.printSpeed();
			
	}
}
