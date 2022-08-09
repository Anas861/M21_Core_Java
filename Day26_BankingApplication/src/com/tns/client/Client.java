package com.tns.client;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		BankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(861, "Anas", 200, true);
		CurrentAcc c=new MMCurrentAcc(681, "Sara", 20000, 6000);
		//for SavingAcc
		System.out.println("Saving account: ");
		s.withdraw(s.getAccBal());
		//for CurrentAcc
		System.out.println("Current account: ");
		c.deposite(c.getAccBal());
		System.out.println(s);
		System.out.println(c);
	}

}
