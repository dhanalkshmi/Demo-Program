package org.oops;

public class EncapSulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapSulation e = new EncapSulation("sutha",91);
		System.out.println(e.getName());
		System.out.println(e.getMark());
		e.extra();
		e.setName("Priya");
		System.out.println(e.getName());
		e.setName("Mala");
		System.out.println(e.getName());
		
	}

}
