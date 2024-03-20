package com.ganesh;

public class SurfaceArea {

	public static void main(String[] args) {
		sufrace(10.5,10);
		sufrace(15.5,10);
		sufrace(21,10);
		sufrace(48,10);
		sufrace1(42,12);
		piValue();
	}
	public static void sufrace(double d,double l) {
//		 d=10.5;
		float r=(float) (d/2);
//		l=10;
		double	pi=3.142857142857143;
		double surfacearea=pi*r*l;
		System.out.println(surfacearea+" cm"+"\u00B2");
		
	}
	public static void sufrace1(float d,float l) {
		double r=d/2;
		double	pi=22/7;
		float surfacearea=(float) (pi*r*l);
		System.out.println(surfacearea+" cm"+"\u00B2");
		
	}
	public static void piValue() {
	float p=(float)22/7;
		System.out.println(p);
	}

}
