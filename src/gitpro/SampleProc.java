package gitpro;

public class SampleProc {
	
	
	 static int a=10;
	 static int b=20;
	public static void main(String[] args) {
		
		SampleProc sp= new SampleProc();
		
		int sum=sp.m1(a, b);
		System.out.println(sum);
		//System.out.println(sp.b);
	}
	
	public int m1(int a, int  b) {
		
       int sum =0;
		sum=a+b;
		 return sum;
		
	}
}
