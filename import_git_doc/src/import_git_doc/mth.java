package import_git_doc;


public class mth {
	
	public int div(int a, int b)
	{
		int c=a/b;
		System.out.println("div result is "+c);
		return c;
	}
	public int sub (int a1, int b1)
	{
		int c1=a1-b1;
		System.out.println("sub rsult is "+c1);
		return c1;
	}
	public int sum (int a2 ,int b2)
	{
		int c2=a2+b2;
		System.out.println("sum is the result "+c2);
		return c2;
	}
	public void multi(int a3,int b3)
	{
		int result;
		result=a3*b3;
		System.out.println("Final result is " +result);
	}
	
	public static void main(String[] args) 
	{
	mth fl=new mth();
	int divresult=fl.div(10,2);
	int subresult=fl.sub(divresult,2);
	int sumresult=fl.sum(subresult,2);
	int subresult2=fl.sub(sumresult,2);
	fl.multi(subresult2,2);
		}
	}
