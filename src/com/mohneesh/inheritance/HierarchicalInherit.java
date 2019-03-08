package com.mohneesh.inheritance;

class Superinfo{
	void meth(){
		System.out.println("Printing super info");
	}
}

class Info extends Superinfo{
	@Override
	void meth() {
		System.out.println("Printing meth details");
	}
}

class Details extends Superinfo{
	void methd() {
		System.out.println("Details");
	}
}

public class HierarchicalInherit extends Superinfo{
   public static void main(String[] args) {
	   System.out.println("Hierchical class object");
	   HierarchicalInherit hObj = new HierarchicalInherit();
	   hObj.meth();
	   System.out.println("Info class object");
	   Info IObj = new Info();
	   IObj.meth();
	   System.out.println("Detail class object");
	   Details dObj = new Details();
	   dObj.meth();
	   dObj.methd();
    }
}
