package Module_12_Arrays;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<> (10);
		arr.add(0,234);
		arr.add(1,34);
		arr.add(2,1);
		arr.add(3,45);
		arr.add(4,78);
		arr.add(5,4);
		arr.add(6,3);
		arr.add(7,2);
		arr.add(8,2454);
		arr.add(9,69);
		System.out.println(arr);
		System.out.println(arr.get(3));
		arr.set(4, 2005);
		arr.add(689);
//		System.out.println(arr);
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i)+" ");
		}
		
// I want to increase the size of arrayList and insert element at index 12
		arr.add(6745);
		arr.add(789999);
		arr.remove(4);
		System.out.println("\n"+arr.size());
		System.out.println(arr);
	}

}
