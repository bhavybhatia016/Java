package Day_2_Intro_to_PS;
import java.util.*;
public class factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int arr1[]=factors(n);
			for(int i=1;i<arr1.length;i++) {
				if(arr1[i]!=0) {
					System.out.print(arr1[i]+" ");
				}
			}
	}
	public static int[] factors(int n) {
		int arr[]=new int[n];
		arr[0]=1;
		int c=1;
		for(int j=1;j<=n;j++) {
			if(n%j==0) {
				arr[c++]=j;
				}
			}

		return arr;
	}

}
