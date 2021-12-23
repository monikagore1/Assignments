
public class Contact1 {
	//long phonenumber;
	private String name;
	private String email;
	public enum gender
	{
		male,female
	}
	public Contact1(String name,String email)
	{
		super();
		this.name=name;
		this.email=email;
	}
	public String toString()
	{
		return "Contact[name="+name+",email="+email+"]";
	}
}