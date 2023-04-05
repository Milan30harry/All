package demo;

import java.util.Scanner;

public class ob2 {

	public void apple(String name,int price)
	{
		System.out.println("Please enter the value which you want to enter");
		Scanner sc = new Scanner(System.in);
		 name = sc.next();
		System.out.println("Fruits name is  = "+ name);
		System.out.println("Please enter the Price value ");
		 price = sc.nextInt();
		System.out.println(name+" price is  = "+ price);
		System.out.println("Fruit is "+name + " and price value is "+ price);
	}
	
	public static void main(String[] args) 
	{
		String name ="hello";
		int price=1;
		// TODO Auto-generated method stub
		ob2 f=new ob2();
		f.apple(name, price);

	}

}
