package Day_2_Intro_to_PS;

public class factors_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(factors(24));
		

	}
	public static int[] factors(int n) {
		int c=0;
		int arr[]=new int[n];
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				arr[c++]=i;
			}
		}
		return arr;
	}
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
