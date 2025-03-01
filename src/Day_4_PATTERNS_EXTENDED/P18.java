package Day_4_PATTERNS_EXTENDED;
import java.util.*;
public class P18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();sc.close();
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
				System.out.print("* ");
				j++;
			}
			row++;
			System.out.println();
			if(row<=n/2+1) {
				space--;
				star+=2;
			}else {
				star-=2;
				space++;
			}
			
		}

	}

}
