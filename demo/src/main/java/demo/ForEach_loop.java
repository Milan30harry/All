package demo;

import java.util.Scanner;

public class ForEach_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String[] i = {"Hello","Boy","City"};
		int[] q = {1,2,4,6,9,6,4,3};
		String j = sc.nextLine();
		System.out.println(j);
		
		for(String k:i)
		{
			System.out.println(k);
		}

		for(int l=0;l<q.length;l++)
		//for(int l:q)
		{
			System.out.println("The value is = "+ q[l]);
		}
		System.out.println("Array length is = "+ q.length);
	}

}
