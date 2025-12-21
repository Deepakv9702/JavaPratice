package com.flm;

import com.flm.db.Database;
import com.flm.cart.Cart;

public class Test2 {
	
	static int age =10; /////static variable
	String name = "deepak";
	int height = 6;
    int salary = 1234567890;

	public static void main(String[] args) {
		
		Test2 T = new Test2();
		System.out.println(T.height); /////object for the height because it is not a static
		
		Test2 T2 = new Test2();
		System.out.println(T2.name); ////obejct for the name because it is not a static 
		
		System.out.println(age); ////directly we can access because it is a static 
		
		Test2 T3 = new Test2();
		System.out.println(T3.salary);
				
		Database d = new Database();
		d.connect(); //////////////////this method is used for calling from the other method 
	
		Cart.add();
		
		
		Cart c = new Cart();
		System.out.println(c.price);
				
		
	}
	
}


