package com.tns.framework;

public abstract class BankAcc 
{
	private int accNo;
	private String accNm;
	private float accBal;
	//constructor
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	//getters & setters method for private variables
	public int getAccNo() {
		return accNo;
	}
	//abstract method withdraw
	public void withdraw (float Rupees)
	{
		System.out.println("Withdraw successful of Rs: "+Rupees);
	}
	public void deposite (float Rupees)
	{
		System.out.println(Rupees+"/- Deposited successfully");
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	//to StringMethod
	@Override
	public String toString() {
		return String.format("BankAcc [accNo=%s, accNm=%s, accBal=%s]", accNo, accNm, accBal);
	}
	
	

}
