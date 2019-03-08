package com.mohneesh.thiskeyword;

class PassObjArgument{
	
	void meth(PassObjArgument ob){
     System.out.println("Method is invoked, passing this as an obj");
     System.out.println(ob.hashCode());
	}
	
	void meth1() {
    meth(this);
	}
	
	
}

public class PassAsArgument {
public static void main(String[] args) {
	PassObjArgument o = new PassObjArgument();
	o.meth1();
}
}
