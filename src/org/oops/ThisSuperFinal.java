package org.oops;

public class ThisSuperFinal extends SuperClas {
    int b1=100;
	int a = 10;
	private void accessKey() {
		// TODO Auto-generated method stub
		int a = 20;
		Integer in=a;
		Integer inte=Integer.valueOf(200);
		int o=inte;
		int c;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisSuperFinal t=new ThisSuperFinal();
		t.accessKey();
		int b2;
		b2=200;
		t.b1=500;
		b2=1000;
	}

}
