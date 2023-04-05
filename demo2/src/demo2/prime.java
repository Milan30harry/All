package demo2;

import java.util.Scanner;

public class prime {
	
	public void prime()
	{
		try
		{
		int num;
		System.out.println("Please enter the number which you want to check");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		System.out.println("Enter number is = "+num);
		int half=num/2;
		int n=0;
		for(int i=2;i<=half;i++)
		{
			if(num%i==0)
			{
				System.out.println("Enter number"+half +"is not a prime number");
			n=1;
			break;
			}
		}
	
		
		if(n==0)
		{
		System.out.println("Enter number "+num +" is a prime number");
		}
	}
	catch(Exception i)
	{
	System.out.println("fgh");	
	}}
	public void palindrom()
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int old_number=num;
		while(num>0)
		{
			int check=num%10;
			sum=sum*10+check;
			num=num/10;
			
		}
		if(old_number==sum)
		{
			System.out.println("Enter number is palindrome = "+ old_number);
		}
		else
		{
			System.out.println("Enter number is not palindrome = "+old_number);
		}
	}
	
	public void armistrom()
	{
		int sum=0,num;
		System.out.println("Please enter the number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int old_number = num;
		while(num>0)
		{
			int r=num%10;
			sum=sum+r*r*r;
			num=num/10;
		}
		if(old_number==sum)
		{
			System.out.println("Enter number "+old_number+ " is a armistrome");
		}
		else
		{
			System.out.println("Enter number is not a armistrom");
		}
		
	}
	
	public void feb()
	{
		int a=0;int b=1;
		System.out.println("Enter the range of series");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(a+" "+b);
		
		for(int i=1; i<n;i++)
		{
			int sum=a+b;
			System.out.print(" "+sum);
			a=b;
			b=sum;
		}
	}

	public static void main(String[] args)
	{ int num=0;
		// TODO Auto-generated method stub
		prime a=new prime();
		a.prime();
		a.palindrom();
		a.armistrom();
		a.feb();

	}

}
