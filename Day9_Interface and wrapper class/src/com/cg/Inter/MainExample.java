package com.cg.Inter;
interface Vehicle
{
	void speed();
}
interface Car extends Vehicle
{
	void engine();
}
class Bus implements Car
{
	public void engine()
	{
		System.out.println("Petrol");
	}
	public void speed() {
		System.out.println("Speed is 40km/hr");
	}
}
public class MainExample {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		Bus b=new Bus();
		b.engine();
		b.speed();

	}
}
