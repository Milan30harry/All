package demo;

import java.util.Scanner;

public class Shorthand {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		System.out.println("Enter the value and check the result");
		Scanner sc = new Scanner(System.in);
		int s=sc.nextInt(); 
		int d=sc.nextInt();
		System.out.println((s<d)?"hello":"bye");
	}

}
