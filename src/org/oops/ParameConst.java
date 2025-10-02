package org.oops;

public class ParameConst {
	String acno;
	String name;
	double bal;
	static String ifsc;
	static int count;

	{
		System.out.println("nonstatic initializer");
		this.acno = "ICICI" + ++count;
	}
	static {
		System.out.println("Account creation");
		System.out.println("***************************");
	}

	ParameConst() {
		System.out.println("Default constructor");
		// TODO Auto-generated constructor stub
	}

	ParameConst(String name, double bal, String ifsc) {

		this.name = name;
		this.bal = bal;
		this.ifsc = ifsc;
		System.out.println("Account created");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameConst p1=new ParameConst();
		System.out.println(p1.acno);
		ParameConst p = new ParameConst("sheela", 10000000, "ABC5656565");
		System.out.println(p.acno);
		System.out.println(p.name);
		System.out.println(p.bal);
		System.out.println(ifsc);

	}

}
