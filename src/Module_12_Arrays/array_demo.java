package Module_12_Arrays;
import java.util.*;
public class array_demo {
	public static void main(String[] args){
		 Scanner sc=new Scanner(System.in);
		    System.out.print("Enter the size of array :");
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++) {
		      arr[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++) {
		      System.out.print(arr[i]+" ");
		    }
	}
}
