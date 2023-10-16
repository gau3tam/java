package programming;

import java.util.List;

public class FP04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		squareAndSum(List.of(1,3,5));
		distinctSorted(List.of(1,2,3,4,3,2,3,5,6,1));
	}
	
	private static void squareAndSum(List<Integer> numbers)
	{
		System.out.println(numbers.stream().map(x -> x*x).reduce(0, (x,y) -> x + y));
	}

	private static void distinctSorted(List<Integer> number)
	{
		number.stream().distinct().sorted().forEach(System.out::println);
	}
}


