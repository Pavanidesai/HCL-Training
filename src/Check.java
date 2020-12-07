

public class Check {
	int a,b;
	void calculate(int a,int b)
	{
		this.a=a;
		this.b=b;
		try
		{
			if(b==0)
			{
				System.out.println((a/b));
				
			}
			else
			{
				System.out.println("Cost of the item per day is:"+(a/b));
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.toString());
		}
	}

}