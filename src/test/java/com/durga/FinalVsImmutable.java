package com.durga;

public class FinalVsImmutable {

	public static void main(String[] args) {
		final StringBuffer sb=new StringBuffer("Oviya");
		sb.append("Scientiest from the dhole patil school of excellence");
		System.out.println(sb);
		//sb=new StringBuffer("Ganesh");  //we will get compile time error
		// we cannot assign new value if we declare as final variable as final
		//immutable concept is about not variable
		//final talks about terminology variable
		//immutability is about object
		
		
		// 1. final variable
		// 2. Immutable object
		
		// String: if contains are fixed then we can refer String
		// In String we cann't change the contain
		// length and capacity are same in the string
		// in string every change then new object is created
		// hence we require more memory
		// String is slow and memory consuming when are changing the object
		// StringBuffer: if contains are keep on changing then we can refer StringBuffer
		// All required changes performed in the single object only
		// Every new changes then not new object is created
		// Memory efficient and faster compare to string
		// Length and capacity both concept are different
		System.out.println(sb.capacity());
		//StringBuffer
		StringBuffer s=new StringBuffer();
		//Empty constructor contain 16 characters
		// if 16 character get filled then another object is created with bigger size with new capacity of +17 characters internally
		System.out.println(s.capacity());
		s.append("abcdefghijklmnop");
		//System.out.println(s.capacity());
		s.append("q");
		s.append("abcdefghijklmnop");
		s.append("q");
		s.append("r");
		System.out.println(s.capacity());
		//Empty constructor contain 16 characters
		
		StringBuffer b=new StringBuffer(1000);
		System.out.println(b.capacity());
		StringBuffer sk=new StringBuffer("Oviya");
		System.out.println(sk.capacity());//16+5
		
		StringBuffer u=new StringBuffer("OviyaKale");
		// setCharAt(int index, char, new char )
		System.out.println(u.charAt(3));//y
//**imp	System.out.println(u.charAt(67));//StringIndexOutOfBoundsException: Index 67 out of bounds for length 5
	
		u.setCharAt(2, 'D');
		System.out.println(u);//OvDyaKale
		
		StringBuffer t=new StringBuffer();
		//append(String s)
		//append(int i)
		//append(byte b)
		//append(long l)
		//append(float f)
		// we can call it as method overloaded
		t.append("This is pi value is :");
		t.append(3.14);
		t.append(false);
		t.append("Circle value");
		System.out.println(t);
		
	// Insert(int index, String s)
		StringBuffer ind=new StringBuffer("abcdefgh");
		ind.insert(2, 12);
		System.out.println(ind);
		
	//delete(int begin, int end)
		//from begin index to end -1 index
		ind.delete(2, 5);
		System.out.println(ind);
	//deleteCharAt(int index);
		ind.deleteCharAt(3);
		System.out.println(ind);
	//reverse
		ind.reverse();
		System.out.println(ind);
		
	//setLength(int length)
		ind.setLength(3);
		System.out.println(ind);
		StringBuffer len=new StringBuffer("AishwaryaAbhi");
		len.setLength(9);
		System.out.println(len);
	//ensureCapacity(int capacity)
		//need empty constructor
		StringBuffer ec=new StringBuffer();
		ec.ensureCapacity(2000);
		System.out.println(ec.capacity());
	//trimToSize() is used to deallocate extra memory
		StringBuffer r=new StringBuffer(1000);
		r.append("abc");
		r.trimToSize();
		System.out.println(r.capacity());
	}

}
