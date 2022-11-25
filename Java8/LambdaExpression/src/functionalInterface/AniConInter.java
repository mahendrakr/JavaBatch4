package functionalInterface;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class AniConInter {

	public static void main(String[] args) {

		List<AnimalConsumer> ls = new LinkedList<>();
		ls.add(new AnimalConsumer("cow",121 ,5000, 8000));
		ls.add(new AnimalConsumer("dog",122 ,2000, 0));
		ls.add(new AnimalConsumer("goat",123 , 3000, 4000));

		// Predicate
		Predicate<Integer> pr = e -> e>= 1000;

		// Function
		Function<AnimalConsumer, Integer> fn = e -> {
			return (e.investment- e.reciving );
		};
		// COnsumer
		Consumer<AnimalConsumer> cn = t -> {
			System.out.println(t.anmae);
			System.out.println(t.id);
			System.out.println(t.investment);
			System.out.println(t.reciving);
		};
         
		for (AnimalConsumer ac : ls) {
			 cn.accept(ac);
			int increaseInvestment = fn.apply(ac);
			
			if (pr.test(increaseInvestment)) {
              cn.accept(ac);
              System.out.println(increaseInvestment);
			}

		}

	}
}