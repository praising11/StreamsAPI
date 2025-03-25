package StreamMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args) {
		//Multiply the number using stream
		
		List<Integer> numbers=Arrays.asList(5,3,6,9,4);
		List<Integer> multipliednumber=new ArrayList<Integer>();
		
		/*
		 * multipliednumber = numbers.stream().map(n->n*3).collect(Collectors.toList());
		 * System.out.println(multipliednumber);
		 */
		//numbers.stream().map(n->n*3).forEach(System.out::println);
		numbers.stream().map(n->n*3).forEach(n->System.out.println(n));
	}

}
