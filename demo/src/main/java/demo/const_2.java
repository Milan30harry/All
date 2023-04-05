package demo;

public class const_2 {
	public const_2()
	{
		this(3,3,3);
		System.out.println("Hello this is default const");
	}
	public const_2(int a)
	{
		this();
		System.out.println("This is one parameterized const");
	}
	public const_2(int a, int b, int c)
	{
		
		System.out.println("This is Three parameterized const");
	}
	public const_2(int a, int b)
	{
		this(2,3,4,5);
		System.out.println("This is two parameterized");
	}

	public const_2(int a, int b, int c, int d)
	{
		this(1);
		System.out.println("This is four parameterized");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		const_2 A=new const_2(2,2);
		

	}

}
