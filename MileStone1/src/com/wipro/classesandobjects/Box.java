package com.wipro.classesandobjects;

public class Box {
	private int length;
	private int width;
	private int height;

	Box(int length,int width,int height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
	void area() {
		int a=length*width*height;
		System.out.println("Area is : "+a);
	}
	public static void main(String[] args) {
		Box b=new Box(3,6,4);
		b.area();
	}

}
