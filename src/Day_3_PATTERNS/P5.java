package Day_3_PATTERNS;
import java.util.*;
public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter tjhe number of lines :");
		int n=sc.nextInt();
		int row=1;
		int space=0;
		int star=n;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print(" *");
				j++;
			}
			row++;
			System.out.println();
			space++;
			star--;
		}

	}

}
