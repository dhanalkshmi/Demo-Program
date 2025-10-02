package org.oops;

public class ConstChaining extends ConstChainSuper {
	ConstChaining() {
		super();
		System.out.println("Empty");
		// TODO Auto-generated constructor stub
	}

	ConstChaining(int age) {
		super(age);
		System.out.println(age + "sub class");
	}

	ConstChaining(String name, int age) {
		this(age);
		System.out.println(name + " " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstChaining c1 = new ConstChaining();
        ConstChaining c = new ConstChaining("Geetha", 23);
	}

}
