package Module_12_Arrays;
import java.util.*;
public class Linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the element "+(i+1)+":");
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the target element:");
		int x=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==x) {
				System.out.println("Target found at index "+(i+1));
				break;
			}else {
				System.out.print("Target not present in array");
			}
		}

	}

}
