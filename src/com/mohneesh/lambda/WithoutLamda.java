package com.mohneesh.lambda;
interface Drawable{
	public void draw();
} 

public class WithoutLamda implements Drawable{
public static void main(String[] args) {
	
	Drawable dr = new WithoutLamda();
	dr.draw();
	
	Drawable dd = new Drawable(){
		public void draw() {
			System.out.println("Annonymous class");
		}
	};
	
	dd.draw();
	
	// with lambda ....
	
	Drawable d = ()->{
		System.out.println("helo helo ");
	};
	d.draw();
}

   public void draw() {
	System.out.print("drawing");
   }
}
