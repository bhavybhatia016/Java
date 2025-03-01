package Day_2_Intro_to_PS;

public class sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=24,ans=1;
		for(int i=1;i*i<=n;i++) {
			ans=i;
			
		}
		System.out.println(ans);
		System.out.println(Math.sqrt(n));

	}

}
