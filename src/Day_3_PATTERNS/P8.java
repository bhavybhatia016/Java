package Day_3_PATTERNS;
import java.util.*;
public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter tjhe number of lines :");
		int n=sc.nextInt();
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<=n) {
				if(row==i || row+i==n+1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				i++;
			}
			System.out.println();
			row++;
		}

	}

}
