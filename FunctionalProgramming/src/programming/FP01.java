package programming;

import java.util.List;

public class FP01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAllNumbersInList(List.of(1,3,5,2,4,6,3,5));
	}
	
	private static void printAllNumbersInList(List<Integer> numbers)
	{
		//Structured
//		for (int n:numbers)
//		{
//			System.out.println(n);
//		}
		
		//Functional
		numbers.stream()
		//.filter(FP01::isEven)
		.filter(n -> n%2 == 0)
		.map(x -> x * x )
		.forEach(System.out::println);//Method Reference
	}
	
//	private static boolean isEven(int n)
//	{
//		return n%2==0;
//	}

}


