//6
import java.util.ArrayList;
import java.util.function.UnaryOperator;

class Op implements UnaryOperator<String>
{

	@Override
	public String apply(String str) {
		// TODO Auto-generated method stub
		return str.toUpperCase();
	}
	
}
public class ReplaceTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		ArrayList<String> list = new ArrayList<>();
	      list.add("Java");
	      list.add("Hello");
	      list.add("Word");
	      list.add("apple");
	      list.add("OpenNLP");
	      System.out.println("Contents of the list: "+list);
	      list.replaceAll(new Op());
	      System.out.println("Contents of the list after replace operation: \n"+list);
		

	}

}
