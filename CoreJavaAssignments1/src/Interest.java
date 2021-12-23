// calculating simple and compound interest
import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int p, t; //p=principal, t=time
		float ac,as, r;//ac=amount of compound interest, as= amount of simple interest,r= rate of interest
		System.out.println("enter the principal amount");
		p = s.nextInt();
		System.out.println();
		System.out.println("enter the rate if interest:");
		r=s.nextFloat();
		System.out.println();
		System.out.println("enter the time period in years:");
		t=s.nextInt();
		System.out.println();
		System.out.println("Results:-");
		System.out.println("Principal amount:" +p);
		System.out.println("Rate of interest:" +r);
		System.out.println("Time peroid of years:" +t);
		float si=p*r*t/100;
		System.out.println("simple interest: "+si);
		as=p+si;
		System.out.println("Amount : " +as);
		float ci=(float) (p*Math.pow(1+r/100,t)); //math.pow is function for power to base formula
		System.out.println("Compound Interest: " +ci);
		ac=p+ci;
		System.out.println("Amount: "+ac);
		
		
		
		
		

	}

}
