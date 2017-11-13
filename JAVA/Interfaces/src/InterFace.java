
class InterFace {

	public static void main(String[] args) {

		Dog dg = new Dog();
		dg.displayAge();
		Animal ani = new Cat();
		ani.sound();
		Animal ani2 = new Dog();
		ani2.sound();
	}
}
