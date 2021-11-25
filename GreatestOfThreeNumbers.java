package basic_java_programs;

import java.util.Scanner;

public class GreatestOfThreeNumbers 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int i = scanner.nextInt();
		
		System.out.println("Enter the Second Number : ");
		int j = scanner.nextInt();
		
		System.out.println("Enter the Third Number : ");
		int k = scanner.nextInt();
		
		if((i>j)&&(i>k))
		{
			System.out.println(i+" is big value ");
			
		}
		else if(j>k)
		{
			System.out.println(j+" is the big value");
			
		}
		else
		{
			System.out.println(k+" is the big value");
		}

	}

}
