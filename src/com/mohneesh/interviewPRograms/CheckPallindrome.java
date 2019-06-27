package com.mohneesh.interviewPRograms;

public class CheckPallindrome {
	
	private void usingJavaMethod(String str) {
		System.out.println("Using JAVA API");
		String tempStr;
		StringBuffer strBuff = new StringBuffer(str);
		tempStr = strBuff.reverse().toString();
	    if(tempStr.equals(str))
	    	System.out.println("PAllindrome");
	    else
	    	System.out.println("Not Palindrome");
	}
	
	private boolean usingSimpleLogic(String str) {
		System.out.println("Using Logic ");
		char arr[] = str.toCharArray();
	    int j=0;
		char tempArr[] = new char[arr.length];
		for(int i= (arr.length-1);i>=0;i--) {
			tempArr[i] = arr[j];
			j++;
		}
		int k=0;
		int counter =0;
		for(int i=0;i<tempArr.length;i++) {
			if(tempArr[i] == arr[k]) {
				counter++;
			}
			k++;
		}
		if(counter == arr.length) {
			System.out.println("Pallindrome");
		}else System.out.println("Not Pallindrome");
		
	return false;
	}
	
	public static void main(String[] args) {
		CheckPallindrome chkPallin = new CheckPallindrome();
			chkPallin.usingSimpleLogic("ankur");
			chkPallin.usingJavaMethod("naman");	
	}
}
