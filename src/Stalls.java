
public class Stalls {
	protected String name, detail, ownerName;

	public Stalls(String name, String detail, String ownerName) {
		super();
		this.name = name;
		this.detail = detail;
		this.ownerName = ownerName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Double computeCost(String stallType, Integer squareFeet) {
		switch(stallType)
		{
		case "Platinum":
			int value = 200;
			return Double.valueOf(value * squareFeet);
		case "Diamond":
			int value1 = 150;
			return Double.valueOf(value1 * squareFeet);
		case "Gold":
			int value2 = 100;
			return Double.valueOf(value2 * squareFeet);
		}
		return null;		
	}

	public Double computeCost(String stallType, Integer squareFeet, Integer numberOfTV) {
		switch(stallType)
		{
		case "Platinum":
			int value = 200;
			return Double.valueOf((value * squareFeet) + (numberOfTV * 10000));
		case "Diamond":
			int value1 = 150;
			return Double.valueOf((value1 * squareFeet) + (numberOfTV * 10000));
		case "Gold":
			int value2 = 100;
			return Double.valueOf((value2 * squareFeet) + (numberOfTV * 10000));
			
		}
		return null;
		
	}

}
