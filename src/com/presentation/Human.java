package com.presentation;

import java.net.CookieHandler;

public class Human {
	double height;
	int weight;
	static String location;

	public static void cook() {
		// TODO Auto-generated method stub
		System.out.println("cook");
	}

	public static void cook2(String abc, int m) {
		// TODO Auto-generated method stub
		System.out.println("Item name" + abc + "members" + m);
	}

	private double jump(double cm) {
		// TODO Auto-generated method stub
		return cm;
	}

	public void walk() {
		height = 5.3;
		// TODO Auto-generated method stub
		System.out.println("Can Walk");
		System.out.println(height);
	}

	private void dance() {
		// TODO Auto-generated method stub
		System.out.println("Can dance");
	}

	protected void work() {
		// TODO Auto-generated method stub
		System.out.println("Can Work");
	}

	void run() {
		System.out.println("Run");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h = new Human();
		System.out.println(h.height);
		h.walk();
		h.dance();
		h.work();
		h.run();
		h.cook2("Dosa", 2);
		System.out.println(h.jump(8.5));
	}

}
