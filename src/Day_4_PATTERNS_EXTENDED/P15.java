package Day_4_PATTERNS_EXTENDED;
import java.util.*;
public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter tjhe number of lines :");
		int n=sc.nextInt();
		int row=1;
		int star=n;
		int space=0;
		while(row<=2*n-1) {
			int i=0;
			while(i<space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			if(row<5) {
				space+=2;
				star--;
			}else {
				space-=2;
				star++;
			}
			row++;
			System.out.println();
			
		}

	}

}
