package com.mohneesh.lambda;

import java.util.Scanner;

// fucntional interface as it has only one method...
interface Sum{
	int printSum();
}

interface SumParam{
	int printSum(int a, int b);
}

interface Calculator{
	int calculate(int a, int b,int c);
}


abstract class abc implements Sum{
	public  int printSum() {
		System.out.println("Drawing hero.....");
	return 0;
	}
}


public class LambdaSingleParameter {
  public static void main(String[] args) {
	
	  Sum s1 = () -> {
		  return 1+2;
	  };
	  
	  s1.printSum();
	  
	  SumParam s2 = (int a ,int b) -> {
		  // System.out.println(a+b);
		  return (a+b);};
	  s2.printSum(10,20);

	  Calculator cal = (int a, int b, int c) -> {
		  int result=0;
		  System.out.println("The values of a and b are : " +a + b);
		  switch(c) {
		  case 1: System.out.println("Addition"+(result=a+b));
		  case 2: System.out.println("Subtraction"+ (result=a- b));
		  case 3: System.out.println("Division "+ (result=a/b));
		  case 4: System.out.println("Multiplication" + (result=a*b)); 
		  }
		  return result;
		  
	  };
   cal.calculate(10,20, 2);
  }
}
