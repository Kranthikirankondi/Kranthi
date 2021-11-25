package basic_java_programs;

import java.util.Scanner;

public class Even_Odd
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int i = scanner.nextInt();
		
		if(i%2==0)
		{
			System.out.println(i + " is even number");
			
		}
		else
		{
			System.out.println( i + " is odd Number");
		}
		

	}

}
