package Module_12_Arrays;

import java.util.Scanner;

class HelloWorld {

    public static void main(String[] args) {
        // write your code logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        for(int j=0;j<n;j++){
            if(arr[j]==target){
                System.out.println(j);
            }else{
                System.out.println("-1");
            }
        }
    }
}