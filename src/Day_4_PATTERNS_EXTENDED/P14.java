package Day_4_PATTERNS_EXTENDED;
import java.util.*;
public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter tjhe number of lines :");
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		int star=1;
		while(row<=2*n-1) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			row++;
			System.out.println();
			if(row<=5) {
				star++;
				space--;
			}
			else {
				star--;
				space++;
			}
		}

	}

}
