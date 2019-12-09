
public class Person{

	private String name, address;

	public Person(String name, String address)
	{
		setName(name);
		setAddress(address);
	}
	public Person()
	{
		setName("Unknown");
		setAddress("Unknown");
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getName() { return name; }

	public String getAddress() { return address; }

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}