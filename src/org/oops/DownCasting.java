package org.oops;

public class DownCasting extends Casting {
	int price3 = 300;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casting c = new UpCasting1();
		if(c instanceof DownCasting)
		{
			DownCasting d = (DownCasting) c;
			System.out.println(d.price3);
		}
		if(c instanceof UpCasting1)
		{
			UpCasting1 d = (UpCasting1) c;
			System.out.println(d.price1);
		}
		System.out.println(c.price);
	}

}
