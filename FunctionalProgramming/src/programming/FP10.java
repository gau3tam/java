package programming;

import java.util.List;
import java.util.function.Function;

public class FP10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> numbers = List.of(1.0,2.0);
		numbers.add(null);
		performActionNPrint(numbers );
	}
	
	private static void performActionNPrint(List<Double> numbers)
	{
		numbers.stream()
		.map(o -> o == null ? 0.0 : o.doubleValue())
		.forEach(System.out::println);//Method Reference
	}
	
//	private static boolean isEven(int n)
//	{
//		return n%2==0;
//	}

}


