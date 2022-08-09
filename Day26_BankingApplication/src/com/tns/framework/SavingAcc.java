package com.tns.framework;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalaried;
	@SuppressWarnings("unused")
	static final private float MINBAL=5000;
	//constructor
	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalaried)
	{
		super(accNo, accNm, accBal);
		
	}
	//method
	public void withdraw (float Rupees)
	{
		System.out.println("Account No is: " +this.getAccNo()+ " Account Name is: "+this.getAccNm()+ " Withdrawal of Rupees: "+Rupees);
	}
	@Override
	public String toString() {
		return String.format("SavingAcc [isSalaried=%s]", isSalaried);
	}
	

}
