package exceptionhandling;
import exceptionhandling.Prom2;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter two numbers");
		String s1=s.nextLine();
		String s2=s.nextLine();
		Prom2 ob=new Prom2();
		
		try {
			ob.division(s1,s2);
		}
		catch(ArithmeticException ae) {
			System.out.println("dont enter zero in denominator");
		}
		catch(NumberFormatException nfe) {
			System.out.println("dont enter spacel symbol for int values");
		}
		finally {
			System.out.println("i am in final block");
		}

	}

}
