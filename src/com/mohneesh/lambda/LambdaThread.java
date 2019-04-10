package com.mohneesh.lambda;

import java.util.LinkedList;
import java.util.List;

interface ThreadLambda{
	void generateThread();
}

public class LambdaThread {
	public static void main(String[] args) {
			
		
		ThreadLambda tl = () -> {
				// Thread t = new Thread();
				List<String> ll = new LinkedList<String>();
				ll.add("hcl");
				ll.add("infosys");
				ll.add("facebook");
				ll.add("google");
				// t.start();
				ll.forEach(n-> System.out.println(n));
			};
			
			tl.generateThread();
			
			
	}
}
