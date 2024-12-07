package com.durga;



public class MethodOverriding {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.Marry(); // parent method get chance
		Child c=new Child();
		c.Marry(); //child is method get chance
		
		Child p1=new Child(); // JVM check which class is object is available
		//run time Polymorphism
		p1.Marry();
		String str="Welcome to java world";
		char ch[]=str.replaceAll(" ", "").toCharArray();
		System.out.println(ch.length);
	}

}
/*
 Method Overloading: Two methods are overloaded in the same class if same method names having different argument types
 1. Reduce complexity
 2. 
 
 
 
 Based on the requirement child class is re-define parent class requirement is called method overriding 
 
 if child class is not happy with parent class implementation he has right to redefine
 extended method in the child class is called method overriding
 in method overridden method resolution always takes care by JVM based on run time object
 not based on reference type hence we called it run time polymorphism or dynamic polymorphism or late binding polymorphism
 Parent ==> Overridden
 child  ==> Overriding

Parent Method : Sharddha
Child Method : Deepika
Child Method : Deepika

data hiding: declaring data members as private we implement data hiding

data hiding's biggest advantage is security.

Abstraction: hiding internal implementation and highlight set of services which we are offering
ad 1. Security
   2. Enhancement become easy
   3. Maintainability
   4. Modularity is improved
Encapsulation: Data hiding + abstraction
Grouping data members and corresponding methods into a single unit is called encapsulation
if any component follows data hiding and abstraction that component said to be encapsulation component
Hiding data behind method is called encapsulation

Ad. 1 Security
	2 Enhancement is easy without affecting outside person
	3 Maintainability and modularity get improved
DisAd : Process become lengthy and every time we require validation

Tightly encapsulated class:
Every data members declare as private such type of class to be called tightly encapsulated class

if parent class is not tightly encapsulated then no child class tightly encapsulated

1. class A{ 
private int a=10 // tightly encapsulated class
}
class B extends A
{ 
int y=20; // not tightly encapsulated class
}
class C extends B{
private int z=23; // tightly encapsulated class
} 
***************************************************
1. class A{ 
int a=10 // not tightly encapsulated class
}
class B extends A
{ 
private int y=20; // not tightly encapsulated class because parent data members access
}
class C extends B{
private int z=23; // not tightly encapsulated class because parent data members access
}

*** Inheritance *******
1. Is-A Relationship
2. Code Re-usability
2. extends keyword

class parent{
public void m1(){
SOP("Parent");
}
class child extends parent{

public void m2(){
SOP("Child"); // child class have 2 methods 1 from parent class
}
}
}
public static void main(String args[]){

case 1:
parent p=new parent();
p.m1();
p.m2(); //we could not able to access in the parent class object(not able to access by using parent class object child class method).
We will get compile time error

case 2: 
child c=new child();
c.m1();
c.m2();

case 3:

parent p=new child();
p.m1();
p.m2(); 1.parent reference can used to hold child class object, but using this reference we can't call child class specific methods
 		2. We can call only parent call methods

case 4:
child c=new parent(); 1. We cannot use child object to hold parent object

Without inheritance example:

class loan{
//300 methods
}
class PLoan{

//300 methods
}

// we have to develops 900 method and we require 90 estimated hours
 
 Using inheritance
 class loan{
 //250 most common methods we have to write here 
 
 }
 class HLoan extends loan{
 // 50 child(HLoan) specific methods
 }
 class PLoan extends loan{
 // 50 child (Ploan) specific methods
 }
 class VLoan extends loan{
 
 // 50 child (Vloan) specific methods
 }
 400 methods only and we require 40 estimated hours
 
 *** total java API class are implemented based on inheritance only
 1.which class access root for all java classes
 => Object
 2.which class access root class for exception hierarchy
 => Throwable class
 3. Exception class is parent class of all exceptions
 4. Error class: Most commonly error method declared in Error class
}

}



*/