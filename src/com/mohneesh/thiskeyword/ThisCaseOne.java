package com.mohneesh.thiskeyword;


/**
 *  To differentiate between instance and parameter variables and hence
 *  ending annonimity
 * @author mohneesh
 *
 */

class UseCaseOne{
	private String username;
	private String password;
	
	UseCaseOne(){
		
	}
	
	UseCaseOne(String username, String password){
		username = username;
		password = password;
	}
	
	//atleast parameter type need to be different in case of same constructor type
	/*
	 * UseCaseOne(String username, String pwd){
	 * 
	 * }
	 */
	
	void printCredentials() {
		System.out.println("Username\t"+ username);
		System.out.println("Password\t"+ password);
	}
}

// using this keyword
class UseCaseTwo{
	private String id;
	private String name;
	
	UseCaseTwo(String id, String name){
		this.id = id;
		this.name= name;
	}
	
	void printInfo(){
	System.out.println("\n Printing ingot using this keyword");
	System.out.println(id+ "\t"+name);
	}
}

public class ThisCaseOne {
public static void main(String[] args) {
	UseCaseOne obj = new UseCaseOne();
	UseCaseOne obj1 = new UseCaseOne("googledoodle","123456");
	obj.printCredentials();
	System.out.println("\ncalling constructor without using this keyword\n");
	obj1.printCredentials();
	UseCaseTwo ob3 = new UseCaseTwo("001", "hcl");
	ob3.printInfo();
}
}
