package com.durga;

final class OwnImmutableClass {
	// all immutable class access modifier will final
	// no one can change immutable class
	private int i;
	OwnImmutableClass(int i){
		this.i=i;
	}
	public OwnImmutableClass modify(int i) {
		if(this.i==i) {
			return this;
		}else {
			return new OwnImmutableClass(i);
		}
	}

	public static void main(String[] args) {
		OwnImmutableClass o=new OwnImmutableClass(10);
		OwnImmutableClass o1=o.modify(100);
		OwnImmutableClass o2=o.modify(10);
		System.out.println(o==o1);
		System.out.println(o==o2);
		

	}

}
