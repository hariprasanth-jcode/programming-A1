package array;

import java.util.Scanner;

public class Prog1 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Sized of the Array");
		int size=scan.nextInt();
		
		System.out.println("Enter the Elements");
		int[] a=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		
		display(a);
		reverse(a);
		display(a);
	}
	
	public static void display(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void reverse(int []a) {
		int start=0;
		int end=a.length-1;
		
		while(start<end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
	}
}
