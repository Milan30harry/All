package demo;


public class local_global {

	final int a= 22,b=89;
	
	public void a()
	{
		this.a(2,7,6);
		//a=123;
		System.out.println("This is default methos"+a);
	}
	public void a(int a)
	{
		this.a();
		a=32;
		int b= this.a;
		
		System.out.println("This is one methos"+a +"Global is "+ this.a);
	}
	public void a(int a, int b)
	{
		this.a(1,2,3,4);
		System.out.println("This is two methos"+a+b);
	}
	public void a(int a, int b, int c)
	{
		
		System.out.println("This is Three methos"+a+b+c);
	}
	public void a(int a, int b, int c, int d)
	{
		this.a(1);
		System.out.println("This is Four methos"+a+b+c+d);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		local_global obj=new local_global();
		obj.a(2, 3);

	}

}
