import java.util.Scanner;

class Venue{
	private String name;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Venue v=new Venue();
		int choice=1;
		System.out.print("Enter the Venue Name: ");
		v.setName(sc.nextLine());
		System.out.print("Enter the city Name: ");
		v.setCity(sc.nextLine());
		while(choice!=3 && choice > 0 && choice < 3) {
		System.out.print("Venue details: \nVenue Name: " + v.getName() +"\n" + "city name: "+ v.getCity());
		System.out.println("\nVerify and update Venue Details\nMenu \n1.Update Venue Name\n" + 
					"2.Update City Name\n" + 
					"3.All informations Correct/Exit\n" + 
					"Type 1 or 2 or 3");
		choice=sc.nextInt();
		sc.nextLine();
		switch(choice) {
		case 1:System.out.print("Enter the Venue Name: ");
			   v.setName(sc.nextLine());
			   break;
		case 2:System.out.print("Enter the city Name: ");
				v.setCity(sc.nextLine());
				break;
		default:System.out.print("Venue details: \nVenue Name: " + v.getName() +"\n" + "city name: "+ v.getCity());
				break;
			
		}
			
		}
		sc.close();
		
	}	
	}