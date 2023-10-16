package programming;

import java.util.Comparator;
import java.util.List;

public class FP05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> courses = List.of("Spring", "Spring Boot", "React", "AWS");
		
	
		//courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
		
	}

}
