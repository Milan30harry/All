package demo;
 
abstract class house
{
	public abstract void home();
	
	public void home1()
	{
		System.out.println("Hello this is new home");
	}
}
	
	 class A extends house
	{

		@Override
		public void home() 
		{
			
			System.out.println("This is my first home");
			// TODO Auto-generated method stub
			
		}
	
	}
public class abst {
		public static void main(String[] args) 
		{
		// TODO Auto-generated method stub
			A obj=new A();
			obj.home();
			obj.home1();
		}

}
