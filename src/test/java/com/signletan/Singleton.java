/**
 * 
 */
package com.signletan;

/**in oop, a singleton class is a class that can have only once(instance of the class) at a time
 * How to design singleton class
 * Make a constructor as private
 * write a public static method(getInstance) that has return type of object of this singleton class (lazy Initialization)
 */
public class Singleton {
	private static Singleton singleton_instance=null;
	public String str;
	public Singleton() {
		str="Hey I'm using signgleton class pattern";
	}
	public static Singleton getInstance() {
		if(singleton_instance==null)
			singleton_instance=new Singleton();
		return singleton_instance;
	}
	public static void main(String[] args) {
		Singleton x=Singleton.getInstance();
		Singleton y=Singleton.getInstance();
		Singleton z=Singleton.getInstance();
		x.str=(x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		z.str=(z.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
	}
}
