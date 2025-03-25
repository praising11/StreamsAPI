package StreamsFilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class demo3 {

	public static void main(String[] args) {
		
		List<String> words= Arrays.asList("Jeson",null,"Jacob",null,null,"sherin");
        List<String> Result = words.stream().filter(w->w!=null).collect(Collectors.toList());
        System.out.println(Result);

	}

}
