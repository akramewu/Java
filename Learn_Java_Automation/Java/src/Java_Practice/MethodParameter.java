package Java_Practice;

public class MethodParameter {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       MethodParameter obj = new MethodParameter();
       obj.sum(5, 6);
       obj.sub(6, 5);
       obj.multi(5, 6);
       obj.div(7, 5);
	}
	
	public void sum(int a, int b)
	{
		int c = a+b;
		System.out.println("Sum of c is : " + c);
	}
	
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("Sub of c is : " + c );
	}
	
	public void multi(int a, int b)
	{
		int c = a*b;
		System.out.println("Multi of c is : " + c );
	}
	
	public void div(double a, double b)
	{
		double c = a/b;
		System.out.println("Division of c is : "+ c);
	}

}
