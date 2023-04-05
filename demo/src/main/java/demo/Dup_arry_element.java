package demo;

import java.util.Scanner;

public class Dup_arry_element {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		System.out.println("Please enter the vlaue of Array");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		char[] digits = String.valueOf(a).toCharArray();
		System.out.println(digits);
		int c= digits.length;
		System.out.println(c);
		for(int i=0;i<c;i++)
	{
		for(int j=i+1;j<c;j++)
		{
			if(digits[i]==digits[j])
			{
				System.out.println("Dup value is "+ digits[j]);	
			}
			
		}
		}
}}
