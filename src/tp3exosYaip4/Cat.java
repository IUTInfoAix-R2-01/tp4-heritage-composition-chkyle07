package tp3exosYaip4;
public class Cat extends Mamma1{
	public Cat(String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Meow");
	}
	
	public String toString() {
		return "Cat[name=" + name + "]";
	}
}