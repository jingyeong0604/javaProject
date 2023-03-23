package chp7_prac;

public class AbstractMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat=new Cat();
		cat.sound();
		
		animalSound(new Dog());
		animalSound(new Cat());
	}

	private static void animalSound(Animal animal) {
		animal.sound();
		
	}

}
