package demo;

import java.util.Scanner;

public class Method_Overloading 
{
	//double a,b,c=0;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Please enter the value of a and b");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		double d=sc.nextDouble();
		

		int addd= add(a,b);
		double as=add(c,d);
		int m= add(a,b,c);
		System.out.println("Addition value is ="+ addd);
		System.out.println("Addition double value is ="+ as);
		System.out.println("Addition of 3 element is = "+m);
	}
	static double add(double a,double b)
	{
	 return a+b;
	}
	static int add(int c,int d)
	{
	 return c+d;
	}
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
	
	
}
