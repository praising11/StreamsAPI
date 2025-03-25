package StreamsFilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class demo1 {

	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("Praising","praise","Daffene","dad");
		List<String> collect = names.stream().filter(name->name.length()>6 && name.length()<=8).collect(Collectors.toList());
  System.out.println(collect);
	}

}
