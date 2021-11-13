package springmvc.pogo;

public class Address {
	
	private String city;
	private String street;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return String.format("Address [city=%s, street=%s]", city, street);
	}
	public Address(String city, String street) {
		super();
		this.city = city;
		this.street = street;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
		
}