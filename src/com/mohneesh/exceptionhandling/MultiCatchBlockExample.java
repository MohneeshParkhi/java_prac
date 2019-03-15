package com.mohneesh.exceptionhandling;

/**
 * To perform different task on execution of a try block, multiple catch block
 * are used.
 * 
 * @author mohneesh
 *
 */

public class MultiCatchBlockExample {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (ArithmeticException ae) {
			// Specific Exception
			System.out.println("Arithmetic Exception occured");
		} catch (IndexOutOfBoundsException io) {
			// Less specific Exception
			System.out.println(io);
		} catch (Exception ex) {
			// General Exception
			
			System.out.println(ex);
		}
	}

}
