package org.oops;

public class Constructor1 {
	static int a = 10;
	int b = 20;

	Constructor1() {
		System.out.println("i am a constructor");
	}
	Constructor1(int c) {
		System.out.println("i am a param constructor");
	}

	static {
		System.out.println("Static Initializer");
	}
	{
		System.out.println("Non static initializer");
	}

	public static void meth1() {
		// TODO Auto-generated method stub
		System.out.println("Static method");
	}

	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("Non static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method");
	
		Constructor1 c1 = new Constructor1(10);
		c1.meth2();
		meth1();
		System.out.println(a);
	}

}
