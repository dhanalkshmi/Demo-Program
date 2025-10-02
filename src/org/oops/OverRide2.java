package org.oops;

public class OverRide2 extends OverRiding {
	@Override
	public void car() {
		// TODO Auto-generated method stub

		System.out.println("BMW");
	}

	public void bike() {
		// TODO Auto-generated method stub
		System.out.println("bike");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverRide2 o = new OverRide2();
		o.car();
		o.cycle();
		o.bike();
	}

}
