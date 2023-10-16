package programming;

import java.util.List;
import java.util.function.Function;

public class FP09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(1,3,5,2,4,6,3,5);
		performActionNPrint(numbers, x -> x*x );
	}
	
	private static void performActionNPrint(List<Integer> numbers, Function<Integer,Integer> func)
	{
		numbers.stream()
		.map(func)
		.forEach(System.out::println);//Method Reference
	}
	
//	private static boolean isEven(int n)
//	{
//		return n%2==0;
//	}

}


