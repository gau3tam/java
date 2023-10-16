package programming;

import java.util.List;

public class FP03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumAll(List.of(1,3,5,2));
	}
	
	private static void sumAll(List<Integer> numbers)
	{
		int sum = numbers.stream()
						//0 and (a,b) -> a + b -- FP03::sum
						// .reduce(0, FP03::sum);
				//.reduce(0, (x,y) -> x + y);
				.reduce(0, Integer::sum);
		System.out.println(sum);
	}
	
	private static int sum(int aggregate, int nextNumber)
	{
		System.out.println(aggregate + " " + nextNumber);
		return aggregate + nextNumber;
	}

}


