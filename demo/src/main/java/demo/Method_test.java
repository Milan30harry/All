package demo;

import java.util.Scanner;

public class Method_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//add();
		//mul(4,5);
		//test("milan", 30);
		checkage(2);
		
	}
/*	static void add()
	{
		System.out.println("Please add two variable for addition");
		Scanner ad = new Scanner(System.in);
		int a = ad.nextInt();
		int b = ad.nextInt();
		int c = a+b;
		System.out.println("Addition value is "+ c);
	}
*/
	/* static void mul(int a, int b)
	{
		System.out.println("Please enter two variable for multipcation");
		Scanner ad = new Scanner(System.in);
		 a = ad.nextInt();
		 b = ad.nextInt();
		int c = a*b;
		System.out.println("Addition value is "+ c);
	}
	*/
	/*static void test(String name, int age)
	{
		System.out.println("Please enter the age and name value");
		Scanner ag = new Scanner(System.in);
		age = ag.nextInt();
		name = ag.next();
		System.out.println( "Please enter the name and age value = "+name +" age is "+age);
		
	}
	*/
	static int checkage(int age)
	{
		System.out.println("Please enter the age value");
		Scanner s=new Scanner(System.in);
		age = s.nextInt();
		if(age<10)
		{
			System.out.println("baby");
		}
		else if(age<20)
		{
			System.out.println("Hello Budy");
		}
		else
		{
			System.out.println("Please enter value b/w 0 to 20");
		}
			return age;
	}

}
