package Swapping;

import java.util.Scanner;

public class Reverse_Number {
	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	System.out.println(" Enter any number");
	 int n=sc.nextInt();
	int temp=n;
	int rev=0;
	 while(n!=0) {
		rev=rev*10+(n%10);
		n=n/10;
	 
	
	 
	 }
	 if(temp==rev) {
		 System.out.println("it is an palindrome");
	 }
	 else {
		 System.out.println("its not a polindrome");
	 }
	 
	 
	 
	 
	 System.out.println(rev);


}}