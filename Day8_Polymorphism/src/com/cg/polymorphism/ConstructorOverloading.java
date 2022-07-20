package com.cg.polymorphism;
//program on constructor overloading
class Triber
{
	int speed;
	String engine;
	//zero parameteraa
	Triber()
	{
		System.out.println("Renault Kiger");
	}
	//two parameter
	Triber(int speed,String engine)
	{
		this.speed=speed;
		this.engine=engine;
		System.out.println("Speed is: "+speed +" an the engine is on:"+engine);
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Triber t=new Triber();
		//Triber t1=new Triber(45,"Diesel");
	}

}
