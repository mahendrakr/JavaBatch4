package homework;

public class Cat {
 String name="tom";
 String color="black";
 int height=3;
 char gender='m';
 String breed="persian";
 boolean isHealthy=true;
 double weight=5;
 void run() {
	 System.out.println("fast");
 }
 void jump() {
	 System.out.println("high");
 }
 void eat() {
	 System.out.println("fish");
 }

public static void main(String[] args) {
Cat cat = new Cat();
    System.out.println(cat.name);
    System.out.println(cat.breed);
	System.out.println(cat.gender);
	System.out.println(cat.height);
	System.out.println(cat.weight);
	System.out.println(cat.isHealthy);
	System.out.println(cat.color);
    cat.eat();
    cat.jump();
    cat.run();
}

	
	
	
}


