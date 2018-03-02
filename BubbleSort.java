package Sorting;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter total elments you want in a array");
		int n=scr.nextInt();
		int[] a=new int[n];
		int temp;
		for(int i=0; i<a.length; i++) {
			System.out.println("enter element ");
			a[i]=scr.nextInt();
		}
		
		System.out.println("final array ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		int count;
		for(int i=0; i<a.length ; i++) {
			//count=0;
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j]>a[j+1]) {
					 temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					//count+=1;
				}
				
			}
			
		}
		System.out.println("\n\nsorted array");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		
		}
		
	}

}
