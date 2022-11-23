package streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Inheritance.Child1;

public class StreamApiTest {

	public static void main(String[] args) {

		List<Dish> menu = Arrays.asList(
				new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT),
				new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), 
				new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER), 
				new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH), 
				new Dish("salmon", false, 450, Dish.Type.FISH));
		// Q.1-> Fetch all vegetarian dish.
		// menu.stream().filter(d->d.isVegetaeian()).limit(2).collect(Collectors.toList()).forEach(System.out::println);
		// Q.2-> Fetch first two high calorie dish .
		// Comparator<? super T> comparator
		// Comparator<Dish> sort=(d1,d2)-> d2.getCalories()-d1.getCalories();
		// menu.stream().sorted(sort).limit(2).collect(Collectors.toList()).forEach(System.out::println);
		// Q.3-> Print All dish name.
		// menu.stream().map(di->di.getName()).collect(Collectors.toList()).forEach(System.out::println);
		// Q.4-> Count total avalable dish.
		long count = menu.stream().count();
		System.out.println(count);
	}
}
