package com.durga;

class Animal{
	
}
class Moneky extends Animal{
	
}
public class MethodOverloadingCase6 {

	
	public void m1(Animal a) {
		System.out.println("Animal Version");
	}
	public void m1(Moneky m) {
		System.out.println("Monkey Version");
	}
	public static void main(String[] args) {
		MethodOverloadingCase6 m=new MethodOverloadingCase6();
		Animal a=new Animal();
		m.m1(a);
		Moneky k=new Moneky();
		m.m1(k);
		Animal a1=new Moneky();
		m.m1(a1);//Animal Version
	}

}
