package com.mohneesh.strings;

// Methods of String are syncronized
public class StringBufferExample {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer("hcl");
	    StringBufferExample f = new StringBufferExample();
	    
	    System.out.println(f.hashCode());
	    System.out.println(buf.hashCode());
	    buf.append(" private limited");
	    System.out.println(buf.capacity());
	    System.out.println( buf);
	   
	    System.out.println();
	}
}
