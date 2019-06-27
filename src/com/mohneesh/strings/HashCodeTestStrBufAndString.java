package com.mohneesh.strings;

public class HashCodeTestStrBufAndString {
	
	private  void stringHashCodeTest(String str) {
		System.out.println("Hashcode before concatation: "+ str.hashCode());
		String test = str.concat("hello");
		System.out.println("HashCode of strinf after concat operation "+ test.hashCode());
	 
	}
	
	private void strBufferTest(String str) {
		System.out.println("Hashcode before concatation: "+ str.hashCode());
	    StringBuffer strBuf = new StringBuffer();
	}
	
	
	public static void main(String[] args) {
		
	}
}
