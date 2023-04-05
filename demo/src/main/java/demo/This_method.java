package demo;

public class This_method 
{

	public void a()
	{
		this.b(2, 3, 4);
		System.out.println("This is default methos");
	}
	public void b(int a)
	{
		this.a();
		System.out.println("This is one parameterized method");
	}
	public void a(int a, int b)
	{
		this.b(1,2,3,4);
		System.out.println("This is two parameterized method");
	}
	public void b(int a,int b,int c)
	{
		System.out.println("This is three parameterized method");
	}
	public void b(int a,int b,int c, int d)
	{
		this.b(3);
		System.out.println("This is four parameterized method");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		This_method obj=new This_method();
		obj.a(2,3);

	}

}
