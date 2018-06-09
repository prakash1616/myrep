package gitpro;

import java.util.Scanner;

public class SampleProc {
	
	
	
	public static void main(String[] args) {
		
		SampleProc sp= new SampleProc();

		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b =sc.nextInt(); 
		int sum=sp.m1(a,b);
	    System.out.println(sum);
	}
	
	public int m1(int a,int b) {
		
       int sum =0;
		sum=a+b;
		 return sum;
		
	}
}
