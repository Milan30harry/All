package demo;

import java.util.Scanner;

interface message1
{
	public void method1();
	
}
interface message2
{
	public void method2();
}

class N implements message1, message2
{
	public void method1()
	{
		System.out.print("This is method 1 \n");
		System.out.println("Please enter the value of A");
		Scanner s=new Scanner(System.in);
		int A= s.nextInt();
		System.out.println("enter the value of A is = "+A);
	}
	public void method2()
	{
		System.out.println("This is method 2");
	}
}

public class inter {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		N obj=new N();
		obj.method1();
		obj.method2();
	}

}
