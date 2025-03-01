package Day_1_FUNCTIONS;
import java.util.*;
public class return_types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum());

	}
	static int sum() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number1 :");
		int a=sc.nextInt();
		System.out.print("Enter number2 :");
		int b=sc.nextInt();
		return a+b;
		
	}

}
