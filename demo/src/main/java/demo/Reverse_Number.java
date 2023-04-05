package demo;

import java.util.Scanner;

public class Reverse_Number 
{
	int a=0;
	String str="";
	public int reverse(int num)
	{
		int a=0;
		System.out.println("Please enter the number a"+a);
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("enter number is a = "+a);
		while(a>0)
		{
			{  
				int reverse = 0;  
				
				while(a != 0)   
				{  
				int remainder = a % 10;  
				reverse = reverse * 10 + remainder;  
				a = a/10;  
				}  
				System.out.println("The reverse of the given number is: " + reverse);  
				}  
			
		}
		return num;
		
	}

	public static void reverse_for()
	{
		System.out.println("Please enter the string which you want to reverse");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println("Enter string is = "+ s);
		//String string = "Dream big";    
        //Stores the reverse of given string    
        String reversedStr = "";    
            
        //Iterate through the string from last and add each character to variable reversedStr    
        for(int i = s.length()-1; i >= 0; i--){    
            reversedStr = reversedStr + s.charAt(i);    
        }    
            
        System.out.println("Original string: " + s);    
        //Displays the reverse of given string    
        System.out.println("Reverse of given string: " + reversedStr); 
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=0;
		String s="";
		Reverse_Number rev=new Reverse_Number();
		//rev.reverse(a);
		rev.reverse_for();
		

	}

}
