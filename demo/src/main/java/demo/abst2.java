package demo;

abstract class Animal
{
	public abstract void Animal();
	
	public void sleep()
	{
		System.out.println("This is just a check for abstract class");
	}
	
}

class pig extends Animal
{
	public void Animal()
	{
		System.out.println("This is a pig class");
	}
	
}


public class abst2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		pig obj=new pig();
		obj.Animal();
		obj.sleep();

	}

}
