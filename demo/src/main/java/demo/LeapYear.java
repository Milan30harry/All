package demo;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter the year which you want to check");
		Scanner sc = new Scanner(System.in);
		int year=sc.nextInt();
		
		if((year%400==0)||(year%100!=0)&&(year%4==0))
				{
			System.out.println("Entered year is leap year");
				}
		else
			{
				System.out.println("Enter year is not a leap year");
			
			}
		
	}

}
