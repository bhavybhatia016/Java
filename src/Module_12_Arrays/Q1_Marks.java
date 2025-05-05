package Module_12_Arrays;
import java.util.*;
public class Q1_Marks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of students: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the marks of roll no. "+(i+1)+":");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<35) {
				System.out.println("Roll no. "+(i+1)+" has marks less than 35");
			}
		}
	}
}
