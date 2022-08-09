package com.tns.framework;

public abstract class CurrentAcc extends BankAcc 
{
	//fields
	static private final float creditLimit=100000;
	//constructor
	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) 
	{
		super(accNo, accNm, accBal);
	}
	public void withdraw (float Rupees)
	{
		System.out.println("Account No is: "+this.getAccNo()+ " Account Name is: "+this.getAccNm()+ " Withdrawal of Rupees: "+(Rupees+creditLimit));
	}
	@Override
	public String toString() {
		return String.format("CurrentAcc [creditLimit=%s]", creditLimit);
	}
	

}
