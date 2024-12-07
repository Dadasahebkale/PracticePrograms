package com.oops;

public abstract class Bank {
int amount=100;
final int rate=10;
static int loanrate=5;
// partial abstraction
// hiding the implementation logic... is called abstraction
// abstract class can have abstract method and non abstract method
// We can not create the object of the abstract classes


public abstract void loan(); //abstract method .... No body

// Non abstract method
public void credit() {
	System.out.println("Bank.....Credit");
}
public void debit() {
	System.out.println("Benk ..... debit");
}
}
