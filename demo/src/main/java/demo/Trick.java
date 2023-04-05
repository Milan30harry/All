package demo;

import java.util.Scanner;

public class Trick {

	public int tric1(int a)
	{
		System.out.println("Please enter the number b/w 1 to 9");
		Scanner s=new Scanner(System.in);
		 a=s.nextInt();
		 if((a>0)&&(a<10))
		 {
			int b= a*3;
			int c= b*3;
			System.out.println("Total given value is ="+ c);
			while(c>0)
			{
				int sum=0;
				int num=c;
				int d=c%10;
				sum = sum+d;
				num = num/10;
				int value=sum+num;
				if(value==9)
				{
					System.out.println("Total number digits sum is = "+ value);
					break;
				}
			}
			
		 }
		 return a;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Trick t=new Trick();
		t.tric1(1);
		

	}

}
