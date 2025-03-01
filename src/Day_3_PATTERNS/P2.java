package Day_3_PATTERNS;
import java.util.*;
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter tjhe number of lines :");
		int n=sc.nextInt();
		int row=1;
		int star=1;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
			row++;
			star++;
			
		}
		
	}
}
