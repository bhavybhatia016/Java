package Module_12_Arrays;

public class max_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,34,56,78,95,4,7,789,56,9800};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
// OR
			max=Math.max(max, arr[i]);
		}
		System.out.println("Max element is "+max);
	}

}
