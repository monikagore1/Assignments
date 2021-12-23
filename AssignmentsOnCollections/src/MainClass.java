import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MainClass {

	public static void main(String[] args) {
       Map<Long,Contact1> values=new TreeMap<Long,Contact1>().descendingMap(); 
       Long l1=new Long(986068888);
       Long l2=new Long(986068839);
       Long l3=new Long(986062949);
       
       Contact1 c1=new Contact1("abc","abc@gmail.com");
       Contact1 c2=new Contact1("xyz","xyz@gmail.com");
       Contact1 c3=new Contact1("pqr","pqr@gmail.com");
       
       values.put(l1, c1);
       values.put(l2, c2);
       values.put(l3, c3);
       
       Set<Entry<Long,Contact1>> entrySet=values.entrySet();
       for(Entry<Long,Contact1>entry:entrySet)
       {
    	   System.out.println(entry.getKey());
    	   System.out.println(entry.getValue());
    	   System.out.println(entry.getKey()+"::"+entry.getValue());


       
	}
	}

}
