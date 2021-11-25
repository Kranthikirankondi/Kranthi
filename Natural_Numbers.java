package basic_java_programs;

import java.util.Scanner;

public class Natural_Numbers 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Starting Number : ");
		int i = scanner.nextInt();
		
		System.out.println("Enter the ending Number : ");
		int j = scanner.nextInt();
		
		for(int k =i; k<=j; k++)
		{
			System.out.println(k);
		}

	}

}
