package com.indiabix.enum1;

public class Example3 {
enum Bike
{
	Honda,Pulser,KTM,R3,R15;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=Bike.Honda;
		switch(b)
		{
		case Pulser:
			System.out.println("You choose Pulser");
			break;
		case KTM:
			System.out.println("You choose KTM");
			break;
		case R3:
			System.out.println("You choose R3");
			break;
			
		case R15:
			System.out.println("You choose R15");
			break;
			
		default:
			System.out.println("Invalid name");
		}

	}

}
