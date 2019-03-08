package com.mohneesh.staticExamples;

public class StaticMethodWithinClass {
   private static void swapTwoNumbers(int num, int num1) {
	   System.out.println("Number before swapping\n"+ "num :"+num+"\n"+"num1 :"+num1);
	   int tempNum = num1;
	   num1= num;
	   num = tempNum;
	   System.out.println("Number after swapping\n"+ "num :"+num+"\n"+"num1 :"+num1);
   }
  
   protected void swapTwoNumWithoutThirdVar(int num, int num1) {	
	   System.out.println("Number before swapping\n"+ "num :"+num+"\n"+"num1 :"+num1);
	   num = num+num1;
	   num1= num-num1;
	   num = num-num1;
	   System.out.println("Number before swapping\n"+ "num :"+num+"\n"+"num1 :"+num1);
   }
	public static void main(String[] args) {
		swapTwoNumbers(10, 20);
		new StaticMethodWithinClass().swapTwoNumWithoutThirdVar(10, 20);
}
}
