package demo;

import java.util.Scanner;

public class ob1 {
		  public void fullThrottle() 
		  {
		    System.out.println("The car is going as fast as it can!");
		  }
		  public void speed(int maxSpeed) 
		  {
		    System.out.println("Max speed is: " + maxSpeed);
		  }
		  public static void main(String[] args) 
		  {
		    ob1 myCar = new ob1();   // Create a myCar object
		    myCar.fullThrottle();  
		    Scanner sc=new Scanner(System.in);
		    int a= sc.nextInt();// Call the fullThrottle() method
		    myCar.speed(a);          // Call the speed() method
		  }
		}

