package com.java8;

public class Test {

	public static void main(String[] args) {
		
		
		/*
		 * MyInterface mi = new AddImp();
		 * 
		 * int result = mi.add(2, 5);
		 * 
		 * System.out.println(result);
		 */
		
		//implementation of functional interface can be done by lambda expression
		//
		
		MyInterface mi  = (int a,int b) -> {return a+b;};           //lambda expression
 		int result = mi.add(3, 9);
		System.out.println(result);
		mi.m2();                      //default method can be called only by creating object or by implementing the interface in the class.
		
		MyInterface.m1();            //static method from interface
		
		
		
		
		/*
		 * FunctionalInterface fi = (String s1) -> {System.out.println(s1);};
		 * fi.display("Nitesh");
		 */
		
		FunctionalInterface fi = System.out::println;         //method reference scope operator
		fi.display("Nitesh");
		
		
		
		
		/*
		 * FunctionalInterface fi = ()->{return "Nitesh";}; 
		 * String s1 = fi.get();
		 * System.out.println(s1);
		 */
		/*
		 * FunctionalInterface fi = ()->{return 5>3;}; 
		 * boolean a = fi.isValid();
		 * System.out.println(a);
		 */
		/*
		 * FunctionalInterface fi = (long n)->{return false;}; boolean a =
		 * fi.verify(430000); System.out.println(a);
		 */
		
		

	}

}
