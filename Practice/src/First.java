import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class First {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("karthik","jyothi","shravani","advik"); 
		names.stream().map(x->x.substring(0, 3)).forEach(System.out::println);
		
		AtomicInteger ai = new AtomicInteger(0);
		
		ai.incrementAndGet();
		System.out.println(ai);
	}

}
