/*
-----------------------------------------------------------------------------------------------------------
File name		: Calculator.java
Author			: Anup Jacob
Created Date	: 16/10/2021
Modified Date	: 16/10/2021
Description		: A sample program to do the calculator function in Java for CI tools testing purpose
			 	  The functionalities includes are addition, subtraction, multiplication, division and modulus.Added whitesource. 

-----------------------------------------------------------------------------------------------------------
*/
package Calc;

import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter the First number to be calculated : ");
		double num1 = input.nextDouble();
		
		System.out.println("Enter the Second number to be calculated : ");
		double num2 = input.nextDouble();
		
		System.out.println("Enter the Calculation operation to be done: ");
		String oper = input.next();
				
		System.out.println("");
		
		double result = 0;
		
		//System.out.println("Before If");
		if(oper.equals("+"))
			{
			result = num1 + num2;
			System.out.println("Addition Operation successful");
			}
		else if (oper.equals("-"))
			{
			result = num1 - num2;
			System.out.println("Subtraction Operation successful");
			}
		else if (oper.equals("*"))
			{
			result = num1 * num2;
			System.out.println("Multiplication Operation successful");
			}
		else if (oper.equals("/"))
			{
			result = num1 / num2;
			System.out.println("Division Operation successful");
			}
		else if (oper.equals("%"))
			{
			result = num1 % num2;
			System.out.println("Modulus Operation successful");
			}
		else
			System.out.println("Wrong Choice");
		
		input.close();
		
		//System.out.println("The Calculation Operation is :"+Symbol);
		System.out.println("\nThe result of the operation is :"+result);
		
		System.out.println("\nThank you for using my Calculator application");
		
	}

}
