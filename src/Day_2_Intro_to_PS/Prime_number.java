package Day_2_Intro_to_PS;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		boolean a=true;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				a=false;
			}
		}
		if(a) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not prime");
		}
		

	}

}
