package com.mohneesh.strings;


public class StringEqualCheck {
	
	 void usingCompareTo(String stat,String s1, String s2) {
		 System.out.println(stat);
		 System.out.println(s1.compareTo(s2));
	 }
	
	
	
	public static void main(String[] args) {
		StringEqualCheck obj = new StringEqualCheck();
		
		String s = "hcl";
		String k = "hcl";
		String a = "HCL";
		String c = new String("hcl");
		
		// checking content
		System.out.println(s.equals(k));
		
		// checkin refrence
		System.out.println(s == k);
		// checking refrence of two uneuwal string
		System.out.println(k == a);
		
		// checking refrence of pool and non-pool string
		System.out.println(k == c);
		
		// checking string content of pool and non-pool string..
		System.out.println(k.equals(c));
	
		System.out.println("*****************CALING COMPARE TO METHOD*************************");
	   
		obj.usingCompareTo("Print ZERO when string are equal ",s,k);
		obj.usingCompareTo("String equal, poool and non pool string comparision" , k,c);

	}
}
