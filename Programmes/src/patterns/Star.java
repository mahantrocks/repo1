package patterns;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		
	System.out.println(" enter any number");
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();
	int i,j;
	for(i=1;i<=n;i++) {
		for(j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	for(i=1;i<=n;i++) {
		for(j=n-1;j>=i;j--) {
			System.out.print("*");
		}
		System.out.println("");
	}
	
	

}}
