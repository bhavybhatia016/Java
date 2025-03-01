package Day_4_PATTERNS_EXTENDED;
import java.util.*;
public class P28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
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
			int j=1,c=row;
			while(j<=star) {
				System.out.print(c+" ");
				if(j<star/2+1) {
					c++;
				}else {
					c--;
				}
				j++;
			}
			row++;
			star+=2;
			space--;
			System.out.println();
		}

	}

}