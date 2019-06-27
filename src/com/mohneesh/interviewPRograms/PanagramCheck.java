package com.mohneesh.interviewPRograms;

import java.util.ArrayList;
import java.util.List;

public class PanagramCheck {
	
	
	void checkPanaGram(){
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		int counter = 26;
		
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZfsrwert";
		
		List list = new ArrayList<>();
		for(int i= 0; i< str.length();i++) {
			
			
				
				
			if(list.contains(str.charAt(i))){
				continue;
			}else {
				
				if(!str.contains(" ")) {
					list.add(str.charAt(i));
					counter--;	
				}
				
				
			}
			if(counter == 0) {
				break;	
				
				}
			
		}
		if(counter == 0) {
		System.out.println("Panagram" + counter );	
		
		}
		else {
			System.out.println("Not a Panagram" + counter);
		}
		
	}
}
