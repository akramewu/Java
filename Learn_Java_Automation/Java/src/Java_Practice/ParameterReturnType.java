package Java_Practice;

public class ParameterReturnType {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      ParameterReturnType obj = new ParameterReturnType();
      int sum = obj.sum(4, 5);
      System.out.println("Print sum: "+ sum);
      
      int sub = obj.sub(5, 5);
      System.out.println("Print sub: "+ sub);
	}
	
	public int sum(int a, int b)
	{
		int c = a+b;
		return c;
		//System.out.println("Sum of c is : " + c);
	}
	
	public int sub(int a, int b)
	{
		int c = a-b;
		return c;
		//System.out.println("Sub of c is : " + c );
	}

}
