package Sorting;

import java.util.Scanner;

public class InsertionSort {

			public static void main(String[] args) {
			Scanner scr = new Scanner(System.in);
			System.out.println("enter total elments you want in a array");
			int n = scr.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				System.out.println("enter element ");
				a[i] = scr.nextInt();
			}

			System.out.println("final array ");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			
			
			for(int i=0; i<a.length; i++) {
				int min=i;
				for(int j=i+1; j<a.length; j++) {
					
					if(a[min]>a[j]) {
						min=j;
					}
				}
						int temp=a[min];
						a[min]=a[i];
						a[i]=temp;
					
				
			}
			
			System.out.println("\n\nsorted array");
			for(int i=0; i<a.length; i++) {
				System.out.print(a[i] + " ");
			
			}
			
		}
	}


