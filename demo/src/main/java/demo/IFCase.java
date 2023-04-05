package demo;

import java.util.Scanner;

public class IFCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A,B,C,D;
		System.out.println("Please enter value of a and b and c and d");
		Scanner a= new Scanner(System.in);
		A= a.nextInt();
		Scanner b= new Scanner(System.in);
		B= b.nextInt();
		Scanner c= new Scanner(System.in);
		C= c.nextInt();
		Scanner d= new Scanner(System.in);
		D = d.nextInt();
		System.out.println();
		
		if(A<B)
		{
			System.out.println("Good Morning Milan");
		}
		else if(B<C)
		{
			System.out.println("Good Evening Mailn");
						
		}
		else if(C<D)
		{
			System.out.println("Good Night");
		}
		else 
		{
			System.out.println("Good noon");
		}
		

	}

}
