package demo2;

import java.util.Scanner;

public abstract class class1 {
	
	public abstract void cla();
	public void detail()
	{
		System.out.println("This is class1 detail method");
		
		System.out.println("Please enter the value of a and b");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a+b;
		System.out.println("Print value of c is = "+c);
		
	}

}
