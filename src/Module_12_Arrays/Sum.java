package Module_12_Arrays;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,789,4,5,34,356,343543,543,54,3,5,3,567};
		int sum=0,product=1;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			product*=arr[i];
		}
		System.out.println("Sum & product of the given array is "+sum +" & "+product );

	}

}
