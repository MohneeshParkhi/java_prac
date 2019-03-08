package com.mohneesh.AbstractClassExamples;

// program to clear concept of abstract class and sorting..
abstract class UseCaseOne{
	// no need to override defined nethods.
	void printAcendingNumber() {
		int[] num = {4,5,6,4,6,8,9};
		for(int m=0;m<num.length;m++) {
			System.out.print(num[m]+" ");
		}
		for(int k=0;k<num.length;k++)
		{
			
			for(int j=k+1;j<num.length;j++) {
				if(num[k] > num[j]) {
					int temp = num[k];
					num[k] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println("\nThe sorted array in ascending order");
		for(int l=0;l<num.length;l++) {
			System.out.print(num[l]+" ");
		}
	}
	// method with body can exists without abstract keyword.
	abstract void printName();
}

public class AbstractSecond extends UseCaseOne{
	void printName(){
		System.out.println("Mohneesh");
	}
	
	
	// not necessary to write defined method.
public static void main(String[] args) {
	
	
	AbstractSecond abs = new AbstractSecond();
	
	abs.printName();
	abs.printAcendingNumber();
}
}
