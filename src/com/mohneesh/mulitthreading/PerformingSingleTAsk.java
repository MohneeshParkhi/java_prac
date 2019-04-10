package com.mohneesh.mulitthreading;


/**
 * 
 * @author mohneesh
 *
 */
class LinearSearch extends Thread {
	
	int arr[];
	int searchedKey;
	
	LinearSearch(int arr[], int key){
		this.arr = arr;
		this.searchedKey = key;
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < arr.length ;i++) {
			if(arr[i] == searchedKey) {
				System.out.println("Key is found \t"+ searchedKey);
				System.out.println("Index is \t"+ i);
				System.out.println("Time complexity of Linear search is 'n' ");
			}
		}
	}
}


public class PerformingSingleTAsk {
	
	static int arr [] = {1,2,3,4,5};
	public static void main(String[] args) {
		LinearSearch linearSearch = new LinearSearch(arr, 5);
	    linearSearch.start();
	   LinearSearch ls = new LinearSearch(arr, 4);
	   ls.start();
	}
}
