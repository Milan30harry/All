package demo;

import java.util.Scanner;

public class Do_While 
{

	public static void main(String[] args) 
	{ 
		// TODO Auto-generated method stub
		System.out.println("Enter the value which want to execute");
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		
	    int i=0;    
	    do
	    {    
	    	for(i=0;i<value;i++)
	    	{
	    		for(int j=0;j<=i;j++)
	    		{
	    		System.out.print(j);	
	    		}System.out.println();
	    	}i--;
	        //System.out.println(i);    
	       
	    }
	    while(value==0);    
	}    
	  
		
}
	
	


