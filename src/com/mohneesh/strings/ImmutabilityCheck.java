package com.mohneesh.strings;

public class ImmutabilityCheck {
 public static void main(String[] args) {
	 
	 String var = "mohneesh";
	 // unrefrenced string immutable object.
	 String var1 = var.concat("  parkhi");
	
	
	 // prints only mohneesh ..
	 	System.out.println(var);
 		System.out.println(var1);
 	}
}
