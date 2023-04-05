package import_git_doc;

public class assign3 {
	

	public assign3() 
	{
		this(1,2,3);
		System.out.println("Default Constructor");
	}

	public assign3(int a) 
	{
		this();
		System.out.println("One parameterized  Constructor");
	}
	public assign3(int a, int b) 
	{
		this(1,2,3,4);
		System.out.println("Two parameterized constructor");
		}
	public assign3(int a, int b, int c) 
	{
		System.out.println("Three parameterized constructor");
	
	}
	public assign3(int a, int b, int c, int d) 
	{
		this(1);
		System.out.println("Four parameterized constructor");
	
	}
	public static void main(String[] args) 
	{
		
		assign3 obj1=new assign3(1,2);
	}

}
