package tp3exosYaip4;
public class Person {
	public String name;
	public String address;
	
	public Person(String name, String address) {
		this.name=name;
		this.address=address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	@Override
	public String toString() {
		return "Person[name=" + name + " address=" + address + "]";
	}
	
	public static void main(String[] args) {
		Person t1 = new Person("Donald", "Washington");
		System.out.println(t1);
		System.out.println(t1.getName());
		System.out.println(t1.getAddress());
	}
}