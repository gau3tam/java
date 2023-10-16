package programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doubleList(List.of(1, 3, 5, 2, 4, 6, 3, 5));

	}

	private static void doubleList(List<Integer> numbers) {

		// Functional
		Predicate<Integer> evenPredicate = n -> n % 2 == 0;
		
		Predicate<Integer> evenPredicateImpl = new Predicate<Integer>()
				{
					@Override
					public boolean test(Integer n) {
						return n % 2 == 0;
					}
			
				};
		Function< Integer, Integer> squareMapper = x -> x * x;
		
		Function< Integer, Integer> squareMapperImpl = new Function< Integer, Integer>()
				{

					@Override
					public Integer apply(Integer x) {
						return x * x;
					}
			
				};
		
		Consumer<Integer> sysoutConsumer = System.out::println;
		
		Consumer<Integer> sysoutConsumerImpl = new Consumer<Integer>(){

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
			
		};
		numbers.stream()
				// .filter(FP01::isEven)
				.filter(evenPredicateImpl)
				.map(squareMapperImpl)
				.forEach(sysoutConsumerImpl);
	}

}
