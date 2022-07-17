package com.cg.inheritance;

class Bike
{
	public int speed=50;
	void speed()
	{
		System.out.println("The speed of Bike is: "+speed+"km/hr");
	}	
}
//inheritance
class Pulsar extends Bike
{
	void average()
	{
		System.out.println("Good");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pulsar p=new Pulsar();
		p.speed();
		p.average();
	}

}
