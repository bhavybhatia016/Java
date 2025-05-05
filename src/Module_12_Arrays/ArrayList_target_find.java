package Module_12_Arrays;
import java.util.*;
public class ArrayList_target_find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++) {
            int num=sc.nextInt();
            arr.add(num);
        }
        int tar=sc.nextInt();
        int ans=arrlist(arr,tar);
        System.out.println(ans);

	}
	public static int arrlist(ArrayList<Integer> arr,int target) {
        for(int i=0;i<arr.size();i++) {
            if(arr.get(i)==target){
                return i;
            }
        }
        return -1;
    }

}
