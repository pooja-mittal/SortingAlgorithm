package Sorting;

import java.util.Scanner;

public class QuickSort {
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
		
		quickSort(a,0,a.length-1);
		System.out.println("\n");
		for(int k:a) {
			System.out.print(k + " ");
		}
		
	}
	
	public static void quickSort(int[] a, int l, int h) {
		int i=l;
		int j=h;
		int mid=(i+j)/2;
		int pivot=a[mid];
		while(i<j) {
			while(a[i]<pivot) {
				i++;
			} while(a[j]>pivot) {
				j--;
			}
			
			if(i<=j) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++; j--;
			}
			
		}
		if(j>l)
			quickSort(a,l,j);
		if(i<h) 
			quickSort(a,i,h);
	}
	
}
