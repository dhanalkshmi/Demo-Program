package org.oops;

import java.util.Scanner;

public class ScanNerClas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String name = sc.next();
	    sc.nextLine();   
		System.out.println("Enter second name");
		String name2 = sc.nextLine();
		System.out.println("Enter true or false");
		boolean b = sc.nextBoolean();
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Enter salary");
		float f = sc.nextFloat();
		System.out.println("Enter tax");
		double d = sc.nextDouble();
		System.out.println("Enter phone number");
		long l = sc.nextLong();
		System.out.println("Enter a letter");
		char a = sc.next().charAt(0);
		System.out.println(name);
		System.out.println(name2);
		System.out.println(b);
		System.out.println(age);
		System.out.println(f);
		System.out.println(d);
		System.out.println(l);
		System.out.println(a);
	}

}
