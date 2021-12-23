import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
       Function<String,Integer> function=(t)->t.length();
       System.out.println(function.apply("Hello word"));
	}

}
