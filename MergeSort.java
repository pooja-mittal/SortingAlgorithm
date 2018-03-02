package Sorting;

import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter total elments you want in a array");
		int n = scr.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter element ");
			a[i] = scr.nextInt();
		}

		System.out.println("array ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		merge(a);
		
	}
	
	public static void merge(int[] a) {
		if(a.length==1)
			return ;
		int mid=a.length/2;
		int[] right =new int[a.length-mid];
		int[] left=new int[mid];
		for(int i=0; i<mid; i++) {
			left[i]=a[i];
		}
		
		for(int j=mid,k=0; j<a.length; j++, k++) {
			right[k]=a[j];
		}
		
		merge(left);
		merge(right);
		int[] c=mergeSort(left, right, a);
		System.out.println("\nsorted array");
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i] + " ");
		}
 		
	}
	
	public static int[] mergeSort(int[]b, int[]c, int[]a) {
		int len1=b.length;
		int len2=c.length; 
		int i=0, j=0, k=0;
		while(i<len1 && j<len2) {
			if(b[i]<c[j]) {
				a[k]=b[i];
				i++;
			
			} else {
				a[k]=c[j];
				j++;
			}
			k++;
		}
		
		while(i<len1) {
			a[k]=b[i];
			k++; i++;
		}
		while(j<len2) {
			a[k]=c[j];
			k++; j++;
		}
		return a;
	}
}
