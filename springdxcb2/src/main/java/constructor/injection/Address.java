package constructor.injection;

public class Address {
	String City;
	String State;
	String Country;
	public Address(String City, String State, String Country) {
		super();
		this.City = City;
		this.State = State;
		this.Country = Country;
	}
	
	@Override
	public String toString() {
		return "City is "+City +"\n"+"State is "+State+"\n Country is "+Country;
	}

}
