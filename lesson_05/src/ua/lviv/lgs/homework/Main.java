package ua.lviv.lgs.homework;

public class Main {
	public static void main(String[] args) {
		
		
		// I home task
		Cow cow = new Cow();
		cow.voice();

		Cat cat = new Cat();
		cat.voice();

		Dog dog = new Dog();
		dog.voice();

		// II home task
		
		Cat c = new Cat();
		System.out.println(c);
		

		// III home task
		
		Frog frog = new Frog();
		Amphibia f2 = (Amphibia)frog;
		frog.eat();
		f2.eat();
		
		frog.sleep();
		f2.sleep();
		
		frog.swim();
		f2.swim();
		
		frog.walk();
		f2.walk();
		
		
		
	}
	
}
