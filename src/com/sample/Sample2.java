package com.sample;

public class Sample2 {
	static int a;
	int b;

	private void sampleMethod() {
		// TODO Auto-generated method stub
		b=15;
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		a = 20;
	
		System.out.println(a);
		
		Sample2 s = new Sample2();
		Sample2 s1 = new Sample2();
		System.out.println(s.b);
		s.b=30;
		s1.b=10;
		System.out.println(s.b);
		s.sampleMethod();
		System.out.println(s1.b);
	}

}
