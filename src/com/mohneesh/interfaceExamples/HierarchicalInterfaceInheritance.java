/**
 * This Program represents the possible use of interface as multiple inheritance
 * and hierarchical inheritance.
 * @author mohneesh
 *
 */

package com.mohneesh.interfaceExamples;


interface one{
	void print();
}

interface secondInterface extends one{
	void printTwo();
}

class extendingInterfaces implements secondInterface{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printTwo() {
		// TODO Auto-generated method stub
		
	}
	
}

 // if class extends a class that implements a various inetrfaces, 
 // then there is no need to implement the interfaces in its child class
 // as mentioned below..
public class HierarchicalInterfaceInheritance extends extendingInterfaces{
 public static void main(String[] args) {
	
}
}

