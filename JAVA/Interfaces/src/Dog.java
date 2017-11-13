
public class Dog implements Animal {

	private final int age;

	Dog() {
		age = 10;
	}

	void displayAge() {
		System.out.println("The dogs age is " + age);
	}
	@Override
	public void sound() {
		System.out.println("Woof");
		
	}
	
		
}
