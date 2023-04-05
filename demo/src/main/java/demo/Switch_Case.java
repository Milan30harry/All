package demo;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the value of day");
		Scanner s=new Scanner(System.in);
		int day=s.nextInt();
		int day1=0;
		day=day1;
		switch(day)
		{
		case 1:
			System.out.println("Today is Monday");
			break;
		case 2:
			System.out.println("Today is Tuesday");
			break;
		case 3:
			System.out.println("Today is Wednesday");
			break;
		case 4:
			System.out.println("Today is thrusday");
			break;
		case 5: 
			System.out.println("Today is Friday");
		case 6:
			System.out.println("Today is saturday");
			break;
		case 7:
			System.out.println("Today is sunday");
			break;
			default :
				System.out.println("Please enter a rite value");
			
			}
		
	}}


