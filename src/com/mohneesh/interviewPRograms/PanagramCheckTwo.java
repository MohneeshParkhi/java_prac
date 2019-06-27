package com.mohneesh.interviewPRograms;

public class PanagramCheckTwo {
	
	 static void checkPanagramString(String input) {
		 int index= 0;
			int flag =1;
			boolean[] alphList = new boolean[26];
			
			for(int i=0 ;i< input.length() ;i++) {
				if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
					System.out.println("Index is  :" +index);
					index = input.charAt(i) - 'A';
				}else if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
					System.out.println("Index is  :" +index);
					index = input.charAt(i) -'a';
				}
				
				alphList[index] = true;
			}
			
			for(int i= 0 ;i <= 25 ;i++ ) {
				if(alphList[i] == false) {
					flag = 0;
				}
				
			}
			
			if(flag ==1) {
				System.out.println("String is Panaram");
			} else 
				System.out.println("Not a Panagram");
				
	 }
	
	
	public static void main(String[] args) {
		
		    
			String input = "The quick brown fox jumps over the lazy dog";
			
			checkPanagramString(input);
	}
}
