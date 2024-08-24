package com.stream;

import java.util.ArrayList;
import java.util.List;

class Product {
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class FilterDemo {

	public static void main(String[] args) {
	List<Product> productList=new ArrayList<Product>();
	productList.add(new Product(121,"Lenevo",45000));
	productList.add(new Product(122,"HP",30000));
	productList.add(new Product(123,"Dwell",25000));
	productList.add(new Product(124,"Sony",35000));
	productList.add(new Product(125,"Assure",50000));
	
	productList.stream().filter(s->s.price>=35000)
						.forEach(p->System.out.println(p.name));
	}

}
