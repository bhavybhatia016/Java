package Day_4_PATTERNS_EXTENDED;

import java.util.Scanner;

public class P16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter tjhe number of lines :");
		int n=sc.nextInt();sc.close();
		int row=1;
		int space=n-1;
		int star=n;
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
			if(row<5) {
				space--;
				star--;
			}else {
				space++;
				star++;
			}
			row++;
			System.out.println();
		}

	}

}
