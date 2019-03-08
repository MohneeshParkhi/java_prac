package com.mohneesh.AbstractClassExamples;

abstract class UseCaseTwo{
	protected abstract void sortingInDes(); 
}

public class AbstractThird extends UseCaseTwo{
 public static void main(String[] args) {
	AbstractThird abs = new AbstractThird();
	abs.sortingInDes();
}
 
 @Override
 protected void sortingInDes() {
	 	int[] arr = {1,2,3,4,5,6};
	 	int i,j;
	 	System.out.println("The Input Array is :");
	 	for(i=0;i<arr.length;i++) {
	 		System.out.print(arr[i]+"\t");
	 	}
	 	
	 	// performing logic to sort array in descending order..
	 	
	 	for(i=0;i<arr.length;i++) {
	 		for(j=i+1;j<arr.length;j++) {
	 			if(arr[i] < arr[j]){
	 				int temp =arr[i];
	 				  arr[i]= arr[j];
	 				  arr[j]= temp;
	 			}
	 		}
	 	}
	 	
	 	System.out.println("\nThe Sorted array in descending order :");
	 	
	 	for(j=0;j<arr.length;j++) {
	 		System.out.print(arr[j]+"\t");
	 	}
	 	
 }
}
