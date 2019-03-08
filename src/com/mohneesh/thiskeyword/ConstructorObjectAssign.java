package com.mohneesh.thiskeyword;

class CallAnObj{
	CallAnObj a;
	
	CallAnObj(){}
	
//	CallAnObj(CallAnObj obj){
//		this.a = obj;
//	
//	 methd(obj);
//	}
	
	void methd(CallAnObj ob){
		this.a = ob;
		System.out.println(this.a.equals(ob));
	}
	
}

public class ConstructorObjectAssign {
public static void main(String[] args) {
	CallAnObj oo = new CallAnObj();
    oo.methd(oo);	
}
}
