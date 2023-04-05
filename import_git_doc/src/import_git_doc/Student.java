package import_git_doc;

public class Student
{
	int age;
	int roll_no;
public void dis1()
{
	System.out.println("Welcome to all of you");
}
public void dis2()
{
	System.out.println("automation is very easy");
}

public static void main(String[] args) 
{
Student	id=new Student();
id.age=10;
System.out.println(id.age);
id.dis1(); //calling first method
id.age=12;
System.out.println(id.age);

id.roll_no=420;
System.out.println(id.roll_no);
id.dis2(); //calling second method
id.roll_no=421;
System.out.println(id.roll_no);

}

}
