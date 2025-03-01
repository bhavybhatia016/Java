package Day_1_FUNCTIONS;
import java.util.Scanner;
public class function_demo {
	public static void main(String[] args) {
		sum();
	}
	static void sum() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		int sum=a+b;
		System.out.println("The sum of Two Numbers is: "+sum);
	}

}
