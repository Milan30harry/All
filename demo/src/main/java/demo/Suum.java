package demo;

import java.util.Scanner;

public class Suum {
	int sum=0,sub=0,mul=0,a,b;
	public int sum(int a, int b)
	{		
		sum=a+b;
		return sum;
	}
	public int sub(int a, int b)
	{
		sub=a-b;
		return sub;
	}
	public void mul(int a, int b)
	{
		mul = a*b;
		System.out.println("Totlat result is = "+mul);
	}

	public static void main(String[] args) 
	{
		System.out.println("Please enter the value of a and b");
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		System.out.println("enter the value of a is = "+a+"  b is ="+b);
		// TODO Auto-generated method stub
		Suum obj=new Suum();
		int sum= obj.sum(a, b);
		int sub=obj.sub(a,b);
		obj.mul(sum, sub);
		

	}

}
