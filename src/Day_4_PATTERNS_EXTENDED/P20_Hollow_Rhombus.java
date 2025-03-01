package Day_4_PATTERNS_EXTENDED;
import java.util.*;
public class P20_Hollow_Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		int space=n/2;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				if(j==1 || j==star) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				j++;
			}
			if(row<=n/2) {
				star+=2;
				space--;
			}else {
				star-=2;
				space++;
			}
			row++;
			System.out.println();
		}
	}

}
