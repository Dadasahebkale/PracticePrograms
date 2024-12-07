package com.durga;

public class MethodOverloading {
	
	public void m1() {
		System.out.println("No-arg method");
	}
	public void m1(int i) {
		System.out.println("int-arg method");
	}
//	public void m1(double d) {
//		System.out.println("Double-arg method");
//	}
	public void m1(float f) {
		System.out.println("float-arg method");
	}
	public void m1(String s) {
		System.out.println("String-arg method");
	}
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.m1(); //No-arg method
		m.m1(10);// int-arg method
		//m.m1(10.9);// we are getting error because double data type is last and there is not change for the promotion
		m.m1('a'); //Automatic promotion ->int-arg method
		m.m1("a");//Automatic promotion ->String-arg method
		m.m1(6l);//Double-arg method
		
		//case :2
		m.m2(new Object());//Object version 
		m.m2("Oviya"); //String version
		m.m2(null); //String version
		
		//case: 3
		
		m.m3("dada");//String Version
		m.m3(new StringBuffer("Dada")); //String buffer version
		//m.m3(null);// compile time error because there is no hierarchy between String and StringBuffer both are independent
		// Object -> String
		// Object -> StringBuffer
		
		//case :4
		
		m.m4();//Var-arg Method
		m.m4(10,20); //Var-arg Method
		m.m4('c');//General Method
		m.m4(10);//General Method //Whenever there is fight between old new version method in java old version method always win
		
		//case :5
		m.m5(10, 15.f);//int float-version
		m.m5(12.2f, 11);//Float int-version
		//m.m5(10, 1);// CE reference to m5 is ambiguous
		//m.m5(10.5f, 10.5f);//CE no suitable method found
	}
	// case :2
	public void m2(Object o) {
		System.out.println("Object version");
	}
	public void m2(String s) {
		System.out.println("String version");
	}
	// case : 3
	public void m3(String s) {
		System.out.println("String Version");
	}
	public void m3(StringBuffer sb) {
		System.out.println("String buffer version");
	}
	// case :4
	public void m4(int i) {
		System.out.println("General Method");
	}
	public void m4(int... i) {
		System.out.println("Var-arg Method");
	}
	// case :5
	public void m5(int i, float f) {
		System.out.println("int float-version");
	}
	public void m5(float f, int i) {
		System.out.println("Float int-version");
	}
	// case : 6
	
}
/*
Method Overloading: Two methods are overloaded in the same class if same method names having different argument types
 
1.In Method overloading method resolution always takes care by compiler based on reference type. Run time object is dummy in this case
compile time-polymorphism or static polymorphism or early binding polymorphism
2. In overloading exact match method not available will not rise compile time error immediately
	Compiler promotes this argument to next level of match, means compiler provide 
	automatic promotion
3. Automatic promotion in method overloading: at the compile time exact argument type not match 
	then compiler automatically refer next level of return type
	
	byte=>short=>int=>long=>float=>double
	
	char=> will refer from =>int
4. Exact match highest priority refer case: 2 m2
5. both child and parent argument get matched then ->Child class get highest priority refer null argument example(Object->String)
6. Child class is not available then parent class will be refer
Case 3:
		//m.m3(null);// compile time error because there is no hierarchy between String and StringBuffer both are independent
		// Object -> String
		// Object -> StringBuffer
Case 4: Whenever there is fight between old new version method in java old version method always win
		Var-arg method always get at-least priority, No other method match the var-arg method get chance

Case 5: CE reference to m5 is ambiguous
		CE no suitable method found in m5

Case 6:



*/