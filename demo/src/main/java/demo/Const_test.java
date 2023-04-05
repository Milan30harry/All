package demo;

import java.util.Scanner;

public class Const_test {
	
	String a;
	int b;
	public Const_test()
	{
		a="hello";
		b=10;
	}
	
	public Const_test(String Year, int b1)
	{
		a= Year;
		b= b1;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Please enter the value of i= text and j = value");
		Scanner sc = new Scanner(System.in);
		String i=sc.next();
		int j=sc.nextInt();
		Const_test c=new Const_test(i,j);
		Const_test d=new Const_test();
		System.out.println("This is single parameter const value = "+d.b+" test = "+d.a);
		System.out.println("This is the parameter const value = "+c.a+" test2 = "+c.b);

	}

}
