package Day_4_PATTERNS_EXTENDED;
import java.util.*;
public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter tjhe number of lines :");
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		int star=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				if(j%2!=0) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				j++;
			}
			System.out.println();
			row++;
			space--;
			star+=2;
		}

	}

}
