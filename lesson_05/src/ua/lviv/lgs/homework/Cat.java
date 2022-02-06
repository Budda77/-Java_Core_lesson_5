package ua.lviv.lgs.homework;

public class Cat extends Pet{
	
	public String name;
	public int age;
	public String color;
	
	public Cat() {
		this(2, "white");
	}
	
	public Cat(int age, String color) {
		this("Borya", age, color);
	}

	
	public Cat(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}
	


	@Override
	void voice() {
		System.out.println("I am cat Mayuuu - Mayuuu");
		
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", color=" + color + "]";
	}

	


}
