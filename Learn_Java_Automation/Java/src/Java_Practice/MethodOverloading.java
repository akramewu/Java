package Java_Practice;

public class MethodOverloading {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      MethodOverloading obj1 = new MethodOverloading();
      obj1.add();
      obj1.add(2, 2);
      obj1.add(1, 2, 3);
	}
	
	public void add()
	{
		int a=2; int b=2;
		int c = a+b;
		System.out.println("The sum of c is : " + c);
	}
	public void add(int a, int b) //MethodO overloading
	{
		int c = a + b;
		System.out.println("The sum of c is : " + c);
	}
	
	public void add(int a, int b, int d) //Method overloading 
	{
		int c = a + b + d;
		System.out.println("The sum of c is : " + c);
	}

}
