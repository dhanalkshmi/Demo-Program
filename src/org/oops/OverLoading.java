package org.oops;

import java.lang.foreign.AddressLayout;

public class OverLoading {
	protected void add() {
		System.out.println("Addition");
		// TODO Auto-generated method stub

	}

	private void add(int a, int b) {
		// TODO Auto-generated method stub
		int c = a + b;
		System.out.println(c);
	}

	public void add(String a) {
		// TODO Auto-generated method stub
		System.out.println(a);
	}

	int add(int a, int b, int c) {
		int d = a + b + c;
		// System.out.println(d);
		return d;

		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoading o = new OverLoading();
		o.add();
		o.add(5, 6);
		o.add("abc");
		System.out.println(o.add(5, 6, 7));
	}

}
