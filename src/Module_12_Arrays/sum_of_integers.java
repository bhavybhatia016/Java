package Module_12_Arrays;

import java.util.Scanner;

class sum_of_integers {

    public static void main(String[] args) {
        // write your code logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sum(arr));
    }
    public static int sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
        }
        return sum;
    }
}