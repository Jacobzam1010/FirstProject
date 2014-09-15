package push;

import java.util.Scanner;


public class PushEx {

	public static void main(String[] args) {
		 
		//initializing integers num1 and num2.
		int num1, num2;
		
		//Promting user to enter two intergers.
		System.out.println("Please enter two interger numbers one at a time: ");
		Scanner keyboard = new Scanner(System.in);
		
		
		//Reading in two integers.
		num1 = keyboard.nextInt();
		num2 = keyboard.nextInt();
		
		//outputting two integers and all integers between.
		if(num1 > num2)
			do
			{
				System.out.println(num2);
				num2++;
			}
			while(num2 != num1 + 1);
		else
			do
			{
				System.out.println(num1);
				num1++;
			}
			while(num1 != num2 + 1);
		

	}

}
