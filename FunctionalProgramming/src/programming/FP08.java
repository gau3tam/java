package programming;

import java.util.List;
import java.util.function.BinaryOperator;

public class FP08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumAll(List.of(1,3,5,2));
	}
	
	private static void sumAll(List<Integer> numbers)
	{
		BinaryOperator<Integer> accumulator = Integer::sum;
		BinaryOperator<Integer> accumulatorImpl = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return t + u;
			}
			
		};
				
		
		int sum = numbers.stream()
				 		.reduce(0, accumulatorImpl);
		
		
		System.out.println(sum);
	}
	
	
}


