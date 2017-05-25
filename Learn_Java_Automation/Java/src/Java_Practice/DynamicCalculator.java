package Java_Practice;

public class DynamicCalculator {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      CalculatorMethod obj = new CalculatorMethod();
      int sum = obj.sum(5, 5);
      int sub = obj.sub(5, 5);
      int multi = obj.multi(5, 5);
      double div = obj.div(5, 5);
      
      System.out.println("Restult of Sum :" + sum);
      System.out.println("Restult of Sub :" + sub);
      System.out.println("Restult of Multi :" + multi);
      System.out.println("Restult of Div :" + div);
	}

}
