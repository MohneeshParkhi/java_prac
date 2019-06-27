package com.mohneesh.interviewPRograms;

public class CheckVowels {
	
	private void  checkVowels(String str) {
		char arr[] = str.toCharArray();
		int counter=0;
		
		for(int i=0 ;i<arr.length ;i++) {
			if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'o' || arr[i] == 'i'
					|| arr[i] == 'u') {
				counter++;
			}
		}
		
		System.out.println("String contains Vovels "+ counter);
	}
	
 public static void main(String[] args) {
	 	CheckVowels vovels = new CheckVowels();
 
        vovels.checkVowels("naman");
 }
}
