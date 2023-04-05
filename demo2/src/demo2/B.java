package demo2;

import java.util.Scanner;

public class B implements interface1 
{ 
	int a,b,c=0;
	public void add()
	{
		System.out.println("This is a code add");
	}
	public void sub()
	{
		System.out.println("This is sub");
	}
	public int add(int a, int b)
	{
		c= a+b;
		System.out.println("Total a and b sum is ="+c);
		return c;
	}
	public int sub(int a, int b)
	{
		c= a-b;
		System.out.println("Total a and b sum is ="+c);
		return c;
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Please enter the value of a and b");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		B obj=new B();
		obj.add(a,b);
		obj.sub(a,b);
		obj.add();
		obj.sub();
		sc.close();

	}
	

}
