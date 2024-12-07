package com.durga;

public class InhertanceTest {

	public static void main(String[] args) {
		// case 1
		Parent p=new Parent();
		p.Property();
		p.Marry();
		
		// case 2
				Child c=new Child();
				c.Property();
				c.Marry();
		
		// case 3
		Parent p1=new Child();
		p1.Property();
		p1.Marry();
		
	
	}

}
