import java.util.Scanner;
public class Test {
	final int Platinum =200,Diamond =150,Gold = 100,Tv=10000;
	Long cost;
	static int squareFeet;
	static int numberOfTV;
	static String name;
	static String detail;
	static String ownerName;
	static String tv;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stalls s=new Stalls(name, detail, ownerName);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the stall:");
		name=sc.nextLine();
		System.out.println("Enter the detail of the stall:");
		detail=sc.nextLine();
		System.out.println("Enter the owner name of the stall:");
		ownerName=sc.nextLine();
		System.out.println("Enter the type of the stall:");
		String stallType=sc.nextLine();
		System.out.println("Enter the size of the stall in square feet:");
		squareFeet=sc.nextInt();
		sc.nextLine();
		System.out.println("Does the hall have TV?(y/n)");
		tv=sc.nextLine();
		switch(tv)
		{
		case "Y":
			System.out.println("Enter the number of TV:");
			numberOfTV=sc.nextInt();
			double val=s.computeCost(stallType, squareFeet, numberOfTV);
			System.out.println(val);
			break;
		case "N":
			double d=s.computeCost(stallType, squareFeet);
			System.out.println(d);
			break;
			
			
		}
		sc.close();
	}
    
}
