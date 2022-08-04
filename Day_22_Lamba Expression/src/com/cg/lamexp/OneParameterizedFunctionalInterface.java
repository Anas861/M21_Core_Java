package com.cg.lamexp;
// functional interface uses only one abstract method
interface B
{
	//One Parameterized abstract method
	String print (String str);
}
public class OneParameterizedFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lambda expression
		B obj=(String str)->
		{
			return str;
		};
		System.out.println(obj.print("Lambda Expression")); 

	}

}
