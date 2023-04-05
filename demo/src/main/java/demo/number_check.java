package demo;

import java.util.Scanner;

public class number_check {

	public static void main(String[] args) 
	{
			    //Scans in integer   
			        Scanner stdin = new Scanner(System.in);
			        System.out.println("Enter in a number: ");
			        int number = stdin.nextInt();

			        //Set sum to zero for reference
			        int sum = 0;
			        int num = number; //Set num equal to number as reference

			        //reads each digit of the scanned number and individually adds them                                  together
			        //as it goes through the digits, keep dividing by 10 until its 0.
			        while (num > 0) {
			            int lastDigit = num % 10; 
			            System.out.println(lastDigit);
			            sum = sum + lastDigit;
			            //System.out.println("Sum is "+sum);
			            num = num/10;
			            //System.out.println("num is "+num);
			        }System.out.println("Sum is "+sum);
			    }
		// TODO Auto-generated method stub

	}
