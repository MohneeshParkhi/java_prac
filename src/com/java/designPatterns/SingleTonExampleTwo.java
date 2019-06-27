package com.java.designPatterns;


class SingletonObject{
	
	static SingletonObject singletonObj;
	
	private SingletonObject() {}
	
	static SingletonObject getSingletonObject() {
		
		if(singletonObj != null) {
			return singletonObj;
		}
		else
			
			singletonObj = new SingletonObject();
	
		return singletonObj;	
	}
}




public class SingleTonExampleTwo {

	public static void main(String[] args) {
		
		SingletonObject singleton = SingletonObject.getSingletonObject();
		
		System.out.println(singleton.hashCode());
		
	}
	
}
