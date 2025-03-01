package Day_4_PATTERNS_EXTENDED;

import java.util.Scanner;

public class P17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter tjhe number of lines :");
		int n=sc.nextInt();sc.close();
		int row=1;
		int star=n/2;
		int space=1;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			if(row<=n/2) {
				star--;
				space+=2;
			}else {
				star++;
				space-=2;
			}
			row++;
			System.out.println();
					
		}

	}

}
