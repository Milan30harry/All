package Test_Java;
import java.lang.*;
import java.util.Scanner;
 
public class Type_Cast {
	
	public static void oddeven(int A)
	{ 
		
		if(A%2==0)
		{
			System.out.println("Number A is a even and value is "+A);
			
		}
		else
		{
		System.out.println("Number A is a odd and value is "+A);
		}
	}
		
	
	
	public static void main(String[] args) 
	{
		int A=0,B=0,C=0;
		Scanner var= new Scanner(System.in);
		
		System.out.println("Please enter the value of A" +A);
		A= var.nextInt();
		System.out.println("Please enter the value of B"+B);
		B= var.nextInt();
		
		System.out.println("Enter value of A is = "+ A + "  Enter value of B is = "+B);
		//reads string.
		
		// TODO Auto-generated method stub
		/*int a=10;
		double b= a;
		System.out.println("the value of a is = "+ a);
		System.out.println("The value of b is ="+ b);
		
		int c = a+200;
		double d=c+10;
		long e = c+20;
		System.out.println("The value of c is ="+ c);
		System.out.println("The value of d is = "+ d);
		System.out.println("The value of e is ="+ e);
		
		//Type_cast y= new oddeven(); */
		oddeven(A);
		
	}
	
	
		
		
	}


