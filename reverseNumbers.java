package demo;

import java.util.Scanner;

public class reverseNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = sc.nextInt();
		int rem = 0;
		
		while(num > 0) {
			
			rem = (rem * 10) + num % 10;
			num = num / 10;
			
		}
		
		System.out.println("The reversed number is " + rem);
		
		if (num != rem)
		{
			System.out.println("It is not palindrome");
	    }
		else 
		{
			System.out.println("It is palindrome");
		}
		
		
 }
}
