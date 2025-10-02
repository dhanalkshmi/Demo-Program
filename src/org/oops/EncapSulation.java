package org.oops;

public class EncapSulation {
	private String name;
	private double mark;

	public EncapSulation(String name, int mark) {
		this.name = name;
		this.mark = mark;

		// TODO Auto-generated constructor stub
	}

	public void extra() {
		// TODO Auto-generated method stub
		mark = mark + 5;
		System.out.println(mark);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
