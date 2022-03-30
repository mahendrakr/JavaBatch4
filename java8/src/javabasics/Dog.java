package javabasics;

/**
 * name-moti color-white breed-pomarian age-9 gender-M height-3ft weight-8.5kg
 * is healthy-yes
 * 
 * run eat bark
 * 
 * @author akjai
 *
 */
public class Dog {
	String name = "Moti";
	String color = "White";
	String breed = "pomarian";
	int age = 9;
	char gender = 'M';
	int height = 3;
	double weight = 8.5;
	boolean isHealthy = true;

	void run() {
		System.out.println("fast");
	}

	void eat() {
		System.out.println("meat egg");
	}

	void bark() {
		System.out.println("bhau bhau");
	}
    String getName() {
    	return name;
    	
    }
    int addNumber(int a, int b) {
    	
    	return a+b;
    }
	public static void main(String[] args) {
		// create an object
		Dog dog = new Dog();
		// call a variable or a method
		System.out.println(dog.name);
		System.out.println(dog.color);
		System.out.println(dog.breed);
		System.out.println(dog.age);
		System.out.println(dog.gender);
		System.out.println(dog.height);
		System.out.println(dog.isHealthy);
		System.out.println(dog.weight);
		dog.run();
		dog.eat();
		dog.bark();
      String name=dog.getName();
    System.out.println(name);   
	int sum=dog.addNumber(5, 7);
	System.out.println(sum);
	}

}
