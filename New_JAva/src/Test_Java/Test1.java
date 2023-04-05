package Test_Java;
import java.util.*;


public class Test1 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
		int a=0, b=0, i,j;
		//System.out.println("Enter the value of a is ="+ a);
		
		System.out.println("Enter the value of a");
		a= sc.nextInt(); 
		System.out.println("Enter the value of a is ="+ a);
		System.out.println("Enter the value of b");
		b = sc.nextInt();
		System.out.println("Enter the value of b is ="+ b);
		//System.out.println("Hello World");

		/*for(i=a;i<=b;i++)
		{
			for(j=0;j<=a;j++)
			{
				System.out.print(j);
			}
			System.out.println(i);
		} */
		
		for(i=0;i<=b;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		String s = "This is a test for a string length";
		System.out.println("the value of whole sting 'This is a test for a string length' is =" + s.length());
	}
}
