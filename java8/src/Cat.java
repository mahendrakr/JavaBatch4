
 public class Cat {
	String name = "Blacky";
	   String color = "Blue";
	   String breed = "Russian Blue";
	   int age = 2;
	   char gender = 'F';
	   int height = 1;
	   double weight = 2.5;
	   boolean isCute = true;

	   void run() {
	            System.out.println("fast");
	   }
	   
	   void drink() {
	             System.out.println("milk");
	   }


	   void bark() {
		   System.out.println("meow meow");
	   }

	   public static void main(String[] args) {
	          // create an object
	          Cat cat = new Cat(); 
	          // call a variable  or a method 
	          System.out.println(cat.name);
	          System.out.println(cat.color);
	          System.out.println(cat.breed);
	          System.out.println(cat.age);
	          System.out.println(cat.gender);
	          System.out.println(cat.height);
	          System.out.println(cat.weight);
	          cat.run();
	          cat.drink();
	          cat.bark();
	        		  
}
}


