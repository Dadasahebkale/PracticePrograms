package com.statickeyword;

public class StaticKeyword {
	public static void main(String[] args) {
		
		//static : modifier
		//A single copy of a variable/method is created and shared
		// this class "Owns" the static member
		Friend friend1=new Friend("Ganesh");
		Friend friend2=new Friend("Oviya");
		Friend friend3=new Friend("Pranavi");
		Friend friend4=new Friend("Pranav");
		
		Friend.displayFriend();
	}

}
