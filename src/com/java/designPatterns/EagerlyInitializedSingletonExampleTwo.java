package com.java.designPatterns;

/**
 *  Istantiation occurs at class load time and class instance occurs 
 *  in class memrtoy area.
 * @author mohneesh
 *
 */


class Buddy {
	public static Buddy buddy;
	
	private Buddy() {}
	
	static Buddy getBuddyObject() {
		if(buddy == null) {
			buddy = new Buddy();
		} else {
			return buddy;
		}
		return buddy;
	}
	
	public void printInformation() {
		System.out.println("Printing hashcode of Object : "+ buddy.hashCode());
	}
}





public class EagerlyInitializedSingletonExampleTwo {
	public static void main(String[] args) {
			Buddy buddy  = Buddy.getBuddyObject();
			
			buddy.printInformation();
			
			System.out.println(Buddy.getBuddyObject().hashCode());
			
	}
}



