package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = doubleList(List.of(1,3,5,2,4,6,3,5));
		System.out.println(numbers);
	}
	
	private static List<Integer> doubleList(List<Integer> numbers)
	{
	
		//Functional
		return numbers.stream()
		//.filter(FP01::isEven)
		.filter(n -> n%2 == 0)
		.map(x -> x * x)
		.collect(Collectors.toList());
	}
	
}


