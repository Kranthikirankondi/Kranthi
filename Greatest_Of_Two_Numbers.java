package basic_java_programs;

import java.util.Scanner;

public class Greatest_Of_Two_Numbers
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Starting Number : ");
		int i = scanner.nextInt();
		
		System.out.println("Enter the ending Number : ");
		int j = scanner.nextInt();
		
		if(i>j)
		{
			System.out.println(i+" is the Greatest Number");
		}
		else
		{
			System.out.println(j+" is  Greatest number");
		}
	}

}
