package StreamsFilter;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class demo2 {
	public static void main(String[] args) {
		List<Integer> number=Arrays.asList(10,15,25,41);
		List<Integer> collect = number.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(collect);
}
}
