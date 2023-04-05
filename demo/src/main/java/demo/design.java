package demo;

import java.util.Scanner;

public class design {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the string which you want to print");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		System.out.println("Enter string is = "+ a);
		
		System.out.println("Please enter the string which you want to print");
		String b = sc.nextLine();
		System.out.println("Enter string is = "+ b);
		
		/*
		System.out.println("enter string length is "+ a.length());
		System.out.println("Enter string upper case is "+ a.toUpperCase()); 
		
		
		
		System.out.println("Find 4th word in string is = "+ a.indexOf("4th"));
		System.out.println("Enter value match is = " + a.contains("4th"));
		
		
		System.out.println("compait two string is"+ a.compareTo(b));
	*/
		String c = a+b;
		int d=0;
		System.out.println(c);
		System.out.println("Enter the value of d = "+ d);
		Scanner s= new Scanner(System.in);
		int g = sc.nextInt();
			
		System.out.println("Value squar is " +Math.sqrt(g));
	
	}

}
