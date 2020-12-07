import java.util.Scanner;

interface Car {
	public void sum();

	public void years();

	public void brand();
}

class Service implements Car {
	int carnumber;
	int number_years;
	String car_brand;

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		int sum = 0;
		while (carnumber != 0) {
			sum = sum + (carnumber % 10);
			carnumber = carnumber / 10;
		}
		if (sum % 2 == 0)
			System.out.println("You can come on Tuesday,Thursday or Saturday.");
		else
			System.out.println("You can come on Monday,Wednesday and Friday.");

	}

	@Override
	public void years() {
		// TODO Auto-generated method stub
		if (number_years > 5)
			System.out.println("You are eligible for free washing.");
		else
			System.out.println("You are not eligible for free washing.");
	}

}

/*public class Car_Service 
{
	public static void main(String[] args) 
	{
		Service service=new Service();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your car number:");
		service.carnumber=sc.nextInt();
		System.out.println("Enter how many years do you have car:");
		service.number_years=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter brand ofyour car:");
		service.car_brand =sc.nextLine();
		service.sum();
		service.years();
		service.brand();
		sc.close();
	}
	}*/
        ............................................................................................................................................................................................................00000000000000000000000000000..9 9vvo lp