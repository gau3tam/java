package programming;

import java.util.List;

public class FP02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> courses = List.of("Spring", "Spring Boot", "React", "AWS");
		
		//courses.stream()
		//		 .filter(c -> c.contains("Spring"))
		//		 .forEach(System.out::println);
		
		//courses.stream()
		//		 .filter(c -> c.length()>4)
		//		 .forEach(System.out::println);
		
		courses.stream().map(c -> c + " " +c.length()).forEach(System.out::println);
	}

}
