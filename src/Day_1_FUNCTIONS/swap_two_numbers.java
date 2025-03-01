package Day_1_FUNCTIONS;
import java.util.*;
public class swap_two_numbers{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		System.out.println("Orignal values are a= "+a+" b= "+b);
		swap(a,b);
		{
			int g=69;
			System.out.println("Hemlo");
		}
		System.out.println("The g spot is ");
	}
	static void swap(int a ,int b) {
		int temp=a;
		a=b;
		b=temp;
		System.out.println("The swapped numbers are: a="+a+" ,b= "+b);
	}

}
